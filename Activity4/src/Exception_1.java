import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args)
	{
		int runs,overs;
		Scanner scanner=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the total runs scored");
			runs=scanner.nextInt();
			System.out.println("Enter the total overs faced");
			overs=scanner.nextInt();
			float runRate=(float)runs/overs;
			System.out.println("Current Run Rate: "+ runRate);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
