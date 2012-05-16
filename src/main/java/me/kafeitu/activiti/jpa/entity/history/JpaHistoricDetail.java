package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_HI_DETAIL")
public class JpaHistoricDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "ACT_INST_ID_")
	private String actInstId;

	@Column(name = "BYTEARRAY_ID_")
	private String bytearrayId;

	private BigDecimal double_;

	@Column(name = "EXECUTION_ID_")
	private String executionId;

	private Long longValue;

	@Column(name = "NAME_")
	private String name;

	@Column(name = "PROC_INST_ID_")
	private String procInstId;

	@Column(name = "REV_")
	private BigDecimal rev;

	@Column(name = "TASK_ID_")
	private String taskId;

	@Column(name = "TEXT_")
	private String textFirstValue;

	@Column(name = "TEXT2_")
	private String textSecondValue;

	@Column(name = "TIME_")
	private Timestamp time;

	@Column(name = "TYPE_")
	private String type;

	@Column(name = "VAR_TYPE_")
	private String varType;

	public JpaHistoricDetail() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
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

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
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

	public Timestamp getTime() {
		return time;
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