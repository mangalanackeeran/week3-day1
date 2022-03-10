package assignment4;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("Id"+" "+id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Id and Name"+" "+id+" "+name);
	}
	public void getStudentInfo(String email, long phoneNumber)
	{
		System.out.println("Email and phoneNumber"+" "+email+" "+phoneNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s= new Students();
		s.getStudentInfo(1);
		s.getStudentInfo(2,"Mangala");
		s.getStudentInfo("mangala.tnj@gmail.com", 123456758392l);

	}

}
