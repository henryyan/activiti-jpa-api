package me.kafeitu.activiti.jpa.entity.repository;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.DeploymentEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_RE_DEPLOYMENT")
public class DeploymentJpaEntity extends DeploymentEntity implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Column(name = "DEPLOY_TIME_")
	protected Timestamp deployTime;

	@Column(name = "NAME_")
	protected String name;

	public DeploymentJpaEntity() {
	}

	public Timestamp getDeployTime() {
		return this.deployTime;
	}

	public void setDeployTime(Timestamp deployTime) {
		this.deployTime = deployTime;
	}

}