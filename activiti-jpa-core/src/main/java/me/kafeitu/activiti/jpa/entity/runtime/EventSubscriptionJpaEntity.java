package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RU_EVENT_SUBSCR")
public class EventSubscriptionJpaEntity extends EventSubscriptionEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "ACTIVITY_ID_")
	protected String activityId;

	@Column(name = "CONFIGURATION_")
	protected String configuration;

	@Column(name = "CREATED_")
	protected Timestamp created;

	@Column(name = "EVENT_NAME_")
	protected String eventName;

	@Column(name = "EVENT_TYPE_")
	protected String eventType;

	@Column(name = "PROC_INST_ID_")
	protected String procInstId;

	@Column(name = "REV_")
	protected Integer rev;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "EXECUTION_ID_")
	protected ExecutionJpaEntity execution;

	public EventSubscriptionJpaEntity() {
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	public ExecutionJpaEntity getActRuExecution() {
		return this.execution;
	}

	public void setActRuExecution(ExecutionJpaEntity actRuExecution) {
		this.execution = actRuExecution;
	}

}