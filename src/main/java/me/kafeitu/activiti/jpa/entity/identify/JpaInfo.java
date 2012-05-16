package me.kafeitu.activiti.jpa.entity.identify;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_ID_INFO")
public class JpaInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "KEY_")
	private String key;

	@Column(name = "PARENT_ID_")
	private String parentId;

	@Lob()
	@Column(name = "PASSWORD_")
	private byte[] password;

	@Column(name = "REV_")
	private BigDecimal rev;

	@Column(name = "TYPE_")
	private String type;

	@Column(name = "USER_ID_")
	private String userId;

	@Column(name = "VALUE_")
	private String value;

	public JpaInfo() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public byte[] getPassword() {
		return this.password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public BigDecimal getRev() {
		return this.rev;
	}

	public void setRev(BigDecimal rev) {
		this.rev = rev;
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

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}