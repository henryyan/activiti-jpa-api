package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import me.kafeitu.activiti.jpa.entity.repository.JpaProcessDefinition;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RU_TASK")
public class JpaRuntimeTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "ASSIGNEE_")
	private String assignee;

	@Column(name = "CREATE_TIME_")
	private Timestamp createTime;

	@Column(name = "DELEGATION_")
	private String delegation;

	@Column(name = "DESCRIPTION_")
	private String description;

	@Column(name = "DUE_DATE_")
	private Timestamp dueDate;

	@Column(name = "NAME_")
	private String name;

	@Column(name = "OWNER_")
	private String owner;

	@Column(name = "PARENT_TASK_ID_")
	private String parentTaskId;

	@Column(name = "PRIORITY_")
	private BigDecimal priority;

	@Column(name = "REV_")
	private BigDecimal rev;

	@Column(name = "TASK_DEF_KEY_")
	private String taskDefKey;

	// bi-directional many-to-one association to ActRuIdentitylink
	@OneToMany(mappedBy = "task")
	private List<JpaRuntimeIdentitylink> identitylinks;

	// bi-directional many-to-one association to ActReProcdef
	@ManyToOne
	@JoinColumn(name = "PROC_DEF_ID_")
	private JpaProcessDefinition processDefinition;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "EXECUTION_ID_")
	private JpaRuntimeExecution runtimeExecution;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "PROC_INST_ID_")
	private JpaRuntimeExecution processInstance;

	public JpaRuntimeTask() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getDelegation() {
		return delegation;
	}

	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDueDate() {
		return dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getParentTaskId() {
		return parentTaskId;
	}

	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public BigDecimal getPriority() {
		return priority;
	}

	public void setPriority(BigDecimal priority) {
		this.priority = priority;
	}

	public BigDecimal getRev() {
		return rev;
	}

	public void setRev(BigDecimal rev) {
		this.rev = rev;
	}

	public String getTaskDefKey() {
		return taskDefKey;
	}

	public void setTaskDefKey(String taskDefKey) {
		this.taskDefKey = taskDefKey;
	}

	public List<JpaRuntimeIdentitylink> getIdentitylinks() {
		return identitylinks;
	}

	public void setIdentitylinks(List<JpaRuntimeIdentitylink> identitylinks) {
		this.identitylinks = identitylinks;
	}

	public JpaProcessDefinition getProcessDefinition() {
		return processDefinition;
	}

	public void setProcessDefinition(JpaProcessDefinition processDefinition) {
		this.processDefinition = processDefinition;
	}

	public JpaRuntimeExecution getRuntimeExecution() {
		return runtimeExecution;
	}

	public void setRuntimeExecution(JpaRuntimeExecution runtimeExecution) {
		this.runtimeExecution = runtimeExecution;
	}

	public JpaRuntimeExecution getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(JpaRuntimeExecution processInstance) {
		this.processInstance = processInstance;
	}

}