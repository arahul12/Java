import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		String s1,s2,s3,s4[];
		int k=0;
		Customer customer = new Customer();
		System.out.println("Enter the company name:");
		s1=scr.nextLine();
		customer.setName(s1);
		System.out.println("Enter the employees:");
		s2=scr.nextLine();
		customer.setEmployees(s2);
		s4=s2.split(",");
		System.out.println("Enter the TeamLead:");
		s3=scr.nextLine();
		customer.setTeamlead(s3);
		for(int i=0;i<s4.length;i++)
		{
			if(s3.equalsIgnoreCase(s4[i]))
			{
				k=i;
				break;
			}
		}
		if(k==0)
		{
			System.out.println("Invalid input.");
		}
		else
		{
			System.out.println("Name: " + customer.getName());
			System.out.println("Employees: "+ customer.getEmployees());
			System.out.println("Lead: " + customer.getTeamlead());
		}
	}
}

class Customer{
	String name;
	String employees;
	String teamlead;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	
	
	
}
