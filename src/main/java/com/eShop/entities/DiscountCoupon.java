package com.eShop.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DiscountCoupon {
	
	private Long couponId;
	private String couponCode;
	private String discountType;
	private Long discount;
	private Date couponOfferDate;
	private Date couponExpiryDate;
	
	@Id
	@GeneratedValue
	public Long getCouponId() {
		return couponId;
	}
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public Long getDiscount() {
		return discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}
	public Date getCouponOfferDate() {
		return couponOfferDate;
	}
	public void setCouponOfferDate(Date couponOfferDate) {
		this.couponOfferDate = couponOfferDate;
	}
	public Date getCouponExpiryDate() {
		return couponExpiryDate;
	}
	public void setCouponExpiryDate(Date couponExpiryDate) {
		this.couponExpiryDate = couponExpiryDate;
	}	

}
