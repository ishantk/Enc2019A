class Parent{
	void purchaseBike(){
		System.out.println("Lets Buy Bajaj Pulsar");
	}
	
	static void purchaseCar(){
		System.out.println("Lets Buy Maruti Swift");
	}
}

class Child extends Parent{
	// Overriding
	void purchaseBike(){
		System.out.println("Lets Buy Royal Enfield");
	}
	
	// Hiding
	static void purchaseCar(){
		System.out.println("Lets Buy Honday City");
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.purchaseBike();
		
		Child.purchaseCar();

	}

}
