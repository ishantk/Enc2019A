// Main Class for Execution of Program 
public class ZomatoApp {

	public static void main(String[] args) {
		
		// Array of Addresses
		Address[] arr = new Address[3];
		
		for(int i=0;i<arr.length;i++){
			arr[i] = new Address();
		}
		
		Order[] orr = new Order[5];
		
		for(int i=0;i<orr.length;i++){
			orr[i] = new Order();
		}

		arr[0].setAddressDetails(35.550, 75.330, "Redwood Shores", "Ludhiana", 141002, "Home");
		arr[1].setAddressDetails(33.550, 76.330, "Country Homes", "Ludhiana", 141001, "Work");
		arr[2].setAddressDetails(37.550, 77.330, "Pristine Magnum", "Ludhiana", 141003, "Uncle");
		
		
		orr[0].setOrderDetails(101, "30/1/2019", "10:00", 300);
		orr[1].setOrderDetails(201, "30/1/2019", "10:30", 500);
		orr[2].setOrderDetails(301, "30/1/2019", "11:00", 700);
		orr[3].setOrderDetails(401, "30/1/2019", "11:30", 900);
		orr[4].setOrderDetails(501, "30/1/2019", "12:00", 1100);
		
		Customer c1 = new Customer();
		
		// 1 to many Fulfillment !!
		c1.setDetailsForCustomer("John", "+91 99999 88888", arr, orr);

		c1.showDetailsForCustomer();
		
		System.out.println(">>>>>>>>>>>>>>>>>");
		System.out.println(c1.name+" Spent \u20b9"+c1.kitneKharachDiye());
		System.out.println(">>>>>>>>>>>>>>>>>");
		
	}

}
