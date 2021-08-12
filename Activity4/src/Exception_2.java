import java.util.Scanner;

public class Exception_2{

	public static void main(String[] args)
	{
		int noOfOvers,n;
		try
		{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of overs");
		noOfOvers=scanner.nextInt();
		int OverNumber[]=new int[noOfOvers+1];
		System.out.println("Enter the number of runs for each over");
		for(int i=1;i<=noOfOvers;i++)
		{
			OverNumber[i]=scanner.nextInt();
		}
		System.out.println("Enter the over number");
		n=scanner.nextInt();
		System.out.println(OverNumber[n]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
