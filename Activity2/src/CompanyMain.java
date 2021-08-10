import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {

		Scanner scr=new Scanner(System.in);
		String s1=scr.nextLine();
		String s2[];
		System.out.println("Enter the details");
		s2=s1.split(",");
		Company c=new Company();
		c.setName(s2[0]);
		c.setAddress(s2[1]);
		c.setMobile(s2[2]);
		System.out.println("Name: " + c.getName());
		System.out.println("Address: " + c.getAddress());
		System.out.println("Name: " + c.getMobile());
		
	}
}

class Company
{
	private String name;
	private String address;
	private String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
