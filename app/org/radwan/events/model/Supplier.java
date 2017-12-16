package org.radwan.events.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier {

	@Id
	@Column(name="SUPPLIER_ID")
	private BigDecimal id;
	@Column(name="SUPPLIER_NAME")
	private String name;
	@Column(name="SUPPLIER_EMAIL")
	private String supplierEmail;
	@Column(name="COMPANY_NAME")
	private String companyName;
	@Column(name="DECLARATION_SCOPE")
	private String declarationScope;
	@Column(name="COMPANY_SCOPE")
	private String companyScope;
	@Column(name="COMPANY_UNIQUE_ID")
	private String companyUniqueId;
	@Column(name="COMPANY_UNIQUE_AUTHORITY_ID")
	private String companyUniqueAuthorityId;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	@Column(name="CONTACT_PHONE")
	private String contactPhone;
	@Column(name="AUTHORIZER_NAME")
	private String authorizerName;
	@Column(name="AUTHORIZER_PHONE")
	private String authorizerPhone;
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	
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
	public String getSupplierEmail() {
		return supplierEmail;
	}
	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDeclarationScope() {
		return declarationScope;
	}
	public void setDeclarationScope(String declarationScope) {
		this.declarationScope = declarationScope;
	}
	public String getCompanyScope() {
		return companyScope;
	}
	public void setCompanyScope(String companyScope) {
		this.companyScope = companyScope;
	}
	public String getCompanyUniqueId() {
		return companyUniqueId;
	}
	public void setCompanyUniqueId(String companyUniqueId) {
		this.companyUniqueId = companyUniqueId;
	}
	public String getCompanyUniqueAuthorityId() {
		return companyUniqueAuthorityId;
	}
	public void setCompanyUniqueAuthorityId(String companyUniqueAuthorityId) {
		this.companyUniqueAuthorityId = companyUniqueAuthorityId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getAuthorizerName() {
		return authorizerName;
	}
	public void setAuthorizerName(String authorizerName) {
		this.authorizerName = authorizerName;
	}
	public String getAuthorizerPhone() {
		return authorizerPhone;
	}
	public void setAuthorizerPhone(String authorizerPhone) {
		this.authorizerPhone = authorizerPhone;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
