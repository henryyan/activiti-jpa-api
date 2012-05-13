package me.kafeitu.activiti.jpa.entity.ge;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * @author henryyan
 */
@Entity
@Table(name = "ACT_GE_BYTEARRAY")
public class JpaGeBytearray implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	private String id;

	@Lob()
	@Column(name = "BYTES_")
	private byte[] bytes;

	@Column(name = "GENERATED_")
	private Integer generated;

	@Column(name = "NAME_")
	private String name;

	@Column(name = "REV_")
	private Integer rev;

	@JoinColumn(name = "DEPLOYMENT_ID_")
	private String deploymentId;

	public JpaGeBytearray() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte[] getBytes() {
		return this.bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public Integer getGenerated() {
		return this.generated;
	}

	public void setGenerated(Integer generated) {
		this.generated = generated;
	}

	public String getName() {
		return this.name;
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

	public String getDeploymentId() {
		return deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

}