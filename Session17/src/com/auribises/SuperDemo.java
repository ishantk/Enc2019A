package com.auribises;

//super as call and this as call

class CA{
	
	CA(){
		System.out.println(">> CA Object Constructed");
	}
	
	CA(int x){
		this();
		System.out.println(">> CA Object Constructed and x is: "+x);
	}
}

class CB extends CA{
	CB(){
		super(10);
		//super();
		System.out.println(">> CB Object Constructed");
	}
}

class CC extends CB{
	CC(){
		//super(); -> super as constructor call
		System.out.println(">> CC Object Constructed");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		CC cRef = new CC();

	}

}
