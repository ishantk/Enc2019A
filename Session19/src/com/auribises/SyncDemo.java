package com.auribises;

class Table{
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
}

class Printer{
	
	//synchronized void printDocuments(String docName, int copies){
	void printDocuments(String docName, int copies){
		for(int i=1;i<=copies;i++){
			System.out.println(">> Printing "+i+" copy of "+docName);
		}
	}
	
	void fun(){
		System.out.println(">> This is fun");
	}
	
}

// MyThread IS-A Thread
class MyThread extends Thread{
	
	//Table tRef;
	Printer pRef;
	
	MyThread(Printer p){
		System.out.println("p is: "+p);
		pRef = p;
		System.out.println("pRef in MyThread is: "+pRef);
	}
	
	@Override // Annotation
	public void run(){
		synchronized (pRef) {
			pRef.printDocuments("**JohnsProfile.pdf**", 10);
			pRef.fun();
		}
	}
}

class YourThread extends Thread{
	
	//Table tRef;
	Printer pRef;
	
	YourThread(Printer p){
		System.out.println("p is: "+p);
		pRef = p;
		System.out.println("pRef in MyThread is: "+pRef);
	}
	
	@Override // Annotation
	public void run(){
		synchronized (pRef) {
			pRef.printDocuments(">>JavaEBook.doc<<", 10);
		}
		
	}
}

public class SyncDemo {

	// main thread is represented by main method
	public static void main(String[] args) {
		
		//Table tRef = new Table();
		//System.out.println("tRef is "+tRef);
		//tRef.printTable(5);
		
		/*
		MyThread mRef = new MyThread(tRef);
		YourThread yRef = new YourThread(tRef);
		
		
		mRef.start(); // start will internally execute run method
		yRef.start();*/
		
		Printer pRef = new Printer();
		//pRef.printDocuments("JohnsProfile.pdf", 10);
		
		MyThread mRef = new MyThread(pRef);
		YourThread yRef = new YourThread(pRef);
		
		mRef.start();
		
		/*try {
			mRef.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		yRef.start();
		
		/*try {
			mRef.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}


// Replicate the Program : Either Uber or BMS or Zomato
