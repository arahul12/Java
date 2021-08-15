import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PlayerOfTheMatchHashSet {

	public static void main(String[] args) {

		int numOfMatches;
		HashSet<String> players= new HashSet<String>();
		Scanner scanner=new Scanner(System.in);
		numOfMatches=Integer.parseInt(scanner.nextLine());
		for(int i=0;i<numOfMatches;i++)
		{	
			players.add(scanner.nextLine());
		}
		System.out.println(players.size());
		scanner.close();
	}

}
