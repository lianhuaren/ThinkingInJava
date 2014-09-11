package c03;

public class Ex3 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("-----------------");
			System.out.println("i: " + i);

			switch (i) {
			case 0:
				System.out.println("case 0");
				break;
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			}
			System.out.println("-----------------");
		}
	}

}
