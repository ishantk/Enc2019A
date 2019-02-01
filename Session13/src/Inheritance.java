class Product{
	
	// Attributes: Property of Object
	int pid;
	String name;
	String brandName;
	int price;
	
	Product(){
		System.out.println(">> Product Object Constructed");
	}
	
	void setDataForProduct(int pid, String name, String brandName, int price){
		this.pid = pid;
		this.name = name;
		this.brandName = brandName;
		this.price = price;
	}
	
	void showDataForProduct(){
		System.out.println("===Product "+pid+"===");
		System.out.println("Name:"+name);
		System.out.println("Brand:"+brandName);
		System.out.println("Price: \u20b9"+price);
		System.out.println("===============");
	}
}

// Forms IS-A Relation
// MobilePhone IS-A Product
class MobilePhone extends Product{
	
	// Attributes
	String os;
	int ram;
	int memory;
	
	MobilePhone(){
		System.out.println(">> MobilePhone Object Constructed");
	}
	
	// Overloading !!
	void setDataForProduct(int pid, String name, String brandName, int price, String os, int ram, int memory){
		this.pid = pid;
		this.name = name;
		this.brandName = brandName;
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.memory = memory;
	}
	
	// OVERRIDING
	void showDataForProduct(){
		
		//super.showDataForProduct();
		
		System.out.println("===Product "+pid+"===");
		System.out.println("Name:"+name);
		System.out.println("Brand:"+brandName);
		System.out.println("Price: \u20b9"+price);
		System.out.println("OS:"+os);
		System.out.println("RAM:"+ram);
		System.out.println("Memory:"+memory+"GB");
		System.out.println("===============");
	}
	
	void setDataForMobile(String os, int ram, int memory){
		this.os = os;
		this.ram = ram;
		this.memory = memory;
	}
	
	void showDataForMobile(){
		System.out.println("===Mobile Details===");
		System.out.println("OS:"+os);
		System.out.println("RAM:"+ram);
		System.out.println("Memory:"+memory+"GB");
		System.out.println("===============");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		/*
		Product pRef = new Product();
		pRef.setDataForProduct(101, "iPhone X", "Apple", 80000);
		pRef.showDataForProduct();
		*/
		
		// #Rule1 -> Before Object of Child, Parent Object is constructed in memory !!
		// #Rule2 -> Constructors anr Not Inherited
		// #Rule3 -> Private is Not Inherited
		MobilePhone mRef = new MobilePhone();
		//mRef.setDataForProduct(101, "iPhone X", "Apple", 80000);
		mRef.setDataForProduct(101, "iPhone X", "Apple", 80000,"iOS", 4, 128);
		mRef.showDataForProduct();
		
		//mRef.setDataForMobile("iOS", 4, 128);
		//mRef.showDataForMobile();
		

	}

}
