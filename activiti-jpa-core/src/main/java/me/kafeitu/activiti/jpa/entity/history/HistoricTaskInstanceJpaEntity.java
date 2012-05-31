package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.HistoricTaskInstanceEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_HI_TASKINST")
public class HistoricTaskInstanceJpaEntity extends HistoricTaskInstanceEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "ASSIGNEE_")
	protected String assignee;

	@Column(name = "DELETE_REASON_")
	protected String deleteReason;

	@Column(name = "DESCRIPTION_")
	protected String description;

	@Column(name = "DUE_DATE_")
	protected Timestamp dueDate;

	@Column(name = "DURATION_")
	protected Float duration;

	@Column(name = "END_TIME_")
	protected Timestamp endTime;

	@Column(name = "EXECUTION_ID_")
	protected String executionId;

	@Column(name = "NAME_")
	protected String name;

	@Column(name = "OWNER_")
	protected String owner;

	@Column(name = "PARENT_TASK_ID_")
	protected String parentTaskId;

	@Column(name = "PRIORITY_")
	protected Integer priority;

	@Column(name = "PROC_DEF_ID_")
	protected String procDefId;

	@Column(name = "PROC_INST_ID_")
	protected String procInstId;

	@Column(name = "START_TIME_")
	protected Timestamp startTime;

	@Column(name = "TASK_DEF_KEY_")
	protected String taskDefKey;

	public HistoricTaskInstanceJpaEntity() {
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public Float getDuration() {
		return this.duration;
	}

	public void setDuration(Float duration) {
		this.duration = duration;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getProcDefId() {
		return this.procDefId;
	}

	public void setProcDefId(String procDefId) {
		this.procDefId = procDefId;
	}

	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public String getTaskDefKey() {
		return this.taskDefKey;
	}

	public void setTaskDefKey(String taskDefKey) {
		this.taskDefKey = taskDefKey;
	}

}