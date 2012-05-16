package me.kafeitu.activiti.jpa.entity.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RE_PROCDEF")
public class JpaProcessDefinition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "CATEGORY_")
	private String category;

	@Column(name = "DEPLOYMENT_ID_")
	private String deploymentId;

	@Column(name = "DGRM_RESOURCE_NAME_")
	private String dgrmResourceName;

	@Column(name = "HAS_START_FORM_KEY_")
	private Integer hasStartFormKey;

	@Column(name = "KEY_")
	private String key;

	@Column(name = "NAME_")
	private String name;

	@Column(name = "RESOURCE_NAME_")
	private String resourceName;

	@Column(name = "REV_")
	private Integer rev;

	@Column(name = "SUSPENSION_STATE_")
	private Integer suspensionState;

	@Column(name = "VERSION_")
	private Integer version;

	public JpaProcessDefinition() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public String getDgrmResourceName() {
		return this.dgrmResourceName;
	}

	public void setDgrmResourceName(String dgrmResourceName) {
		this.dgrmResourceName = dgrmResourceName;
	}

	public Integer getHasStartFormKey() {
		return this.hasStartFormKey;
	}

	public void setHasStartFormKey(Integer hasStartFormKey) {
		this.hasStartFormKey = hasStartFormKey;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	public Integer getSuspensionState() {
		return this.suspensionState;
	}

	public void setSuspensionState(Integer suspensionState) {
		this.suspensionState = suspensionState;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}