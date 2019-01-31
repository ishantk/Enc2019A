class Counter{
	
	// Non Static Attribute: Property of Object
	int count;
	
	// Static Attribute: Property of Class
	static int sCount;
	
	// Non Static Method: Property of Object
	// We can access Property of Class in Property of Object
	Counter(){
		count = 1;
		sCount = 1;
	}
	
	// Non Static Method: Property of Object
	// We can access Property of Class in Property of Object
	void incrementCount(){
		count++;
		sCount++;
	}
	
	// Non Static Method: Property of Object
	// We can access Property of Class in Property of Object
	void showCount(){
		System.out.println("count is: "+count+" and sCount is: "+sCount);
	}
	
	// Static Method: Property of Class
	// We cannot access Property of Object in Property of Class
	static void show(){
		//System.out.println("count is: "+count+" and sCount is: "+sCount);
		System.out.println("sCount is: "+sCount);
	}
	
}


public class Quiz {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1;
		
		c1.incrementCount(); // 2 2
		c2.incrementCount(); // 2 3
		c3.incrementCount(); // 3 4
		
		c1.incrementCount(); // 4 5
		c2.incrementCount(); // 3 6
		c2.incrementCount(); // 4 7
		c2.incrementCount(); // 5 8
		
		Counter c4 = new Counter();
		
		Counter.sCount = 111;
		
		c1.showCount(); // count is: 4 and sCount is: 8 8 8 
		c2.showCount(); // count is: 5 and sCount is: 8 8 8
		c3.showCount(); // count is: 4 and sCount is: 8 8 8
		c4.showCount(); // count is: 1 and sCount is: 1 8 9
		
		Counter.show();
		

	}

}
