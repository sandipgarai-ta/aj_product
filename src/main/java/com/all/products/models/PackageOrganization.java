package com.all.products.models;
// Generated Dec 6, 2018 12:29:21 AM by Hibernate Tools 5.1.7.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PackageOrganization generated by hbm2java
 */
@Entity
@Table(name = "package_organization", catalog = "activent_products")
public class PackageOrganization implements java.io.Serializable {

	private long POrgId;
	private Date dtCreate;
	private Date dtUpdate;
	private String organizationName;
	private long organizationRating;
	private String emailId;
	private String password;
	private String logoSm;
	private String logoBig;
	private long isActive;

	public PackageOrganization() {
	}

	public PackageOrganization(Date dtCreate, Date dtUpdate) {
		this.dtCreate = dtCreate;
		this.dtUpdate = dtUpdate;
	}

	public PackageOrganization(Date dtCreate, Date dtUpdate, String organizationName, long organizationRating,
			String emailId, String password, String logoSm, String logoBig, long isActive) {
		this.dtCreate = dtCreate;
		this.dtUpdate = dtUpdate;
		this.organizationName = organizationName;
		this.organizationRating = organizationRating;
		this.emailId = emailId;
		this.password = password;
		this.logoSm = logoSm;
		this.logoBig = logoBig;
		this.isActive = isActive;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "p_org_id", unique = true, nullable = false)
	public long getPOrgId() {
		return this.POrgId;
	}

	public void setPOrgId(long POrgId) {
		this.POrgId = POrgId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_CREATE", nullable = false, length = 19)
	public Date getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_UPDATE", nullable = false, length = 19)
	public Date getDtUpdate() {
		return this.dtUpdate;
	}

	public void setDtUpdate(Date dtUpdate) {
		this.dtUpdate = dtUpdate;
	}

	@Column(name = "organization_name")
	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	@Column(name = "organization_rating")
	public long getOrganizationRating() {
		return this.organizationRating;
	}

	public void setOrganizationRating(long organizationRating) {
		this.organizationRating = organizationRating;
	}

	@Column(name = "email_id")
	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "logo_sm")
	public String getLogoSm() {
		return this.logoSm;
	}

	public void setLogoSm(String logoSm) {
		this.logoSm = logoSm;
	}

	@Column(name = "logo_big")
	public String getLogoBig() {
		return this.logoBig;
	}

	public void setLogoBig(String logoBig) {
		this.logoBig = logoBig;
	}

	@Column(name = "IS_ACTIVE")
	public long getIsActive() {
		return this.isActive;
	}

	public void setIsActive(long isActive) {
		this.isActive = isActive;
	}

}
