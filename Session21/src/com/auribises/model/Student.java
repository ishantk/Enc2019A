package com.auribises.model;

public class Student {
	
	// Attributes:
	public int roll;
	public String name;
	public String phone;
	public int age;
	public String address;
	
	public Student() {
		
	}

	public Student(int roll, String name, String phone, int age, String address) {
		this.roll = roll;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", phone=" + phone + ", age=" + age + ", address=" + address
				+ "]";
	}

}
