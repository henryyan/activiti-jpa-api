package me.kafeitu.activiti.jpa.entity.runtime;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RU_EVENT_SUBSCR")
public class JpaRuntimeEventSubscr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "ACTIVITY_ID_")
	private String activityId;

	@Column(name = "CONFIGURATION_")
	private String configuration;

	@Column(name = "CREATED_")
	private Timestamp created;

	@Column(name = "EVENT_NAME_")
	private String eventName;

	@Column(name = "EVENT_TYPE_")
	private String eventType;

	@Column(name = "PROC_INST_ID_")
	private String procInstId;

	@Column(name = "REV_")
	private Integer rev;

	// bi-directional many-to-one association to ActRuExecution
	@ManyToOne
	@JoinColumn(name = "EXECUTION_ID_")
	private JpaRuntimeExecution execution;

	public JpaRuntimeEventSubscr() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
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

	public JpaRuntimeExecution getActRuExecution() {
		return this.execution;
	}

	public void setActRuExecution(JpaRuntimeExecution actRuExecution) {
		this.execution = actRuExecution;
	}

}