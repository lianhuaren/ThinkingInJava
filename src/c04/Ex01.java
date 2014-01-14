package c04;


class Bike {
	int wheels = 4;
	Bike(){
		System.out.println("I'm a bike!");
	}
	
	Bike(String msg){
		System.out.println("I'm a bike! " + msg);
	}
}

public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bike myBike = new Bike("hello");
		System.out.println(myBike.wheels);
		
		Bike yourBike = new Bike();
		
		Bike[] Bikes = {new Bike(), new Bike()};
	}

}
