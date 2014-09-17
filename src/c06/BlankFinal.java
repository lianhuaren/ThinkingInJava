package c06;

//: BlankFinal.java
//"Blank" final data members
class Poppet {
}

class BlankFinal {
	final int i = 0; // Initialized final
	final int j; // Blank final
	final Poppet p; // Blank final handle
	// Blank finals MUST be initialized
	// in the constructor:

	BlankFinal() {
		j = 1; // Initialize blank final
		p = new Poppet();
	}

	BlankFinal(int x) {
		j = x; // Initialize blank final
		p = new Poppet();
	}

	public static void main(String[] args) {
		BlankFinal bf1 = new BlankFinal();
		BlankFinal bf2 = new BlankFinal(2);
		System.out.println(bf1.j);
		System.out.println(bf2.j);
	}
} ///:~