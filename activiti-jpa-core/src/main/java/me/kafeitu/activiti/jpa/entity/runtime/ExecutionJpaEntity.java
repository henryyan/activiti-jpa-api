package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	protected String actId;

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
	protected String procDefId;

	@Column(name = "REV_")
	protected Integer rev;

	@Column(name = "SUSPENSION_STATE_")
	protected Integer suspensionState;

	// bi-directional many-to-one association to ActRuEventSubscr
	@OneToMany(mappedBy = "execution")
	protected List<EventSubscriptionJpaEntity> actRuEventSubscrs;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "SUPER_EXEC_")
	protected ExecutionJpaEntity superExecution;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "PROC_INST_ID_")
	protected ExecutionJpaEntity processInstance;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "PARENT_ID_")
	protected ExecutionJpaEntity parent;

	public ExecutionJpaEntity() {
	}

	public String getActId() {
		return actId;
	}

	public void setActId(String actId) {
		this.actId = actId;
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

	public String getProcDefId() {
		return procDefId;
	}

	public void setProcDefId(String procDefId) {
		this.procDefId = procDefId;
	}

	public Integer getRev() {
		return rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	public void setSuspensionState(Integer suspensionState) {
		this.suspensionState = suspensionState;
	}

	public List<EventSubscriptionJpaEntity> getActRuEventSubscrs() {
		return actRuEventSubscrs;
	}

	public void setActRuEventSubscrs(List<EventSubscriptionJpaEntity> actRuEventSubscrs) {
		this.actRuEventSubscrs = actRuEventSubscrs;
	}

	public void setSuperExecution(ExecutionJpaEntity superExecution) {
		this.superExecution = superExecution;
	}

	public void setProcessInstance(ExecutionJpaEntity processInstance) {
		this.processInstance = processInstance;
	}

	public void setParent(ExecutionJpaEntity parent) {
		this.parent = parent;
	}

}