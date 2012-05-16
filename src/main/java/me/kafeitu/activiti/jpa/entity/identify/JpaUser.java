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

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_ID_USER")
public class JpaUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "EMAIL_")
	private String email;

	@Column(name = "FIRST_")
	private String first;

	@Column(name = "LAST_")
	private String last;

	@Column(name = "PICTURE_ID_")
	private String pictureId;

	@Column(name = "PWD_")
	private String pwd;

	@Column(name = "REV_")
	private Integer rev;

	// bi-directional many-to-many association to ActIdGroup
	@ManyToMany
	@JoinTable(name = "ACT_ID_MEMBERSHIP", joinColumns = { @JoinColumn(name = "USER_ID_") }, inverseJoinColumns = { @JoinColumn(name = "GROUP_ID_") })
	private List<JpaGroup> idGroups;

	public JpaUser() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<JpaGroup> getIdGroups() {
		return idGroups;
	}

	public void setIdGroups(List<JpaGroup> idGroups) {
		this.idGroups = idGroups;
	}

}