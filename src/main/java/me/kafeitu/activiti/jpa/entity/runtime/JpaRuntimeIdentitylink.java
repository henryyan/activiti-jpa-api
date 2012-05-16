package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RU_IDENTITYLINK")
public class JpaRuntimeIdentitylink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "GROUP_ID_")
	private String groupId;

	@Column(name = "REV_")
	private Integer rev;

	@Column(name = "TYPE_")
	private String type;

	@Column(name = "USER_ID_")
	private String userId;

	// bi-directional many-to-one association to ActRuTask
	@ManyToOne
	@JoinColumn(name = "TASK_ID_")
	private JpaRuntimeTask task;

	public JpaRuntimeIdentitylink() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public JpaRuntimeTask getTask() {
		return this.task;
	}

	public void setActTask(JpaRuntimeTask task) {
		this.task = task;
	}

}