package me.kafeitu.activiti.jpa.entity.ge;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.activiti.engine.impl.persistence.entity.ByteArrayEntity;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_GE_BYTEARRAY")
public class BytearrayJpaEntity extends ByteArrayEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_")
	protected String id;

	@Lob()
	@Column(name = "BYTES_")
	protected byte[] bytes;

	@Column(name = "GENERATED_")
	protected Integer generated;

	@Column(name = "NAME_")
	protected String name;

	@Column(name = "REV_")
	protected Integer rev;

	@JoinColumn(name = "DEPLOYMENT_ID_")
	protected String deploymentId;

	public BytearrayJpaEntity() {
	}

	public Integer getGenerated() {
		return this.generated;
	}

	public void setGenerated(Integer generated) {
		this.generated = generated;
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