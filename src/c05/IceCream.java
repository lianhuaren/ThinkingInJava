package c05;

//: IceCream.java
//Demonstrates "private" keyword
class Sundae {
	private Sundae() {
		System.out.println("private Sundae() is called.");
	}

	static Sundae makeASundae() {
		return new Sundae();		
	}
}

public class IceCream {
	public static void main(String[] args) {
		// ! Sundae x = new Sundae();
		Sundae x = Sundae.makeASundae();
	}
} ///:~