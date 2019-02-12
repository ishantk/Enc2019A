package com.auribises;

class Message{
	
	String msg;
	
	Message(){
		msg = ">> No Message Available";
	}
	
	void writeMessage(){
		msg = "Be Exceptional !!";
		System.out.println(">> Message Written");
	}
	
	void readMessage(){
		System.out.println(">> Message is: "+msg);
	}
}

class ReaderThread extends Thread{
	
	Message mRef;
	
	ReaderThread(Message m){
		mRef = m;
	}
	
	@Override
	public void run() {
		synchronized (mRef) {
			
			try {
				//mRef.wait(1000);
				mRef.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			mRef.readMessage();
		}
	}
	
}

class WriterThread extends Thread{
	
	Message mRef;
	
	WriterThread(Message m){
		mRef = m;
	}
	
	@Override
	public void run() {
		synchronized (mRef) {
			mRef.writeMessage();
			//mRef.notify();
			mRef.notifyAll();
		}
	}
	
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message mRef = new Message();
		//mRef.writeMessage();
		//mRef.readMessage();
		
		ReaderThread rt1 = new ReaderThread(mRef);
		ReaderThread rt2 = new ReaderThread(mRef);
		WriterThread wt = new WriterThread(mRef);
		
		rt1.start();
		rt2.start();
		wt.start();
		
		//Thread.State.
		System.out.println("RT1: "+rt1.getState());
		System.out.println("RT2: "+rt2.getState());
		System.out.println("WT: "+wt.getState());
	
	}

}

// Create a Stack Data Structure using Arrays : One Thread will perform Push Operation and Other will perform Pop Operation
// N-Queen Problem !!
