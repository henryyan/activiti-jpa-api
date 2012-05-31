package me.kafeitu.activiti.jpa.entity.identify;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.UserEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_ID_USER")
public class UserJpaEntity extends UserEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "EMAIL_")
	protected String email;

	@Column(name = "FIRST_")
	protected String first;

	@Column(name = "LAST_")
	protected String last;

	@Column(name = "PICTURE_ID_")
	protected String pictureId;

	@Column(name = "PWD_")
	protected String pwd;

	@Column(name = "REV_")
	protected Integer rev;

	// bi-directional many-to-many association to ActIdGroup
	@ManyToMany
	@JoinTable(name = "ACT_ID_MEMBERSHIP", joinColumns = { @JoinColumn(name = "USER_ID_") }, inverseJoinColumns = { @JoinColumn(name = "GROUP_ID_") })
	protected List<GroupJpaEntity> groups;

	public UserJpaEntity() {
	}

	public String getFirst() {
		return this.first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return this.last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getPictureId() {
		return this.pictureId;
	}

	public void setPictureId(String pictureId) {
		this.pictureId = pictureId;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	public List<GroupJpaEntity> getGroups() {
		return groups;
	}

	public void setGroups(List<GroupJpaEntity> idGroups) {
		this.groups = idGroups;
	}

}