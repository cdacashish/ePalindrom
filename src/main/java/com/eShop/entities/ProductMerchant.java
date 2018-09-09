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
public class ProductMerchant {

	private Long productMerchantId;
	private Product porduct;
	private Merchant merchant;
	private Double price;
	private List<Discount> discount;
	private String comment;
	
	@Id
	@GeneratedValue
	public Long getProductMerchantId() {
		return productMerchantId;
	}
	public void setProductMerchantId(Long productMerchantId) {
		this.productMerchantId = productMerchantId;
	}
	
	@OneToOne(targetEntity=Product.class, cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="productId")
	public Product getPorduct() {
		return porduct;
	}
	public void setPorduct(Product porduct) {
		this.porduct = porduct;
	}
	@OneToOne(targetEntity=Merchant.class, cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="merchantId")
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchantId(Merchant merchant) {
		this.merchant = merchant;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@OneToMany(targetEntity=Merchant.class, cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="discountId")
	public List<Discount> getDiscount() {
		return discount;
	}
	public void setDiscount(List<Discount> discount) {
		this.discount = discount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
