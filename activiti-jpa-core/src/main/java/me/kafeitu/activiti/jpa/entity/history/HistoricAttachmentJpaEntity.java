package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.HistoricActivityInstanceEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_HI_ATTACHMENT")
public class HistoricAttachmentJpaEntity extends HistoricActivityInstanceEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "CONTENT_ID_")
	protected String contentId;

	@Column(name = "DESCRIPTION_")
	protected String description;

	@Column(name = "NAME_")
	protected String name;

	@Column(name = "PROC_INST_ID_")
	protected String procInstId;

	@Column(name = "REV_")
	protected Integer rev;

	@Column(name = "TASK_ID_")
	protected String taskId;

	@Column(name = "TYPE_")
	protected String type;

	@Column(name = "URL_")
	protected String url;

	@Column(name = "USER_ID_")
	protected String userId;

	public HistoricAttachmentJpaEntity() {
	}

	public String getContentId() {
		return this.contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}