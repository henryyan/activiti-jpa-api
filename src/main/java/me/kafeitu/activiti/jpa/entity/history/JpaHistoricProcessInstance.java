package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author henryyan
 */
@Entity
@Table(name = "ACT_HI_PROCINST")
public class JpaHistoricProcessInstance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "BUSINESS_KEY_")
	private String businessKey;

	@Column(name = "DELETE_REASON_")
	private String deleteReason;

	@Column(name = "DURATION_")
	private Float duration;

	@Column(name = "END_ACT_ID_")
	private String endActId;

	@Column(name = "END_TIME_")
	private Timestamp endTime;

	@Column(name = "PROC_DEF_ID_")
	private String procDefId;

	@Column(name = "PROC_INST_ID_")
	private String procInstId;

	@Column(name = "START_ACT_ID_")
	private String startActId;

	@Column(name = "START_TIME_")
	private Timestamp startTime;

	@Column(name = "START_USER_ID_")
	private String startUserId;

	@Column(name = "SUPER_PROCESS_INSTANCE_ID_")
	private String superProcessInstanceId;

	public JpaHistoricProcessInstance() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusinessKey() {
		return this.businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getDeleteReason() {
		return this.deleteReason;
	}

	public void setDeleteReason(String deleteReason) {
		this.deleteReason = deleteReason;
	}

	public Float getDuration() {
		return this.duration;
	}

	public void setDuration(Float duration) {
		this.duration = duration;
	}

	public String getEndActId() {
		return this.endActId;
	}

	public void setEndActId(String endActId) {
		this.endActId = endActId;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
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

	public String getStartActId() {
		return this.startActId;
	}

	public void setStartActId(String startActId) {
		this.startActId = startActId;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public String getStartUserId() {
		return this.startUserId;
	}

	public void setStartUserId(String startUserId) {
		this.startUserId = startUserId;
	}

	public String getSuperProcessInstanceId() {
		return this.superProcessInstanceId;
	}

	public void setSuperProcessInstanceId(String superProcessInstanceId) {
		this.superProcessInstanceId = superProcessInstanceId;
	}

}