package com.auribises;

interface Inf1{
	void show(); // public abstract void show();
	void hello();
}

class CA implements Inf1{
	public void show(){
		System.out.println("This is show");
	}
	
	public void hello(){
		System.out.println("This is hello");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		
		// Ref Var of Interface is pointing to the object which implements it !!
		/*Inf1 iRef = new CA();
		iRef.show();
		iRef.hello();*/
		
		// Anonymous Class in JAVA
		// Object of Anonymous class is created automatically and its HashCode is shared in ref var of interface
		// They can have only 1 single object 
		// We cannot have constructors here
		// We can have blocks !!
		Inf1 iRef = new Inf1(){
			
			{
				System.out.println("This is a block");
			}
			
			
			public void show(){
				System.out.println("This is show");
			}
			
			public void hello(){
				System.out.println("This is hello");
			}
		};
		
		iRef.show();
		iRef.hello();

	}

}
