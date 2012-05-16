package me.kafeitu.activiti.jpa.entity.ge;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author HenryYan
 */
@Entity
@Table(name = "ACT_GE_PROPERTY")
public class JpaGeProperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "NAME_")
	private String name;

	@Column(name = "REV_")
	private BigDecimal rev;

	@Column(name = "VALUE_")
	private String value;

	public JpaGeProperty() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getRev() {
		return this.rev;
	}

	public void setRev(BigDecimal rev) {
		this.rev = rev;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}