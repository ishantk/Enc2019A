// Textual Representation of an Object
// MODEL or BEAN or POJO(Plain Old Java Object)
public class Customer {
	
	// Attributes
	String name;
	String phone;
	
	// addresses is a reference variable which will point to an array of Address References
	Address[] addresses; // 1 to Many
	
	// orders is a reference variable which will point to an array of Order References
	Order[] orders;		 // 1 to Many
	
	// Methods: 1. Write Data in Object
	void setDetailsForCustomer(String name, String phone, Address[] addresses, Order[] orders){
		this.name = name;
		this.phone = phone;
		this.addresses = addresses;
		this.orders = orders;
	}
	
	void showDetailsForCustomer(){
		System.out.println("***Customer "+name+"*****");
		System.out.println("Phone "+phone);
		
		System.out.println("^^^^^^^^^^Addresses^^^^^^^^^^");
		
		/*for(int i=0;i<addresses.length;i++){
			addresses[i].showAddressDetails();
		}*/
		
		for(Address aRef : addresses){
			aRef.showAddressDetails();
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		System.out.println("###########Orders############");
		
		/*for(int i=0;i<orders.length;i++){
			orders[i].showOrderDetails();
		}*/
		
		for(Order oRef : orders){
			oRef.showOrderDetails();
		}
		
		System.out.println("#######################");
		
	}
	
	
	// Method : Customer Object
	// Computation | Business Method
	int kitneKharachDiye(){
		
		int total = 0;
		
		for(Order oRef : orders){
			total = total + oRef.price;
		}
		
		return total;
		
	}
}
