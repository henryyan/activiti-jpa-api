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

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RU_EXECUTION")
public class JpaRuntimeExecution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "ACT_ID_")
	private String actId;

	@Column(name = "BUSINESS_KEY_")
	private String businessKey;

	@Column(name = "IS_ACTIVE_")
	private Boolean isActive;

	@Column(name = "IS_CONCURRENT_")
	private Boolean isConcurrent;

	@Column(name = "IS_EVENT_SCOPE_")
	private Boolean isEventScope;

	@Column(name = "IS_SCOPE_")
	private Boolean isScope;

	@Column(name = "PROC_DEF_ID_")
	private String procDefId;

	@Column(name = "REV_")
	private Integer rev;

	@Column(name = "SUSPENSION_STATE_")
	private Integer suspensionState;

	// bi-directional many-to-one association to ActRuEventSubscr
	@OneToMany(mappedBy = "execution")
	private List<JpaRuntimeEventSubscr> actRuEventSubscrs;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "SUPER_EXEC_")
	private JpaRuntimeExecution superExecution;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "PROC_INST_ID_")
	private JpaRuntimeExecution processInstance;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "PARENT_ID_")
	private JpaRuntimeExecution parent;

	public JpaRuntimeExecution() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActId() {
		return actId;
	}

	public void setActId(String actId) {
		this.actId = actId;
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

	public Integer getSuspensionState() {
		return suspensionState;
	}

	public void setSuspensionState(Integer suspensionState) {
		this.suspensionState = suspensionState;
	}

	public List<JpaRuntimeEventSubscr> getActRuEventSubscrs() {
		return actRuEventSubscrs;
	}

	public void setActRuEventSubscrs(List<JpaRuntimeEventSubscr> actRuEventSubscrs) {
		this.actRuEventSubscrs = actRuEventSubscrs;
	}

	public JpaRuntimeExecution getSuperExecution() {
		return superExecution;
	}

	public void setSuperExecution(JpaRuntimeExecution superExecution) {
		this.superExecution = superExecution;
	}

	public JpaRuntimeExecution getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(JpaRuntimeExecution processInstance) {
		this.processInstance = processInstance;
	}

	public JpaRuntimeExecution getParent() {
		return parent;
	}

	public void setParent(JpaRuntimeExecution parent) {
		this.parent = parent;
	}

}