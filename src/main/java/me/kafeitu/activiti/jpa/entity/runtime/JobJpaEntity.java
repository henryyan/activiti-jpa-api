package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import me.kafeitu.activiti.jpa.entity.ge.BytearrayJpaEntity;

import org.activiti.engine.impl.persistence.entity.JobEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RU_JOB")
public class JobJpaEntity extends JobEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "DUEDATE_")
	protected Timestamp duedate;

	@Column(name = "EXCEPTION_MSG_")
	protected String exceptionMsg;

	@Column(name = "EXCLUSIVE_")
	protected Integer exclusive;

	@Column(name = "EXECUTION_ID_")
	protected String executionId;

	@Column(name = "HANDLER_CFG_")
	protected String handlerCfg;

	@Column(name = "HANDLER_TYPE_")
	protected String handlerType;

	@Column(name = "LOCK_EXP_TIME_")
	protected Timestamp lockExpTime;

	@Column(name = "LOCK_OWNER_")
	protected String lockOwner;

	@Column(name = "PROCESS_INSTANCE_ID_")
	protected String processInstanceId;

	@Column(name = "REPEAT_")
	protected String repeat;

	@Column(name = "RETRIES_")
	protected Integer retries;

	@Column(name = "REV_")
	protected Integer rev;

	@Column(name = "TYPE_")
	protected String type;

	// bi-directional many-to-one association to ActGeBytearray
	@ManyToOne
	@JoinColumn(name = "EXCEPTION_STACK_ID_")
	protected BytearrayJpaEntity geBytearray;

	public JobJpaEntity() {
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

	public Integer getExclusive() {
		return this.exclusive;
	}

	public void setExclusive(Integer exclusive) {
		this.exclusive = exclusive;
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

	public String getRepeat() {
		return this.repeat;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

	public void setRetries(Integer retries) {
		this.retries = retries;
	}

	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BytearrayJpaEntity getGeBytearray() {
		return geBytearray;
	}

	public void setGeBytearray(BytearrayJpaEntity geBytearray) {
		this.geBytearray = geBytearray;
	}

}