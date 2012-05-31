package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import me.kafeitu.activiti.jpa.entity.ge.BytearrayJpaEntity;

import org.activiti.engine.impl.persistence.entity.VariableInstanceEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RU_VARIABLE")
public class VariableInstanceJpaEntity extends VariableInstanceEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "NAME_")
	protected String name;

	@Column(name = "REV_")
	protected Integer rev;

	@Column(name = "TASK_ID_")
	protected String taskId;

	// bi-directional many-to-one association to ActGeBytearray
	@ManyToOne
	@JoinColumn(name = "BYTEARRAY_ID_")
	protected BytearrayJpaEntity geBytearray;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "EXECUTION_ID_")
	protected ExecutionJpaEntity actRuExecution1;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "PROC_INST_ID_")
	protected ExecutionJpaEntity actRuExecution2;

	public VariableInstanceJpaEntity() {
	}

	public BytearrayJpaEntity getGeBytearray() {
		return geBytearray;
	}

	public void setGeBytearray(BytearrayJpaEntity geBytearray) {
		this.geBytearray = geBytearray;
	}

	public ExecutionJpaEntity getActRuExecution1() {
		return this.actRuExecution1;
	}

	public void setActRuExecution1(ExecutionJpaEntity actRuExecution1) {
		this.actRuExecution1 = actRuExecution1;
	}

	public ExecutionJpaEntity getActRuExecution2() {
		return this.actRuExecution2;
	}

	public void setActRuExecution2(ExecutionJpaEntity actRuExecution2) {
		this.actRuExecution2 = actRuExecution2;
	}

}