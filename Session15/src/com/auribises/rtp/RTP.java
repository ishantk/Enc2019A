package com.auribises.rtp;

/*class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(String source, String destinition){
		System.out.println(">> Cab Booked from "+source+" to "+destinition+"!! Arriving Soon !!");
	}
}*/

// We cannot instantiate it i.e. we cannot create its objects !!
// But Run Time Environment will create its Objects !!
/*abstract class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	// abstract method is a Rule | Protocol which children must define !!
	abstract void bookCab(String source, String destinition);
	
	// We can have concrete methods i.e. Regular methods
	void fun(){
		System.out.println("This is fun");
	}
}*/

// Interfaces cannot have Objects at any cost
// Neither we nor RTE can create objects
interface Cab{
	
	/*Cab(){
		System.out.println(">> Cab Object Constructed");
	}*/
	
	// abstract method is a Rule | Protocol which children must define !!
	void bookCab(String source, String destinition); // public void abstract
	
	// We can have concrete methods i.e. Regular methods
	/*void fun(){
		System.out.println("This is fun");
	}*/
}

// MiniCab IS-A Cab (Inheritance``)
// Object of MiniCab implements Cab
class MiniCab implements Cab{//extends Cab{
	
	MiniCab(){
		System.out.println(">> MiniCab Object Constructed");
	}
	
	public void bookCab(String source, String destinition){
		System.out.println(">> Mini Cab Booked from "+source+" to "+destinition+"!! Arriving Soon !!");
	}
}

class LuxuryCab implements Cab{//extends Cab{
	
	LuxuryCab(){
		System.out.println(">> LuxuryCab Object Constructed");
	}
	
	public void bookCab(String source, String destinition){
		System.out.println(">> Luxury Cab Booked from "+source+" to "+destinition+"!! Arriving Soon !!");
	}
}

class Bike implements Cab{//extends Cab{
	
	Bike(){
		System.out.println(">> Bike Object Constructed");
	}
	
	public void bookCab(String source, String destinition){
		System.out.println(">> Bike Booked from "+source+" to "+destinition+"!! Arriving Soon !!");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		/*Cab cRef;
		cRef = new Cab();
		cRef.bookCab("Auribises", "Silver Arc");*/
		
		// Use such a statement when we have to execute only 1 single method on object
		// Here we have no reference to Object
		// new Cab().bookCab("Auribises", "Silver Arc");
		
		/*MiniCab mRef;
		mRef = new MiniCab();
		mRef.bookCab("Auribises", "Silver Arc");*/
		
		
		Cab cRef;
		
		// Ref Var of Parent can point to Object of Child
		// Ref Var of Interface can point to Object which implements it
		cRef = new MiniCab(); // Polymorphic Statement
		cRef.bookCab("Auribises", "Silver Arc");
		
		System.out.println();
		
		cRef = new LuxuryCab();
		cRef.bookCab("Auribises", "Silver Arc");
		
		System.out.println();
		
		cRef = new Bike();
		cRef.bookCab("Auribises", "Silver Arc");
		
		System.out.println();
		
		// Creating Object of Cab and executing bookCab of Cab Object is no sense !!
		//cRef = new Cab();
		//cRef.bookCab("Auribises", "Silver Arc");				
		
	}

}
