import java.util.Scanner;

public class Exception_4 extends Exception {
	
	Exception_4(){}
	
	Exception_4(String str)
	{
		super(str);
	}

	public static void main(String[] args)
	{
		
		try
		{
			Scanner scanner=new Scanner(System.in);
			String teams[]= {"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals","Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians","Rajashtan Royals","Royal Challengers Bangalore"};
			String search;
			System.out.println("Enter the expected winner team of IPL Season 13");
			search=scanner.nextLine();
			int k=1;
			for(int i=0;i<teams.length;i++)
			{
				if(search.equalsIgnoreCase(teams[i]))
				{
					k=0;break;
				}
			}
			if(k==1)
			{
				Exception_4 myexception= new Exception_4("TeamNotFoundException");
				throw myexception;
					
			}
			System.out.println("Enter the expected runner team of IPL Season 13");
			search=scanner.nextLine();
			k=1;
			for(int i=0;i<teams.length;i++)
			{
				if(search.equalsIgnoreCase(teams[i]))
				{
					k=0;break;
				}
			}
			if(k==1)
			{
				Exception_4 myexception= new Exception_4("TeamNotFoundException");
				throw myexception;
					
			}
			System.out.println("Expected IPL Season 13 winner: Delhi Capitals");
			System.out.println("Expected IPL Season 13 runner: Kolkata Knight Riders");
		}
		catch(Exception_4 e)
		{
			e.printStackTrace();
		}
	}
}
