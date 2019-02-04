package com.auribises.packone;

// public class
// Rule of Naming : Source File Name should be the name of class which is public
public class One {
	
	private void pvtShow(){
		System.out.println("This is private show of One");
	}
	
	void defShow(){
		System.out.println("This is default show of One");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println("This is public show of One");
	}

}

// default class
class Two{
	
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
}


/* error
public class Three{
	
}
*/

/*
private class Four{
	
}

protected class Five{
	
}
*/

// PS: We can only create public and default classes
//     We cannot create private or protected classes