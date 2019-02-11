package com.auribises;

/*class MyTask{
	void runTask(){
		for(int i=1;i<=10;i++){
			System.out.println("** MyTask: "+i);
		}
	}
}*/

// MyTask IS-A Thread
class MyTask extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("** MyTask: "+i);
		}
	}
}

class CA{
	
}

//class YourTask extends CA, Thread{ // error -> Multiple Inheritance nit Supported
class YourTask extends CA implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			try{
				Thread.sleep(1500);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("## YourTask: "+i);
		}
	}
}

public class App {

	// main method represents main thread in a process
	public static void main(String[] args) {

		// Job1
		System.out.println(">> App Started");
		
		// Job 1.5 // We are considering this job as a blocking job
		// Jobs below 1.5 will be blocked
		MyTask mRef = new MyTask(); // Thread
		//mRef.runTask();
		
		mRef.setDaemon(true);
		
		//Runnable r = new YourTask(); // Polymorphic Statement
		//Thread yRef = new Thread(r);
		Thread yRef = new Thread( new YourTask() );
		
		
		Thread.currentThread().setName("John");
		mRef.setName("Jennie");
		yRef.setName("Jim");
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY); // 10
		mRef.setPriority(Thread.NORM_PRIORITY); // 5
		yRef.setPriority(Thread.MIN_PRIORITY);  // 1
		
		yRef.start();
		try {
			yRef.join(); // immediately after start
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		mRef.start(); // start method will internally execute run method
		try {
			mRef.join(); // immediately after start
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		// Job2
		for(int i=1;i<=10;i++){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(">> main thread: "+i);
		}
		
		
		System.out.println("Main Thread Name: "+Thread.currentThread().getName());
		System.out.println("MyTask Name: "+mRef.getName());
		System.out.println("YourTask Name: "+yRef.getName());
		
		System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());
		System.out.println("MyTask Priority: "+mRef.getPriority());
		System.out.println("YourTask Priority: "+yRef.getPriority());
		
		// Job3
		System.out.println(">> App Finished");

	}

}
