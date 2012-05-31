package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import me.kafeitu.activiti.jpa.entity.repository.ProcessDefinitionJpaEntity;

import org.activiti.engine.impl.persistence.entity.TaskEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RU_TASK")
public class TaskJpaEntity extends TaskEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "ASSIGNEE_")
	protected String assignee;

	@Column(name = "CREATE_TIME_")
	protected Timestamp createTime;

	@Column(name = "DELEGATION_")
	protected String delegation;

	@Column(name = "DESCRIPTION_")
	protected String description;

	@Column(name = "DUE_DATE_")
	protected Timestamp dueDate;

	@Column(name = "NAME_")
	protected String name;

	@Column(name = "OWNER_")
	protected String owner;

	@Column(name = "PARENT_TASK_ID_")
	protected String parentTaskId;

	@Column(name = "PRIORITY_")
	protected Integer priority;

	@Column(name = "REV_")
	protected Integer rev;

	@Column(name = "TASK_DEF_KEY_")
	protected String taskDefKey;

	// bi-directional many-to-one association to ActRuIdentitylink
	@OneToMany(mappedBy = "task")
	protected List<IdentityLinkJpaEntity> identitylinks;

	// bi-directional many-to-one association to ActReProcdef
	@ManyToOne
	@JoinColumn(name = "PROC_DEF_ID_")
	protected ProcessDefinitionJpaEntity processDefinition;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "EXECUTION_ID_")
	protected ExecutionJpaEntity runtimeExecution;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "PROC_INST_ID_")
	protected ExecutionJpaEntity processInstance;

	public TaskJpaEntity() {
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

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getRev() {
		return rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	public String getTaskDefKey() {
		return taskDefKey;
	}

	public void setTaskDefKey(String taskDefKey) {
		this.taskDefKey = taskDefKey;
	}

	public List<IdentityLinkJpaEntity> getIdentitylinks() {
		return identitylinks;
	}

	public void setIdentitylinks(List<IdentityLinkJpaEntity> identitylinks) {
		this.identitylinks = identitylinks;
	}

	public ProcessDefinitionJpaEntity getProcessDefinition() {
		return processDefinition;
	}

	public void setProcessDefinition(ProcessDefinitionJpaEntity processDefinition) {
		this.processDefinition = processDefinition;
	}

	public ExecutionJpaEntity getRuntimeExecution() {
		return runtimeExecution;
	}

	public void setRuntimeExecution(ExecutionJpaEntity runtimeExecution) {
		this.runtimeExecution = runtimeExecution;
	}

	public void setProcessInstance(ExecutionJpaEntity processInstance) {
		this.processInstance = processInstance;
	}

}