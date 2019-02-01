
public class Blocks {

	Blocks() {
		System.out.println(">> Blocks Object Constructed");
	}
	
	// Property of Object
	// Block or Initialization Block
	{
		System.out.println(">> This is Block1");
	}
	
	{
		System.out.println(">> This is Block2");
	}
	
	// Property of Class
	static{
		System.out.println(">> This is static Block");
	}
	
	public static void main(String[] args) {
		
		System.out.println(">> Main Started");
		
		Blocks bRef1 = new Blocks();
		Blocks bRef2 = new Blocks();

		System.out.println(">> Main Finished");
	}

}
