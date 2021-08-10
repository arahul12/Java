import java.util.Scanner;

public class EmployeeMain2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		String s1;
		Employee emp=new Employee();
		System.out.println("Enter the name:");
		s1=scanner.nextLine();
		emp.setName(s1);
		System.out.println("Enter Address:");
		s1=scanner.nextLine();
		emp.setAddress(s1);
		System.out.println("Enter Mobile:");
		s1=scanner.nextLine();
		emp.setMobile(s1);
		System.out.println("Verify and Update the details");
		int input=1;
		//input=scanner.nextInt();
		while(input!=4)
		{
			System.out.println("Menu");
			System.out.println("1. Update Employee name");
			System.out.println("2. Update Employee address");
			System.out.println("3. Update Employee mobile");
			System.out.println("4. All information correct/Exit");
			input=scanner.nextInt();
			switch(input)
			{
			case 1:
				System.out.println("Current name is:"+ emp.getName());
				System.out.println("Enter the name");
				s1=scanner.nextLine();
				emp.setName(s1);
				break;
			case 2:	
				System.out.println("Current address is:"+ emp.getAddress());
				System.out.println("Enter the address");
				s1=scanner.nextLine();
				emp.setAddress(s1);
				break;	
			case 3:
				System.out.println("Current mobile is:"+ emp.getMobile());
				System.out.println("Enter the mobile");
				s1=scanner.nextLine();
				emp.setMobile(s1);
				break;
			case 4:
				
				break;
			}
		}
		System.out.println("The details are:");
		System.out.println("Name: " + emp.getName());
		System.out.println("Address: " + emp.getAddress());
		System.out.println("Mobile: " + emp.getMobile());
	
	}

	class Employee2{
		
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

}

