// Book Class represents Object | Structure of an Object
// If we write anything in class, that becomes property of Object

// We can mark attribute to be a private attribute.
// If attribute is not marked as private it is default i.e. non private
class Book{
	// Attributes
	private String title;
	String author;
	int price;
	private int pageCount;
	String isbn;
	
	// Methods
	// Setters and Getters
	void setTitle(String t){
		title = t;
	}
	
	void setPageCount(int p){
		if(p < 100){
			pageCount = 0;
			System.out.println("Sorry!! We accept books with pages more than 100");
		}else{
			pageCount = p;
		}
	}
	
	String getTitle(){
		return title;
	}
	
	int getPageCount(){
		return pageCount;
	}
	
	void showBookDetails(){
		System.out.println("******************");
		System.out.println("Title:\t"+title);
		System.out.println("Author:\t"+author);
		System.out.println("Price:\t"+price);
		System.out.println("******************");
	}
}


public class OOPS {

	public static void main(String[] args) {
		
		// Object Construction Statement
		Book bRef1 = new Book();
		// new creates object at run time/dynamically i.e. when program is in execution phase.
		// new creates object in the Heap
		
		// bRef1 is a Reference Variable.
		// It is created in Stack
		// It will contain HashCode of Object
		
		Book bRef2 = new Book();
		
		// Reference Copy
		Book bRef3 = bRef1;
		
		System.out.println("bRef1 is: "+bRef1);
		System.out.println("bRef2 is: "+bRef2);
		System.out.println("bRef3 is: "+bRef3);
		
		// Write Data In Object
		//bRef1.title = "Book1";
		bRef1.setTitle("Book1");
		bRef3.price = 500;
		//bRef1.pageCount = 300;
		bRef1.setPageCount(300);
		bRef1.isbn = "IBN000561";
		bRef1.author = "Author1";

		//bRef2.title = "Book2";
		bRef2.setTitle("Book2");
		bRef2.price = 1000;
		//bRef2.pageCount = 500;
		bRef2.setPageCount(500);
		bRef2.isbn = "IBN000777";
		bRef2.author = "Author2";
		
		// Read Operation
		//System.out.println(bRef1.title+" is written by "+bRef3.author);
		//System.out.println(bRef2.title+" is written by "+bRef2.author);
		
		//System.out.println(bRef1.getTitle()+" is written by "+bRef3.author);
		//System.out.println(bRef2.getTitle()+" is written by "+bRef2.author);
		
		bRef1.showBookDetails();
		bRef2.showBookDetails();
	}

}
