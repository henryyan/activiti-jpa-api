package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author henryyan
 */
@Entity
@Table(name = "ACT_HI_COMMENT")
public class JpaHistoricComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "ACTION_")
	private String action;

	@Lob()
	@Column(name = "FULL_MSG_")
	private byte[] fullMsg;

	@Column(name = "MESSAGE_")
	private String message;

	@Column(name = "PROC_INST_ID_")
	private String procInstId;

	@Column(name = "TASK_ID_")
	private String taskId;

	@Column(name = "TIME_")
	private Timestamp time;

	@Column(name = "TYPE_")
	private String type;

	@Column(name = "USER_ID_")
	private String userId;

	public JpaHistoricComment() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public byte[] getFullMsg() {
		return this.fullMsg;
	}

	public void setFullMsg(byte[] fullMsg) {
		this.fullMsg = fullMsg;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}