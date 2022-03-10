package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("Axis deposit method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank a= new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();
	}

}
