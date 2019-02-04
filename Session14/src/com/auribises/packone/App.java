package com.auribises.packone;

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		Two tRef = new Two();
		
		// oRef.pvtShow(); error
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		// tRef.pvtShow(); error
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

	}

}
// PS: Within the same package everyone is accessible other than private
// 	   private is accessible only within object/class
//     If you wish to access private access it indirectly !!
