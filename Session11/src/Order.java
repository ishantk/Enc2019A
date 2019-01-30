// Textual Representation of an Object
// MODEL or BEAN or POJO(Plain Old Java Object)
public class Order {
	
	// Attributes
	int orderId;
	String date;
	String time;
	int price;
	
	// Methods: 1. Write Data in Object
	void setOrderDetails(int orderId, String date, String time, int price){
		this.orderId = orderId;
		this.price = price;
		this.date = date;
		this.time = time;
		this.price = price;
	}
	
	// Methods : 2. To Read Data from Object
	void showOrderDetails(){
		System.out.println("===Order: "+orderId+"===");
		System.out.println("DateTime: "+date+" | "+time);
		System.out.println("Price: \u20b9"+price);
		System.out.println("===============");
	}
}
