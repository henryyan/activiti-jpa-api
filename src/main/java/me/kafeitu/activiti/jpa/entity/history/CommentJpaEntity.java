package me.kafeitu.activiti.jpa.entity.history;

import java.io.Serializable;
import javax.persistence.*;

import org.activiti.engine.impl.persistence.entity.CommentEntity;

import java.sql.Timestamp;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_HI_COMMENT")
public class CommentJpaEntity extends CommentEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "ACTION_")
	protected String action;

	@Lob()
	@Column(name = "FULL_MSG_")
	protected byte[] fullMsg;

	@Column(name = "MESSAGE_")
	protected String message;

	@Column(name = "PROC_INST_ID_")
	protected String procInstId;

	@Column(name = "TASK_ID_")
	protected String taskId;

	@Column(name = "TIME_")
	protected Timestamp time;

	@Column(name = "TYPE_")
	protected String type;

	@Column(name = "USER_ID_")
	protected String userId;

	public CommentJpaEntity() {
	}

	public byte[] getFullMsg() {
		return this.fullMsg;
	}

	public void setFullMsg(byte[] fullMsg) {
		this.fullMsg = fullMsg;
	}

	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}