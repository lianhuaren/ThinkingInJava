package c04;

//: SimpleConstructor.java
//Demonstration of a simple constructor
class Rock {
	Rock(int i) {
		System.out.println("Creating Rock number " + i);
	}
}

public class SimpleConstructor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			new Rock(i);
	}
	
	// Seems the following code will not be executed.
	SimpleConstructor(){
		System.out.println("SimpleConstructor");
	}
} ///:~