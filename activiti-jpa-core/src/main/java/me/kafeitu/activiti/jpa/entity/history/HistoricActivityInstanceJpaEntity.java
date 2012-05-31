package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.HistoricActivityInstanceEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_HI_ACTINST")
public class HistoricActivityInstanceJpaEntity extends HistoricActivityInstanceEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "ACT_ID_")
	protected String actId;

	@Column(name = "ACT_NAME_")
	protected String actName;

	@Column(name = "ACT_TYPE_")
	protected String actType;

	@Column(name = "ASSIGNEE_")
	protected String assignee;

	@Column(name = "DURATION_")
	protected Long duration;

	@Column(name = "END_TIME_")
	protected Timestamp endTime;

	@Column(name = "EXECUTION_ID_")
	protected String executionId;

	@Column(name = "PROC_DEF_ID_")
	protected String procDefId;

	@Column(name = "PROC_INST_ID_")
	protected String procInstId;

	@Column(name = "START_TIME_")
	protected Timestamp startTime;

	public HistoricActivityInstanceJpaEntity() {
	}

	public String getActId() {
		return this.actId;
	}

	public void setActId(String actId) {
		this.actId = actId;
	}

	public String getActName() {
		return this.actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public String getActType() {
		return this.actType;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
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

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

}