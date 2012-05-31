package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.IdentityLinkEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RU_IDENTITYLINK")
public class IdentityLinkJpaEntity extends IdentityLinkEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "GROUP_ID_")
	protected String groupId;

	@Column(name = "REV_")
	protected Integer rev;

	@Column(name = "TYPE_")
	protected String type;

	@Column(name = "USER_ID_")
	protected String userId;

	// bi-directional many-to-one association to ActRuTask
	@ManyToOne
	@JoinColumn(name = "TASK_ID_")
	protected TaskJpaEntity task;

	public IdentityLinkJpaEntity() {
	}

	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	public void setActTask(TaskJpaEntity task) {
		this.task = task;
	}

}