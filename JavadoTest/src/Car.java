
public class Car {
	String color;
	String type;
	
	{
//		You can have many initialization block, and they are executed in order
		color = "White";
		type = "Sedan";
	}
	
	void start() {
		System.out.println("Getting started!");
	}

	void printDescription() {
		System.out.println("This is a " + color + " " + type);
	}
	
}
