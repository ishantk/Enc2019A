package com.auribises.rtp;

class CA{
	void fun(){
		System.out.println("This is fun");
	}
}

interface Inf1{
	
	int x = 10; 	// public static final int x = 10;
	
	void show();	// public abstract void show();
	void hello();	// public abstract void hello();
}

interface Inf2{
	int y = 20; 	// public static final int y = 20;
	
	void show();	// public abstract void show();
	void bye();	// public abstract void bye();
}

interface Inf3 extends Inf1,Inf2{
	
}

class CB extends CA implements Inf3{//Inf1, Inf2{
	
	public void show(){
		System.out.println("This is show");
	}
	
	public void hello(){
		System.out.println("This is hello");
	}
	
	public void bye(){
		System.out.println("This is bye");
	}
}

public class InfDemo {

	public static void main(String[] args) {

		/*
		//Ref Var of Parent points to Object of Child
		CA ca = new CB();
		ca.show();
		ca.hello();
		ca.bye();
		ca.fun();
		*/
		
		//Ref Var of Interface points to Object which implements it
		/*Inf1 i1 = new CB();
		i1.show();
		i1.hello();
		i1.bye();
		i1.fun();*/
		
		//Ref Var of Interface points to Object which implements it
		/*Inf2 i2 = new CB();
		i2.show();
		i2.hello();
		i2.bye();
		i2.fun();*/
		
		// Direct Object Constructiuon
		/*CB cb = new CB();
		cb.show();
		cb.hello();
		cb.bye();
		cb.fun();*/
		
		/*
		Inf1 i1 = new CB();
		System.out.println("i1 is: "+i1);
		i1.show();
		i1.hello();
		//i1.fun();
		
		
		//CB cb = new CB();
		CB cb = (CB)i1; // Downcasting
		System.out.println("cb is: "+cb);
		cb.show();
		cb.hello();
		cb.bye();
		cb.fun();
		
		
		System.out.println("Inf1.x is: "+Inf1.x);
		System.out.println("CB.x is: "+CB.x);
		System.out.println("cb.x is: "+cb.x);
		*/
		
		Inf3 i3 = new CB();
		i3.show();
		i3.hello();
		i3.bye();
		//i3.fun();
		
	}

}
