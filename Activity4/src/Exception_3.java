import java.util.Scanner;

public class Exception_3 extends Exception {

	Exception_3()
	{}
	
	Exception_3(String str)
	{
		super(str);
	}
	
	public static void main(String[] args)
	{
		try
		{
			Scanner scanner=new Scanner(System.in);
			String name;int age;
			System.out.println("Enter the player name");
			name=scanner.nextLine();
			System.out.println("Enter the player age");
			age=scanner.nextInt();
			if(age<19)
			{
				Exception_3 exception=new Exception_3("Custom Exception:InvalidAgeRangeException");
				throw exception;
			}
			else
			{
				System.out.println("Player name: " + name);
				System.out.println("Player age: "+ age);
			}
		}
		catch(Exception_3 e)
		{
			e.printStackTrace();
		}
	}
	
}
