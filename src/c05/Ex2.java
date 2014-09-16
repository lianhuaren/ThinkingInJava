package c05;

public class Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigBear XiaoZong = new BigBear();
		XiaoZong.changeWeight(400);
		System.out.println(XiaoZong.xiaozong.weight);

	}

}

class BigBear {
	public BrownBear xiaozong = new BrownBear();
	public void changeWeight(int wt){
		xiaozong.weight = wt;
	}
	
}

class BrownBear {
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
