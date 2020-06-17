package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="business_id")
	private long businessId;
	
	@Column(name="business_name")
	private String businessName;
	
	@Column(name="business_website")
	private String businessWebsite;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	private String address;
	
	@Column(name="password")
	private String password;
	
	@Column(name="buffer_1")
	private String buffer1;
	
	@Column(name="buffer_2")
	private String buffer2;

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendor(long businessId, String businessName, String businessWebsite, String phoneNumber, String email,
			String address, String password, String buffer1, String buffer2) {
		super();
		this.businessId = businessId;
		this.businessName = businessName;
		this.businessWebsite = businessWebsite;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.password = password;
		this.buffer1 = buffer1;
		this.buffer2 = buffer2;
	}

	public long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessWebsite() {
		return businessWebsite;
	}

	public void setBusinessWebsite(String businessWebsite) {
		this.businessWebsite = businessWebsite;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBuffer1() {
		return buffer1;
	}

	public void setBuffer1(String buffer1) {
		this.buffer1 = buffer1;
	}

	public String getBuffer2() {
		return buffer2;
	}

	public void setBuffer2(String buffer2) {
		this.buffer2 = buffer2;
	}
	
}
