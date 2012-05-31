package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;
import javax.persistence.*;

import org.activiti.engine.impl.persistence.entity.HistoricDetailEntity;

import java.sql.Timestamp;
import java.math.BigDecimal;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_HI_DETAIL")
public class HistoricDetailJpaEntity extends HistoricDetailEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "ACT_INST_ID_")
	protected String actInstId;

	@Column(name = "BYTEARRAY_ID_")
	protected String bytearrayId;

	protected BigDecimal double_;

	@Column(name = "EXECUTION_ID_")
	protected String executionId;

	protected Long longValue;

	@Column(name = "NAME_")
	protected String name;

	@Column(name = "PROC_INST_ID_")
	protected String procInstId;

	@Column(name = "REV_")
	protected BigDecimal rev;

	@Column(name = "TASK_ID_")
	protected String taskId;

	@Column(name = "TEXT_")
	protected String textFirstValue;

	@Column(name = "TEXT2_")
	protected String textSecondValue;

	@Column(name = "TIME_")
	protected Timestamp time;

	@Column(name = "TYPE_")
	protected String type;

	@Column(name = "VAR_TYPE_")
	protected String varType;

	public HistoricDetailJpaEntity() {
	}

	public String getActInstId() {
		return actInstId;
	}

	public void setActInstId(String actInstId) {
		this.actInstId = actInstId;
	}

	public String getBytearrayId() {
		return bytearrayId;
	}

	public void setBytearrayId(String bytearrayId) {
		this.bytearrayId = bytearrayId;
	}

	public BigDecimal getDouble_() {
		return double_;
	}

	public void setDouble_(BigDecimal double_) {
		this.double_ = double_;
	}

	public Long getLongValue() {
		return longValue;
	}

	public void setLongValue(Long longValue) {
		this.longValue = longValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	public BigDecimal getRev() {
		return rev;
	}

	public void setRev(BigDecimal rev) {
		this.rev = rev;
	}

	public String getTextFirstValue() {
		return textFirstValue;
	}

	public void setTextFirstValue(String textFirstValue) {
		this.textFirstValue = textFirstValue;
	}

	public String getTextSecondValue() {
		return textSecondValue;
	}

	public void setTextSecondValue(String textSecondValue) {
		this.textSecondValue = textSecondValue;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVarType() {
		return varType;
	}

	public void setVarType(String varType) {
		this.varType = varType;
	}

}