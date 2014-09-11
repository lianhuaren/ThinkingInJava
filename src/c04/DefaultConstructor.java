package c04;

//: DefaultConstructor.java
class Bird {
	int i;
}

public class DefaultConstructor {
	public static void main(String[] args) {
		Bird nc = new Bird(); // default!
		// nc.i is set to 0 by default
		System.out.println(nc.i);
	}
} // /:~