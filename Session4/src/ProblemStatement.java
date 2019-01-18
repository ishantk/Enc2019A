
public class ProblemStatement {

	/*
	 Problem Statement: 11:45 AM Start Time !!
		1 	2	3	4	5	6	7	8	9	10 
	      	  5           11 	     17
			+         +				+	
			                 33
	 */
	
	public static void main(String[] args) {
				
		int sum = 0;;
		
		for(int i=1;i<10;i++){
			if(i%3 == 1){
				continue;
			}
			sum+=i;
		}
		System.out.println("sum is: "+sum);
	}

}
