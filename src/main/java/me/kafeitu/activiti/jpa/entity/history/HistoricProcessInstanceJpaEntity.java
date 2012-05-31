package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.HistoricProcessInstanceEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_HI_PROCINST")
public class HistoricProcessInstanceJpaEntity extends HistoricProcessInstanceEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "BUSINESS_KEY_")
	protected String businessKey;

	@Column(name = "DELETE_REASON_")
	protected String deleteReason;

	@Column(name = "DURATION_")
	protected Float duration;

	@Column(name = "END_ACT_ID_")
	protected String endActId;

	@Column(name = "END_TIME_")
	protected Timestamp endTime;

	@Column(name = "PROC_DEF_ID_")
	protected String procDefId;

	@Column(name = "PROC_INST_ID_")
	protected String procInstId;

	@Column(name = "START_ACT_ID_")
	protected String startActId;

	@Column(name = "START_TIME_")
	protected Timestamp startTime;

	@Column(name = "START_USER_ID_")
	protected String startUserId;

	@Column(name = "SUPER_PROCESS_INSTANCE_ID_")
	protected String superProcessInstanceId;

	public HistoricProcessInstanceJpaEntity() {
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

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

}