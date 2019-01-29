// Textual Representation of Driver Object
public class Driver {
	
	// Attributes
	String name;
	String phone;
	String email;
	char gender;
	
	// Attribute of Driver Object
	// HAS-A Relationship | cRef is Ref Var of some Cab Object
	// 1 to 1
	Cab cRef;
	
	// Methods
	void setDataForDriver(String nm, String ph, String em, char gn){
		name = nm;
		phone = ph;
		email = em;
		gender = gn;
	}
	
	// Overloading
	// Redefine the same function with different inputs
	void setDataForDriver(String nm, String ph, String em, char gn, Cab c){
		name = nm;
		phone = ph;
		email = em;
		gender = gn;
		cRef = c;
	}
		
	void showDataForDriver(){
		System.out.println("========Driver Data=======");
		System.out.println("Name\t"+name);
		System.out.println("Phone\t"+phone);
		System.out.println("Email\t"+email);
		System.out.println("Gender\t"+gender);
		System.out.println("=========================");
		System.out.println("***Driver Cab Details***");
		cRef.showDataForCab();
	}
	
}
