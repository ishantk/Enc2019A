
public class Arrays {

	// main method represents main thread
	// whatever you write in main will be executed in a sequence
	// 1. Storage Containers Creation
	// 2. Computation
	// 3. Display
	public static void main(String[] args) {
		
		// Single Value Container
		int a = 10;
		double d = 2.2;
		
		// Display Statement
		System.out.println("a is: "+a);
		System.out.println("d is: "+d);
		
		// Computation Statement
		double sum = a + d;
		System.out.println("sum is: "+sum);
		
		// Storage Containers : Single Value Containers
		
		// Problem Statement: Elections | PartyA	PartyB
		// Create Operation
		int partyAPunjabVotes = 102341;
		int partyAPUPVotes = 562341;
		int partyAPMPVotes = 362341;
		int partyAPMaharashtraVotes = 362141;
		int partyAPKarnatakaVotes = 462341;

		int partyBPunjabVotes = 212341;
		int partyBPUPVotes = 762341;
		int partyBPMPVotes = 462544;
		int partyBPMaharashtraVotes = 332141;
		int partyBPKarnatakaVotes = 322345;
		
		// Update Operation
		partyAPunjabVotes = 132341;
		
		int partyAVoteCount = 0;
		int partyBVoteCount = 0;
		
		partyAVoteCount = partyAPunjabVotes + partyAPUPVotes + partyAPMPVotes + partyAPMaharashtraVotes + partyAPKarnatakaVotes;
		partyBVoteCount = partyBPunjabVotes + partyBPUPVotes + partyBPMPVotes + partyBPMaharashtraVotes + partyBPKarnatakaVotes;
		
		if(partyAVoteCount > partyBVoteCount){
			System.out.println("PartyA Won by "+(partyAVoteCount - partyBVoteCount)+" votes !!");
		}else{
			System.out.println("PartyB Won by "+(partyBVoteCount - partyAVoteCount)+" votes !!");
		}
		
		// What is the Problem ? 
		// if states number will increase it will become difficult to store and manage data
		// When size of data is growing single value containers will not fit in !!
		// Solution is Arrays !!
		
		// Data Storage is now simplified
		int[] partyAVotes = {102341, 562341, 362341, 362141, 462341};
		int[] partyBVotes = {212341, 762341, 462544, 332141, 322345};
		
		System.out.println("partyAPunjabVotes is: "+partyAPunjabVotes);
		System.out.println("partyAVotes is: "+partyAVotes);
		
		//partyAVotes[1] = 1001;
		
		/*System.out.println("partyAVotes[0] is: "+partyAVotes[0]);
		System.out.println("partyAVotes[1] is: "+partyAVotes[1]);
		System.out.println("partyAVotes[2] is: "+partyAVotes[2]);
		System.out.println("partyAVotes[3] is: "+partyAVotes[3]);
		System.out.println("partyAVotes[4] is: "+partyAVotes[4]);*/
		
		partyAVoteCount = 0;
		for(int i=0; i<5; i++){
			System.out.println("partyAVotes["+i+"] is: "+partyAVotes[i]);
			partyAVoteCount = partyAVoteCount + partyAVotes[i];
		}
		
		partyBVoteCount = 0;
		for(int i=0; i<5; i++){
			System.out.println("partyBVotes["+i+"] is: "+partyBVotes[i]);
			partyBVoteCount = partyBVoteCount + partyBVotes[i];
		}
		
		
		if(partyAVoteCount > partyBVoteCount){
			System.out.println("PartyA Won by "+(partyAVoteCount - partyBVoteCount)+" votes !!");
		}else{
			System.out.println("PartyB Won by "+(partyBVoteCount - partyAVoteCount)+" votes !!");
		}
		
	}

}
