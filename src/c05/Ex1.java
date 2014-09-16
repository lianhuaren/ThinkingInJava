package c05;

public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bear XiaoBei = new Bear();
		System.out.println("Color: " + XiaoBei.color);
		System.out.println("Legs: " + XiaoBei.legs);
		XiaoBei.setSalary(111);
		System.out.println("Salary: " + XiaoBei.getSalary());
		System.out.println("Weight: " + XiaoBei.weight);

	}

}

class Bear {
	public int legs = 4;
	private int salary = 0;
	private int balance = 0;
	protected int weight = 300;
	String color = "white";
	
	public void setSalary(int amount){
		salary = amount;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public void monthEnd(){
		saveMoney(200);
	}
	
	private void saveMoney(int amount){
		balance = balance + amount;
	}
}
