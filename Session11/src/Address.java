// Textual Representation of an Object
// MODEL or BEAN or POJO(Plain Old Java Object)
public class Address {
	
	// Attributes
	double latitude;
	double longitude;
	String adrsLine;
	String city;
	int zipCode;
	String label;
	
	// Methods : 1. To Write Data in Object
	// this is a reference variable which points to current object
	// this.latitude is property of Object
	// latitude is property of method
	void setAddressDetails(double latitude, double longitude, String adrsLine, String city, int zipCode, String label){
		this.latitude = latitude;
		this.longitude = longitude;
		this.adrsLine = adrsLine;
		this.city = city;
		this.zipCode = zipCode;
		this.label = label;
	}
	
	// Methods : 2. To Read Data from Object
	void showAddressDetails(){
		System.out.println("===Address===");
		System.out.println("Location: "+latitude+" : "+longitude);
		System.out.println("Address Line: "+adrsLine);
		System.out.println("Address Line: "+adrsLine);
		System.out.println("City: "+city+" | "+zipCode);
		System.out.println("Address Type: "+label);
		System.out.println("=============");
	}
	
}
