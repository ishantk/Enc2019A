
public class Conditions {

	public static void main(String[] args) {
	
		boolean isInternetConnected = true;
		boolean isGpsConnected = false;
		
		if(isInternetConnected){
			System.out.println("You can browse Internet");
			if(isGpsConnected){
				System.out.println("You can Use Google Maps to Navigate");
			}else{
				System.out.println("Please Connect to GPS and try Again !!");
			}
		}else{
			System.out.println("Please Connect to Internet and try Again !!");
		}
		
		System.out.println();
		
		if( isInternetConnected && isGpsConnected){
			System.out.println("You can browse Internet and Use Maps to Navigate");
		}else{
			System.out.println("Please check you Internet or GPS and Try Again");
		}

		int num1 = 100;
		int num2 = 100;
		int num3 = 100;
		
		// Complete the Logic with all the use cases which you can think of !!
		
		if(num1 > num2){
			if(num1 > num3){
				System.out.println("num1 is greatest");
			}else{
				System.out.println("num3 is greatest");
			}
		}else{
			if(num2 > num3){
				System.out.println("num2 is greatest");
			}else{
				System.out.println("num3 is greatest");
			}
		}
		
		System.out.println();
		
		int microCab = 1;
		int miniCab = 2;
		int luxuryCab = 3;
		int bike = 4;
		int auto = 5;
		
		int userChoice = 4;
		
		// Ladder if/else
		
		if(userChoice == microCab){
			System.out.println("Micro Cab Booked !! Arriving Soon !!");
		}else if(userChoice == miniCab){
			System.out.println("Mini Cab Booked !! Arriving Soon !!");
		}else if(userChoice == luxuryCab){
			System.out.println("Luxury Cab Booked !! Arriving Soon !!");
		}else if(userChoice == bike){
			System.out.println("Bike Booked !! Arriving Soon !!");
		}else if(userChoice == auto){
			System.out.println("Auto Booked !! Arriving Soon !!");
		}else{
			System.out.println("Please Select a Valid Cab First");
		}
		
		System.out.println();
		
		// Switch Case
		switch (userChoice) {
			case 1:
				System.out.println("Micro Cab Booked !! Arriving Soon !!");
				break;
				
			case 2:
				System.out.println("Mini Cab Booked !! Arriving Soon !!");
				break;
				
			case 3:
				System.out.println("Luxury Cab Booked !! Arriving Soon !!");
				break;
				
			case 4:
				System.out.println("Bike Booked !! Arriving Soon !!");
				break;
				
			case 5:
				System.out.println("Auto Booked !! Arriving Soon !!");
				break;
				
			default:
				System.out.println("Please Select a Valid Cab First");
				break;
		}
	}

}
