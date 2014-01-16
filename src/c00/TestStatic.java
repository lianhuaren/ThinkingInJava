package c00;

class Value {
	static int i = 1;
}

public class TestStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Value v1 = new Value();
		v1.i = 2;
		
		Value v2 = new Value();
		v2.i = 4;
		
		Value.i = 8;
		
		System.out.println(v1.i);

	}

}
