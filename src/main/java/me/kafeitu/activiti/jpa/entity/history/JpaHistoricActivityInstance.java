package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;

/**
 * @author henryyan
 */
@Entity
@Table(name = "ACT_HI_ACTINST")
public class JpaHistoricActivityInstance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "ACT_ID_")
	private String actId;

	@Column(name = "ACT_NAME_")
	private String actName;

	@Column(name = "ACT_TYPE_")
	private String actType;

	@Column(name = "ASSIGNEE_")
	private String assignee;

	@Column(name = "DURATION_")
	private BigDecimal duration;

	@Column(name = "END_TIME_")
	private Timestamp endTime;

	@Column(name = "EXECUTION_ID_")
	private String executionId;

	@Column(name = "PROC_DEF_ID_")
	private String procDefId;

	@Column(name = "PROC_INST_ID_")
	private String procInstId;

	@Column(name = "START_TIME_")
	private Timestamp startTime;

	public JpaHistoricActivityInstance() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public BigDecimal getDuration() {
		return this.duration;
	}

	public void setDuration(BigDecimal duration) {
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

}