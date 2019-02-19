package com.auribises.model;

public class Customer {
	
	public int cid;
	public String name;
	public String phone;
	public String email;
	
	public Customer() {
	
	}

	public Customer(int cid, String name, String phone, String email) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}

}
