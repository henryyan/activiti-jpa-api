package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_HI_TASKINST")
public class JpaHistoricTaskInstance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "ASSIGNEE_")
	private String assignee;

	@Column(name = "DELETE_REASON_")
	private String deleteReason;

	@Column(name = "DESCRIPTION_")
	private String description;

	@Column(name = "DUE_DATE_")
	private Timestamp dueDate;

	@Column(name = "DURATION_")
	private Float duration;

	@Column(name = "END_TIME_")
	private Timestamp endTime;

	@Column(name = "EXECUTION_ID_")
	private String executionId;

	@Column(name = "NAME_")
	private String name;

	@Column(name = "OWNER_")
	private String owner;

	@Column(name = "PARENT_TASK_ID_")
	private String parentTaskId;

	@Column(name = "PRIORITY_")
	private BigDecimal priority;

	@Column(name = "PROC_DEF_ID_")
	private String procDefId;

	@Column(name = "PROC_INST_ID_")
	private String procInstId;

	@Column(name = "START_TIME_")
	private Timestamp startTime;

	@Column(name = "TASK_DEF_KEY_")
	private String taskDefKey;

	public JpaHistoricTaskInstance() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getDeleteReason() {
		return this.deleteReason;
	}

	public void setDeleteReason(String deleteReason) {
		this.deleteReason = deleteReason;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDueDate() {
		return this.dueDate;
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

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getParentTaskId() {
		return this.parentTaskId;
	}

	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public BigDecimal getPriority() {
		return this.priority;
	}

	public void setPriority(BigDecimal priority) {
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