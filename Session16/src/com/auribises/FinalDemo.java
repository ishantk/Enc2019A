package com.auribises;
//final method cannot be inherited
final class A{
	// final method cannot be overrided
	final void show(){
		
	}
}

class B{// extends A{
	/*void show(){
		
	}*/
}

public class FinalDemo {

	public static void main(String[] args) {
		
		int a = 10;
		a = 200; // update operation allowed
		
		// Behaves like constant. x is IMMUTABLE
		// final variable
		final int x = 10;
		//x = 200; // update operation not allowed
		
		final int y; // Blank final variable
		y = 100;

	}

}
