package org.radwan.events.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="campaign")

public class Campaign {

	@Id
	@Column(name="CAMPAIGN_ID")
	private BigDecimal id;
	@Column(name="CAMPAIGN_NAME")
	private String name;
	@Column(name="CAMPAIGN_DESCRIPTION")
	private String description;
	@Column(name="CAMPAIGN_DATE")
	private String date;
	@Column(name="MODULE_ID")
	private BigDecimal moduleId;
	
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public BigDecimal getModuleId() {
		return moduleId;
	}
	public void setModuleId(BigDecimal moduleId) {
		this.moduleId = moduleId;
	}

}
