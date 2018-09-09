package com.eShop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RequestOrders {

	private Long requestOrderId;
	private Long requestId;
	private Long customerId;
	private String comment;
	
	@Id
	@GeneratedValue
	public Long getRequestOrderId() {
		return requestOrderId;
	}
	public void setRequestOrderId(Long requestOrderId) {
		this.requestOrderId = requestOrderId;
	}
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
