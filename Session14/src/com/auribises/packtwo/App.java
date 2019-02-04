package com.auribises.packtwo;

import com.auribises.packone.One;
//import com.auribises.packone.Two; // Not Accessible outside the package -> error

// >>Inheritance across the package<<
// Only protected and public will be inherited, private and default will not be inherited
// protected after inheritance behaves like private
class CA extends One{
	
	void fun(){
		//pvtShow(); // err
		//defShow(); // err
		protShow();
	}
}

public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();
		//oRef.pvtShow();  error
		//oRef.defShow();  error
		//oRef.protShow(); error
		//oRef.pubShow();
		
		CA cRef = new CA();
		//cRef.pvtShow(); // error -> Not Inherited
		//cRef.defShow(); // error -> Not Inherited
		//cRef.protShow();// error -> Not Inherited
		cRef.pubShow();
		cRef.fun();

	}

}

// public is accessible within the package and even outside the package
// public class is the only class which can be imported outside the package
// public class's public methods are accessible outside the package


/*
 	Summary:
	 	private : Least Accessible
	 		only within class
	 	default
	 		only within package
	 	protected
	 		inheritable outside package
	 	public : Most Accessible
	 		accessible everywhere	
*/
