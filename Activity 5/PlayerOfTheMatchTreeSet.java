import java.util.Scanner;
import java.util.TreeSet;

public class PlayerOfTheMatchTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfMatches;
		TreeSet<String> players=new  TreeSet<String>();
		Scanner scanner=new Scanner(System.in);
		numOfMatches=Integer.parseInt(scanner.nextLine());
		for(int i=0;i<numOfMatches;i++)
		{
			players.add(scanner.nextLine());
		}
		scanner.close();
		
		for(String playerName: players)
		{
			System.out.println(playerName);
		}
	}

}
