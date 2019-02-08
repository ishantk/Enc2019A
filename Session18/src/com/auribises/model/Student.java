package com.auribises.model;

import java.io.Serializable;

// Model or Bean or POJO(Plain Old Java Object)
// Serializable is a MARKER INTERFACE (Empty Interface just to tell compiler about Serialiazation)
public class Student implements Serializable {
	
	int roll;
	String name;
	transient int age; // This cannot be Serialized
	
	public Student() {
		
	}

	public Student(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDataForStudent(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	@Override //@Override is an Annotation
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
		//return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "] - "+super.toString();
		
		//return roll + "," + name + "," + age+"\n";
	}
	
	
	
}
