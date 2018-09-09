package com.eShop.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Discount {

	private Long discountId;
	private String merchantDiscountType;
	private String webDiscountType;
	private Long merchantDiscount;
	private Long webDiscount;
	private Long productMerchantId;
	private Date merchantDiscountExpiryDate;
	private Date webDiscountExpiryDate;
	
	@Id
	@GeneratedValue
	public Long getDiscountId() {
		return discountId;
	}
	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}
	public String getMerchantDiscountType() {
		return merchantDiscountType;
	}
	public void setMerchantDiscountType(String merchantDiscountType) {
		this.merchantDiscountType = merchantDiscountType;
	}
	public String getWebDiscountType() {
		return webDiscountType;
	}
	public void setWebDiscountType(String webDiscountType) {
		this.webDiscountType = webDiscountType;
	}
	public Long getMerchantDiscount() {
		return merchantDiscount;
	}
	public void setMerchantDiscount(Long merchantDiscount) {
		this.merchantDiscount = merchantDiscount;
	}
	public Long getWebDiscount() {
		return webDiscount;
	}
	public void setWebDiscount(Long webDiscount) {
		this.webDiscount = webDiscount;
	}
	public Long getProductMerchantId() {
		return productMerchantId;
	}
	public void setProductMerchantId(Long productMerchantId) {
		this.productMerchantId = productMerchantId;
	}
	public Date getMerchantDiscountExpiryDate() {
		return merchantDiscountExpiryDate;
	}
	public void setMerchantDiscountExpiryDate(Date merchantDiscountExpiryDate) {
		this.merchantDiscountExpiryDate = merchantDiscountExpiryDate;
	}
	public Date getWebDiscountExpiryDate() {
		return webDiscountExpiryDate;
	}
	public void setWebDiscountExpiryDate(Date webDiscountExpiryDate) {
		this.webDiscountExpiryDate = webDiscountExpiryDate;
	}
	
}
