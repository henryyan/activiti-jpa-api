package me.kafeitu.activiti.jpa.entity.identify;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.IdentityInfoEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_ID_INFO")
public class IdentityInfoJpaEntity extends IdentityInfoEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "KEY_")
	protected String key;

	@Column(name = "PARENT_ID_")
	protected String parentId;

	@Column(name = "REV_")
	protected Integer rev;

	@Column(name = "TYPE_")
	protected String type;

	@Column(name = "USER_ID_")
	protected String userId;

	@Column(name = "VALUE_")
	protected String value;

	public IdentityInfoJpaEntity() {
	}

	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

}