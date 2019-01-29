// Textual Representation of Cab Object
public class Cab {
	
	// Attributes
	String regNum;
	String color;
	String name;
	int type;
	
	// Methods
	void setDataForCab(String rn, String cl, String nm, int tp){
		regNum = rn;
		color = cl;
		name = nm;
		type = tp;
	}
	
	void showDataForCab(){
		System.out.println("========Cab Data=======");
		System.out.println("RegNum\t"+regNum);
		System.out.println("Color\t"+color);
		System.out.println("Name\t"+name);
		System.out.println("Type\t"+type);
		System.out.println("======================");
	}

}
