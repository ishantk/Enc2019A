package com.auribises;

import java.io.IOException;

// User Defined UnChecked Exception
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

//User Defined Checked Exception
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}

class Banking{
	
	int accountBalance = 10000;
	int minBalance = 2000;
	int attempts = 0;
	
	void withdraw(int amount) throws IOException, YourBankingException{
		accountBalance = accountBalance - amount;
		if(accountBalance < minBalance){
			attempts++;
			accountBalance = accountBalance + amount;
			System.out.println("Withdrawl Failed. Balance is Low \u20b9"+accountBalance);
		}else{
			System.out.println("Withdrawl Successful and New Balance is \u20b9"+accountBalance);
		}
		
		if(attempts == 3){
			// Create Object of any Built In Exception and Throw it !!
			// ArithmeticException -> Is a Child of RuntimeException
			
			// We are throwing an UNCHEKCED EXCEPTION
			//ArithmeticException aRef = new ArithmeticException("Illegal Attempts !!");
			//throw aRef; // throw keyword will help to throw an Exception !!
			
			// We can crash programs if required !!
			
			// IOException -> Is a Child of Exception
			// We are throwing an CHEKCED EXCEPTION
			//IOException iRef = new IOException("Illegal Attempts !!");
			//throw iRef; // we get error here by compiler while throwing a Checked Exception
			// As a solution we will use throws keyword in method signature
			
			// We are throwing User Defined UNCHEKCED EXCEPTION
			//MyBankingException mRef = new MyBankingException("Illegal Attempts !!");
			//throw mRef;
			
			// We are throwing User Defined CHEKCED EXCEPTION
			YourBankingException yRef = new YourBankingException("Illegal Attempts !!");
			throw yRef;
		}
	}
	
}

public class ThrowThrows {

	public static void main(String[] args) {
		
		System.out.println(">> Banking Started");
		
		Banking bRef = new Banking();
		
		try{
			for(int i=1;i<=1000;i++){
				bRef.withdraw(3000);
			}
		}catch(Exception e){
			System.out.println(">> Exception Occurred "+e);
		}
		
		
		System.out.println(">> Banking Finished");
	}

}
