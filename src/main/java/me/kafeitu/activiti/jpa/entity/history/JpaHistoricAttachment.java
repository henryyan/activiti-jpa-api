package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author henryyan
 */
@Entity
@Table(name = "ACT_HI_ATTACHMENT")
public class JpaHistoricAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "CONTENT_ID_")
	private String contentId;

	@Column(name = "DESCRIPTION_")
	private String description;

	@Column(name = "NAME_")
	private String name;

	@Column(name = "PROC_INST_ID_")
	private String procInstId;

	@Column(name = "REV_")
	private Integer rev;

	@Column(name = "TASK_ID_")
	private String taskId;

	@Column(name = "TYPE_")
	private String type;

	@Column(name = "URL_")
	private String url;

	@Column(name = "USER_ID_")
	private String userId;

	public JpaHistoricAttachment() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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