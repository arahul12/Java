import java.util.ArrayList;
import java.util.Scanner;

public class IPLTopScorersMain {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		ArrayList<String> topFiveScorersIPL13=new ArrayList<String>();
		
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		for(int i=0;i<5;i++)
		{
			String s=scanner.nextLine();
			topFiveScorersIPL13.add(s);
		}
		
		ArrayList<String> topFiveScorersIPL12=new ArrayList<String>();
		
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++)
		{
			String s=scanner.nextLine();
			topFiveScorersIPL12.add(s);
		}
		topFiveScorersIPL12.retainAll(topFiveScorersIPL13);
		System.out.println("Consistent run scorers");
		for(String playerName : topFiveScorersIPL12)
		{
			System.out.println(playerName);
		}
		scanner.close();
	}

}
