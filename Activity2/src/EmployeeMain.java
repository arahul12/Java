import java.util.Scanner;

class Employee {

	private String name;
	private String address;
	private String mobile;
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getMobile()
	{
		return this.mobile;
	}
	
	public void setMobile(String mobile)
	{
		this.mobile=mobile;
	}
}

public class EmployeeMain{
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the name:");
		String s1=scr.nextLine();
		emp.setName(s1);
		System.out.println("Enter Address:");
		String s2=scr.nextLine();
		emp.setAddress(s2);
		System.out.println("Enter Mobile:");
		String s3=scr.nextLine();
		emp.setMobile(s3);
		
		System.out.println("Employee Details");
		System.out.println("Name: " + emp.getName());
		System.out.println("Address: " + emp.getAddress());
		System.out.println("Mobile: " + emp.getMobile());

		
	}
	
	
}
