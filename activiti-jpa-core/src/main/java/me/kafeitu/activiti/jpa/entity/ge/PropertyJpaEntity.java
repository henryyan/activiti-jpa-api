package me.kafeitu.activiti.jpa.entity.ge;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.PropertyEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_GE_PROPERTY")
public class PropertyJpaEntity extends PropertyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "NAME_")
	protected String name;

	@Column(name = "REV_")
	private Integer rev;

	@Column(name = "VALUE_")
	protected String value;

	public PropertyJpaEntity() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

}