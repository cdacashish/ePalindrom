package com.eShop.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Product {

	private Long productId;
	private List<Merchant> merchant;
	private String productType;
	private String category;
	private String description;
	private String image;
	
	@Id
	@GeneratedValue
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	@OneToMany(targetEntity=Merchant.class, cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="merchantId")
	public List<Merchant> getMerchant() {
		return merchant;
	}
	public void setMerchant(List<Merchant> merchant) {
		this.merchant = merchant;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	
	
}
