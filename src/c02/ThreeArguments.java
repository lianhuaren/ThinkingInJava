package c02;

public class ThreeArguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i=0; i < args.length; i++){
			System.out.println(i);
			System.out.println(args[i]);
		}
		System.out.println("ending...");
	}

}
