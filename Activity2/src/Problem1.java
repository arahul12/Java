import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
	
	Class1 class1= new Class1();
	Class2 class2 =new Class2();
	String s1=class1.getName();
	String s2=class2.getName();
	
	s1=s1.toLowerCase();
	s2=s2.toUpperCase();
	s1=s1.substring(0,1).toUpperCase() + s1.substring(1);	
	System.out.println(s1 + " " + s2);
	}
}

class Class1
{	
	Scanner scr= new Scanner(System.in);
	
	public String getName()
	{
		String s1=scr.nextLine();
		return s1;
	}
	
}

class Class2
{
	Scanner scr= new Scanner(System.in);
	
	public String getName()
	{
		String s1=scr.nextLine();
		return s1;
		
	}
}
