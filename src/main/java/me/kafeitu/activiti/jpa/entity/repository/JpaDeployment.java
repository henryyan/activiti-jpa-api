package me.kafeitu.activiti.jpa.entity.repository;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author henryyan
 */
@Entity
@Table(name = "ACT_RE_DEPLOYMENT")
public class JpaDeployment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Column(name = "DEPLOY_TIME_")
	private Timestamp deployTime;

	@Column(name = "NAME_")
	private String name;

	public JpaDeployment() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getDeployTime() {
		return this.deployTime;
	}

	public void setDeployTime(Timestamp deployTime) {
		this.deployTime = deployTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}