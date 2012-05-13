package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;
import javax.persistence.*;

import me.kafeitu.activiti.jpa.entity.ge.JpaGeBytearray;

import java.math.BigDecimal;

/**
 * @author henryyan
 */
@Entity
@Table(name = "ACT_RU_VARIABLE")
public class JpaRuntimeVariable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	private BigDecimal double_;

	private BigDecimal long_;

	@Column(name = "NAME_")
	private String name;

	@Column(name = "REV_")
	private BigDecimal rev;

	@Column(name = "TASK_ID_")
	private String taskId;

	@Column(name = "TEXT_")
	private String text;

	@Column(name = "TEXT2_")
	private String text2;

	@Column(name = "TYPE_")
	private String type;

	// bi-directional many-to-one association to ActGeBytearray
	@ManyToOne
	@JoinColumn(name = "BYTEARRAY_ID_")
	private JpaGeBytearray geBytearray;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "EXECUTION_ID_")
	private JpaRuntimeExecution actRuExecution1;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "PROC_INST_ID_")
	private JpaRuntimeExecution actRuExecution2;

	public JpaRuntimeVariable() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getDouble_() {
		return this.double_;
	}

	public void setDouble_(BigDecimal double_) {
		this.double_ = double_;
	}

	public BigDecimal getLong_() {
		return this.long_;
	}

	public void setLong_(BigDecimal long_) {
		this.long_ = long_;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getRev() {
		return this.rev;
	}

	public void setRev(BigDecimal rev) {
		this.rev = rev;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText2() {
		return this.text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
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

	public JpaRuntimeExecution getActRuExecution1() {
		return this.actRuExecution1;
	}

	public void setActRuExecution1(JpaRuntimeExecution actRuExecution1) {
		this.actRuExecution1 = actRuExecution1;
	}

	public JpaRuntimeExecution getActRuExecution2() {
		return this.actRuExecution2;
	}

	public void setActRuExecution2(JpaRuntimeExecution actRuExecution2) {
		this.actRuExecution2 = actRuExecution2;
	}

}