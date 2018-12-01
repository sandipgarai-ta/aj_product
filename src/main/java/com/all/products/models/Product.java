package com.all.products.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="mib_products")
@JsonIgnoreProperties(value= {"smUrl","lgUrl"})
public class Product {
	@Transient
	@Value("${mib.smicon.url.prefix}")
	private String smUrl="http://demo.myindianbanker.com/sm_icons/";
	@Transient
	@Value("${mib.lgicon.url.prefix}")
	private String lgUrl="http://demo.myindianbanker.com/lg_icons/";
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer ppid;
	@Column(name="position",columnDefinition="int(10) default 0")
	private Integer position;
	private String name;
	private String topic;
	private String description;
	private String image;
	private String url;
	private String seoUrl;
	private String meta_title;
	private String meta_key;
	private String meta_descr;
	
	private String smIcon;
	private String lgIcon;
	
	@Column(name="specialized",columnDefinition="int(10) default 0")
	private int specialized;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "created_date")
	private Date createdDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	@Transient
	private List<Product> children;
	
	private Integer isDeleted;
	private Integer companyId;
	
	private String offerTitle;
	private String offerDetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMeta_title() {
		return meta_title;
	}

	public void setMeta_title(String meta_title) {
		this.meta_title = meta_title;
	}

	public String getMeta_key() {
		return meta_key;
	}

	public void setMeta_key(String meta_key) {
		this.meta_key = meta_key;
	}

	public String getMeta_descr() {
		return meta_descr;
	}

	public void setMeta_descr(String meta_descr) {
		this.meta_descr = meta_descr;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getPpid() {
		return ppid;
	}

	public void setPpid(Integer ppid) {
		this.ppid = ppid;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<Product> getChildren() {
		return children;
	}

	public void setChildren(List<Product> children) {
		this.children = children;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getSmIcon() {
		if(smIcon!=null)
			return smUrl+smIcon;
		else 
			return null;
	}

	public void setSmIcon(String smIcon) {
		this.smIcon = smIcon;
	}

	public String getLgIcon() {
		if(lgIcon!=null)
			return lgUrl+lgIcon;
		else 
			return null;
	}

	public void setLgIcon(String lgIcon) {
		this.lgIcon = lgIcon;
	}

	public int getSpecialized() {
		return specialized;
	}

	public void setSpecialized(int specialized) {
		this.specialized = specialized;
	}

	public String getSmUrl() {
		return smUrl;
	}

	public void setSmUrl(String smUrl) {
		this.smUrl = smUrl;
	}

	public String getLgUrl() {
		return lgUrl;
	}

	public void setLgUrl(String lgUrl) {
		this.lgUrl = lgUrl;
	}

	public String getSeoUrl() {
		return seoUrl;
	}

	public void setSeoUrl(String seoUrl) {
		this.seoUrl = seoUrl;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getOfferTitle() {
		return offerTitle;
	}

	public void setOfferTitle(String offerTitle) {
		this.offerTitle = offerTitle;
	}

	public String getOfferDetails() {
		return offerDetails;
	}

	public void setOfferDetails(String offerDetails) {
		this.offerDetails = offerDetails;
	}

	@Override
	public String toString() {
		return "Product [smUrl=" + smUrl + ", lgUrl=" + lgUrl + ", id=" + id + ", ppid=" + ppid + ", position="
				+ position + ", name=" + name + ", topic=" + topic + ", description=" + description + ", image=" + image
				+ ", url=" + url + ", seoUrl=" + seoUrl + ", meta_title=" + meta_title + ", meta_key=" + meta_key
				+ ", meta_descr=" + meta_descr + ", smIcon=" + smIcon + ", lgIcon=" + lgIcon + ", specialized="
				+ specialized + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", children="
				+ children + ", isDeleted=" + isDeleted + ", companyId=" + companyId + ", offerTitle=" + offerTitle
				+ ", offerDetails=" + offerDetails + "]";
	}
	
}