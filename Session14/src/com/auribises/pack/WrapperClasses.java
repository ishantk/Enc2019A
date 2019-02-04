package com.auribises.pack;

public class WrapperClasses {

	public static void main(String[] args) {
		
		// Primitive Type 
		int x = 10;
		
		// Convert Primitive Type to a Reference Type
		// I can represent int as Integer
		Integer xRef = new Integer(x); 		// BOXING
		// xRef is a Ref Variable pointing to Object of Integer
		// Integer is a Built In Class in Java -> Wrapper Class
		
		float f = 2.2f;
		Float fRef = new Float(f); 			 // BOXING
		
		char ch = 'A';
		Character chRef = new Character(ch); // BOXING
		
		// Extracting Primitive Type from a Reference Type
		int y = xRef.intValue(); 			 // UNBOXING
		float g = fRef.floatValue();		 // UNBOXING
		char dh = chRef.charValue();		 // UNBOXING 

		int a = 10;
		Integer aRef = a; 					// AUTO-BOXING | Translated to -> Integer aRef = new Integer(a);
		
		int b = aRef;						// AUTO-UNBOXING | -> Translated to -> int b = aRef.intValue();	
		
	}

}
