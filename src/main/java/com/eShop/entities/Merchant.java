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

import org.apache.catalina.User;
import org.hibernate.annotations.Cascade;

@Entity
public class Merchant {

	private Long merchantId;
	private String firstName;
	private String middleName;
	private String lastName;
	private List<Address> address;
	private List<Contact> contact;
	private User user;
	private String pan;
	private String tin;
	
	@Id
	@GeneratedValue
	public Long getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@OneToMany(targetEntity=Address.class, mappedBy="addressId", cascade= CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	@OneToMany(targetEntity=Contact.class, mappedBy="contactId", cascade= CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List<Contact> getContact() {
		return contact;
	}
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	
	@OneToOne(targetEntity=User.class, cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="user")
	public User getUser() {
		return user;
	}
	public void setUserId(User user) {
		this.user = user;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	
}
