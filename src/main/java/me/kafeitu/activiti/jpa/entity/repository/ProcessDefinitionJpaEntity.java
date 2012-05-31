package me.kafeitu.activiti.jpa.entity.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RE_PROCDEF")
public class ProcessDefinitionJpaEntity extends ProcessDefinitionEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "CATEGORY_")
	protected String category;

	@Column(name = "DEPLOYMENT_ID_")
	protected String deploymentId;

	@Column(name = "DGRM_RESOURCE_NAME_")
	protected String dgrmResourceName;

	@Column(name = "HAS_START_FORM_KEY_")
	protected Boolean hasStartFormKey;

	@Column(name = "KEY_")
	protected String key;

	@Column(name = "NAME_")
	protected String name;

	@Column(name = "RESOURCE_NAME_")
	protected String resourceName;

	@Column(name = "REV_")
	protected Integer rev;

	@Column(name = "SUSPENSION_STATE_")
	protected Integer suspensionState;

	@Column(name = "VERSION_")
	protected Integer version;

	public ProcessDefinitionJpaEntity() {
	}

	public String getDgrmResourceName() {
		return this.dgrmResourceName;
	}

	public void setDgrmResourceName(String dgrmResourceName) {
		this.dgrmResourceName = dgrmResourceName;
	}

	public void setHasStartFormKey(Boolean hasStartFormKey) {
		this.hasStartFormKey = hasStartFormKey;
	}

	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	public void setSuspensionState(Integer suspensionState) {
		this.suspensionState = suspensionState;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}

}