package c05;

public class ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class bear {
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
