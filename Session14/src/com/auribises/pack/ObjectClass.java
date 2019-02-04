package com.auribises.pack;

// Textual Representation of Object
// Object is a built In Class in Java which is parent to all the classes in Java
class CA{	// extends Object{
	void fun(){
		
	}
	
	// Override
	public String toString(){
		String str = "Be Exceptional !!";
		//String str = "Be Exceptional !! "+super.toString();
		return str;
	}
}

public class ObjectClass {

	public static void main(String[] args) {
	
		CA cRef = new CA();
		System.out.println("cRef class is: "+cRef.getClass());
		System.out.println("cRef class is: "+cRef.getClass().getName());
		System.out.println("cRef class is: "+cRef.getClass().getSimpleName());
		
		System.out.println("cRef HashCode is: "+cRef.hashCode());
		System.out.println("cRef.toString() is: "+cRef.toString());
		System.out.println("cRef is: "+cRef);

	}

}
