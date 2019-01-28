// Textual Representation how an Object will look like !!
/*
 	1. Rushil
 	2. Bhavya
 	3. Hardeep
 	4. Vasmank
 	5. Tavleen
 	6. Rajat
 */
class Product{
	// Attributes
	// They are Property of Object and not of Class
	int pid;
	String name;
	String brand;
	int price;
}
public class AnotherProblemStatement {
	public static void main(String[] args) {
		
		int a = 10;
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// Object Construction Statement
		Product pRef = new Product();
		// pRef is a Reference Variable
		pRef.pid = 101;
		pRef.name = "iPhone X";
		pRef.brand = "Apple";
		pRef.price = 80000;
	}
}
