import java.util.Scanner;

public class Main3 {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the match format");
		System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("3. Test");
		int choice=scanner.nextInt();
		
		System.out.println("Enter the current score");
		int runs=scanner.nextInt();
		
		System.out.println("Enter the current over");
		float over=scanner.nextFloat();
		
		System.out.println("Enter the target score");
		int score= scanner.nextInt();
		
		System.out.println("Requirements:");
		if(choice==1)
		{
			ODIMatch odiMatch=new ODIMatch(runs,over,score);
			float runrate=odiMatch.calculateRunRate();
			int balls=odiMatch.calculateBalls();
			odiMatch.display(runrate,balls);
		}
		if(choice==2)
		{
			T20Match t20Match=new T20Match(runs,over,score);
			float runrate=t20Match.calculateRunRate();
			int balls=t20Match.calculateBalls();
			t20Match.display(runrate,balls);
		}
		if(choice==3)
		{
			TestMatch testMatch=new TestMatch(runs,over,score);
			float runrate=testMatch.calculateRunRate();
			int balls=testMatch.calculateBalls();
			testMatch.display(runrate,balls);
		}
		
	}
}
