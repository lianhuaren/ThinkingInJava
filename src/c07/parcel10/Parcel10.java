//: Parcel10.java
// Static inner classes
package c07.parcel10;

abstract class Contents {
	abstract public int value();
}

interface Destination {
	String readLabel();
}

public class Parcel10 {
	private static class PContents extends Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	protected static class PDestination implements Destination {
		private String label;

		private PDestination(String whereTo) {
			label = whereTo;
		}

		public String readLabel() {
			return label;
		}
	}

	public static Destination dest(String s) {
		return new PDestination(s);
	}

	public static Contents cont() {
		return new PContents();
	}

//	In main( ), no object of Parcel10 is necessary; instead you use the normal syntax for
//	selecting a static member to call the methods that return handles to Contents and
//	Destination.
	
	public static void main(String[] args) {
		Contents c = cont();
		Destination d = dest("Tanzania");
	}
} ///:~