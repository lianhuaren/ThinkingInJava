package c06;

class A {
	A(){
		System.out.println("A()");
	}
	
}

class B {
	B(){
		System.out.println("B()");
	}
}

public class Ex1 extends A{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B myBClass = new B();
		Ex1 myEx1 = new Ex1();

	}

}
