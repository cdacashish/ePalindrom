package com.eShop.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {

	private Long orderId;
	private String invoiceNumber;
	private Long productMerchantId;
	private Long customerId;
	private Double price;
	private Long discount;
	private String discountType;
	private Date orderDate;
	private Double finalPrice;
	private String comment;
	private Boolean isCancelled;
	
	@Id
	@GeneratedValue
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Long getProductMerchantId() {
		return productMerchantId;
	}
	public void setProductMerchantId(Long productMerchantId) {
		this.productMerchantId = productMerchantId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Long getDiscount() {
		return discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Boolean getIsCancelled() {
		return isCancelled;
	}
	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
	
}
