/*
 
John and Mark -> They Construct Wall. Mark works twice as John works !!

Client has a requirement to construct a wall of N Bricks
Suppose N = 12
	
Who? 	# of Bricks		Count of Bricks/Total   
John 	1 				1
Mark    2 			    3
John 	2 				5
Mark    4 				9
John	3 				12

Answer : Wall Completed with 12 Bricks, John has placed 3 bricks lastly

N = 13

Who? 	# of Bricks		Count of Bricks/Total   
John 	1 				1
Mark    2 			    3
John 	2 				5
Mark    4 				9
John	3 				12
Mark    6               13  +1

Answer : Wall Completed with 13 Bricks, Mark has placed 1 brick lastly

1 for loop
operators +,- ...
if/else

 
 1. Solved By Rushil in 18 mins
 2. ? -> Janav 25 mins
 
 */
public class ProblemStatement {

	public static void main(String[] args) {
		
		int N = 13;
		int brickCount = 0;
		int markBricks = 0;
		
		for(int johnBricks=1; johnBricks<N; johnBricks++){
			
			brickCount = brickCount + johnBricks;
			if(brickCount>=N){
				brickCount = brickCount - johnBricks;
				System.out.println("Wall Complete with "+N+" Bricks. John placed "+ (N-brickCount) + " brick(s) Lastly");
				break;
			}
			
			markBricks = johnBricks * 2;
			
			brickCount = brickCount + markBricks;
			
			if(brickCount>=N){
				brickCount = brickCount - markBricks;
				System.out.println("Wall Complete with "+N+" Bricks. Mark placed "+ (N-brickCount) + " brick(s) Lastly");
				break;
			}
					
		}

	}

}
