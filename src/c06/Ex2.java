package c06;

class AA {
	AA(int a){
		System.out.println("AA Constructor: " + a);
	}
}

class BB {
	BB(int b){
		System.out.println("BB Constructor: " + b);
	}
	
}

public class Ex2 extends AA{
	Ex2(){
		super(1);
	}

	public static void main(String[] args) {
		BB myBClass = new BB(2);
		Ex2 myEx2Class = new Ex2(); 

	}

}
