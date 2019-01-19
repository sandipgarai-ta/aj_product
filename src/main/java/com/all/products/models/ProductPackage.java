package com.all.products.models;
// Generated Dec 6, 2018 12:29:21 AM by Hibernate Tools 5.1.7.Final

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/**
 * Package generated by hbm2java
 */
@Entity
@Table(name = "package", catalog = "activent_products")
public class ProductPackage implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PACKAGE_ID", unique = true, nullable = false)
	private long packageId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_CREATE", nullable = false, length = 19)
	private Date dtCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_UPDATE", nullable = false, length = 19)
	private Date dtUpdate;
	
	@Column(name = "PACKAGE_NAME")
	private String packageName;
	
	@Column(name = "PRODUCT_ID")
	private long productId;
	
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="organization_id")
	private PackageOrganization organization;
	
	@Column(name = "RATING")
	private long rating;
	
	@Column(name = "PROCESSING_FEES")
	private String processingFees;
	
	@Column(name = "EMI")
	private String emi;
	
	@Column(name = "MAX_LOAN_AMT")
	private String maxLoanAmt;
	
	@Column(name = "TENURE")
	private String tenure;
	
	@Column(name = "IS_ACTIVE")
	private long isActive;
	
	
	
	//constructor
	public ProductPackage() {
	}

	public ProductPackage(Date dtCreate, Date dtUpdate) {
		this.dtCreate = dtCreate;
		this.dtUpdate = dtUpdate;
	}

	public ProductPackage(Date dtCreate, Date dtUpdate, String packageName, long productId, PackageOrganization organization, long rating,
			String processingFees, String emi, String maxLoanAmt, String tenure, long isActive) {
		this.dtCreate = dtCreate;
		this.dtUpdate = dtUpdate;
		this.packageName = packageName;
		this.productId = productId;
		this.organization = organization;
		this.rating = rating;
		this.processingFees = processingFees;
		this.emi = emi;
		this.maxLoanAmt = maxLoanAmt;
		this.tenure = tenure;
		this.isActive = isActive;
	}

	
	
	
	public long getPackageId() {
		return packageId;
	}

	public void setPackageId(long packageId) {
		this.packageId = packageId;
	}

	public Date getDtCreate() {
		return dtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	public Date getDtUpdate() {
		return dtUpdate;
	}

	public void setDtUpdate(Date dtUpdate) {
		this.dtUpdate = dtUpdate;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public PackageOrganization getOrganization() {
		return organization;
	}

	public void setOrganization(PackageOrganization organization) {
		this.organization = organization;
	}

	public long getRating() {
		return rating;
	}

	public void setRating(long rating) {
		this.rating = rating;
	}

	public String getProcessingFees() {
		return processingFees;
	}

	public void setProcessingFees(String processingFees) {
		this.processingFees = processingFees;
	}

	public String getEmi() {
		return emi;
	}

	public void setEmi(String emi) {
		this.emi = emi;
	}

	public String getMaxLoanAmt() {
		return maxLoanAmt;
	}

	public void setMaxLoanAmt(String maxLoanAmt) {
		this.maxLoanAmt = maxLoanAmt;
	}

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public long getIsActive() {
		return isActive;
	}

	public void setIsActive(long isActive) {
		this.isActive = isActive;
	}
}
