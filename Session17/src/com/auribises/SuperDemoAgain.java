package com.auribises;

class Parent{
	void hello(){
		System.out.println("This is hello in Parent");
	}
}

class Child extends Parent{
	void hello(){
		//super.hello();
		System.out.println("This is hello in Child");
		super.hello();
	}
}

public class SuperDemoAgain {

	public static void main(String[] args) {
		
		Child cRef = new Child();
		cRef.hello();

	}

}
