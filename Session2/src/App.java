
public class App {

	// main represents main thread !!
	// thread -> is an execution context -> which means it will execute jobs in a sequence
	public static void main(String[] args) {
		
		// Job1
		System.out.println("This is Statement 1");

		// Job2
		System.out.println("This is Statement 2");
		
		// Job3
		System.out.println("This is Statement 3");
		
	}

}

// PS: When we execute Application, A Process is created.
// Every Process will have a main thread
// main thread will execute jobs one by one in a sequence.