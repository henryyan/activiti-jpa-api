package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;
import javax.persistence.*;

import me.kafeitu.activiti.jpa.entity.ge.JpaGeBytearray;

import java.sql.Timestamp;
import java.math.BigDecimal;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RU_JOB")
public class JpaRuntimeJob implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "DUEDATE_")
	private Timestamp duedate;

	@Column(name = "EXCEPTION_MSG_")
	private String exceptionMsg;

	@Column(name = "EXCLUSIVE_")
	private BigDecimal exclusive;

	@Column(name = "EXECUTION_ID_")
	private String executionId;

	@Column(name = "HANDLER_CFG_")
	private String handlerCfg;

	@Column(name = "HANDLER_TYPE_")
	private String handlerType;

	@Column(name = "LOCK_EXP_TIME_")
	private Timestamp lockExpTime;

	@Column(name = "LOCK_OWNER_")
	private String lockOwner;

	@Column(name = "PROCESS_INSTANCE_ID_")
	private String processInstanceId;

	@Column(name = "REPEAT_")
	private String repeat;

	@Column(name = "RETRIES_")
	private BigDecimal retries;

	@Column(name = "REV_")
	private BigDecimal rev;

	@Column(name = "TYPE_")
	private String type;

	// bi-directional many-to-one association to ActGeBytearray
	@ManyToOne
	@JoinColumn(name = "EXCEPTION_STACK_ID_")
	private JpaGeBytearray geBytearray;

	public JpaRuntimeJob() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getDuedate() {
		return this.duedate;
	}

	public void setDuedate(Timestamp duedate) {
		this.duedate = duedate;
	}

	public String getExceptionMsg() {
		return this.exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public BigDecimal getExclusive() {
		return this.exclusive;
	}

	public void setExclusive(BigDecimal exclusive) {
		this.exclusive = exclusive;
	}

	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getHandlerCfg() {
		return this.handlerCfg;
	}

	public void setHandlerCfg(String handlerCfg) {
		this.handlerCfg = handlerCfg;
	}

	public String getHandlerType() {
		return this.handlerType;
	}

	public void setHandlerType(String handlerType) {
		this.handlerType = handlerType;
	}

	public Timestamp getLockExpTime() {
		return this.lockExpTime;
	}

	public void setLockExpTime(Timestamp lockExpTime) {
		this.lockExpTime = lockExpTime;
	}

	public String getLockOwner() {
		return this.lockOwner;
	}

	public void setLockOwner(String lockOwner) {
		this.lockOwner = lockOwner;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getRepeat() {
		return this.repeat;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

	public BigDecimal getRetries() {
		return this.retries;
	}

	public void setRetries(BigDecimal retries) {
		this.retries = retries;
	}

	public BigDecimal getRev() {
		return this.rev;
	}

	public void setRev(BigDecimal rev) {
		this.rev = rev;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public JpaGeBytearray getGeBytearray() {
		return geBytearray;
	}

	public void setGeBytearray(JpaGeBytearray geBytearray) {
		this.geBytearray = geBytearray;
	}


}