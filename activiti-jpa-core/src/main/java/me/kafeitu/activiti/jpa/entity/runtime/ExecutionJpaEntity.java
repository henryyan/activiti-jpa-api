package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.ExecutionEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RU_EXECUTION")
public class ExecutionJpaEntity extends ExecutionEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "ACT_ID_")
	protected String activityId;

	@Column(name = "BUSINESS_KEY_")
	protected String businessKey;

	@Column(name = "IS_ACTIVE_")
	protected Boolean isActive;

	@Column(name = "IS_CONCURRENT_")
	protected Boolean isConcurrent;

	@Column(name = "IS_EVENT_SCOPE_")
	protected Boolean isEventScope;

	@Column(name = "IS_SCOPE_")
	protected Boolean isScope;

	@Column(name = "PROC_DEF_ID_")
	protected String processDefinitionId;

	@Column(name = "REV_")
	protected Integer rev;

	@Column(name = "SUSPENSION_STATE_")
	protected Integer suspensionState;

	@Column(name = "PROC_INST_ID_")
	protected String processInstanceId;

	@Column(name = "PARENT_ID_")
	protected String parentId;

	public ExecutionJpaEntity() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsConcurrent() {
		return isConcurrent;
	}

	public void setIsConcurrent(Boolean isConcurrent) {
		this.isConcurrent = isConcurrent;
	}

	public Boolean getIsEventScope() {
		return isEventScope;
	}

	public void setIsEventScope(Boolean isEventScope) {
		this.isEventScope = isEventScope;
	}

	public Boolean getIsScope() {
		return isScope;
	}

	public void setIsScope(Boolean isScope) {
		this.isScope = isScope;
	}

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public Integer getRev() {
		return rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	public int getSuspensionState() {
		return suspensionState;
	}

	public void setSuspensionState(int suspensionState) {
		this.suspensionState = suspensionState;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}