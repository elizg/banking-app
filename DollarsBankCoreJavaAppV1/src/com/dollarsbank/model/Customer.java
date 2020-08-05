package com.dollarsbank.model;

import java.util.List;

public class Customer {

	private String name;
	private String address;
	private String phone;
	private String userId;
	private String pw;
	public List<Account> accounts;
	
	public Customer(String name, String address, String phone, String userId, String pw) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.userId = userId;
		this.pw = pw;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", phone=" + phone + ", userId=" + userId
				+ "]";
	}
	
}