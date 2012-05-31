package me.kafeitu.activiti.jpa.entity.identify;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.GroupEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_ID_GROUP")
public class GroupJpaEntity extends GroupEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "NAME_")
	protected String name;

	@Column(name = "REV_")
	protected Integer rev;

	@Column(name = "TYPE_")
	protected String type;

	public GroupJpaEntity() {
	}

	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

}