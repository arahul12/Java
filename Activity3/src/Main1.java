import java.util.Scanner;

public class Main1 {

	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Four Wheeler");
		System.out.println("2. Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		int wheels=scanner.nextInt();
		System.out.println("Vehicle Make:");
		String make=scanner.nextLine();
		System.out.println("Vehicle Number:");
		String number=scanner.nextLine();
		System.out.println("Fuel Type:");
		System.out.println("1.Petrol");
		System.out.println("2.Disel");
		int type=scanner.nextInt();
		String fuel_type; 
		if(type==1)
		{
			fuel_type="Petrol";
		}
		else
		{
			fuel_type="Disel";
		}
		System.out.println("Fuel Capacity:");
		int capacity=scanner.nextInt();
		System.out.println("Engine CC:");
		int cc=scanner.nextInt();	
		if(wheels==1)
		{
			System.out.println("Audio System:");
			String audio=scanner.nextLine();
			System.out.println("Number of Doors:");
			int doors=scanner.nextInt();
			FourWheeler fourWheeler=new FourWheeler(make,number,fuel_type,capacity,cc,audio,doors);
			String str= fourWheeler.getMake();
			System.out.println("***" + str + "***");
			System.out.println("---Basic Information---");
			fourWheeler.displayBasicInfo();
			System.out.println("---Detail Information---");
			fourWheeler.displayDetailInfo();
		}
		else
		{
			boolean start;
			System.out.println("Kick Start Available(yes/no):");
			String kick=scanner.nextLine();
			if(kick=="yes")
			{
				start=true;
			}
			else
			{
				start=false;
			}
			TwoWheeler twoWheeler=new TwoWheeler(make,number,fuel_type,capacity,cc,start);
			String str=twoWheeler.getMake();
			System.out.println("***" + str + "***");
			System.out.println("---Basic Information---");
			twoWheeler.displayBasicInfo();
			System.out.println("---Detail Information---");
			twoWheeler.displayDetailInfo();
			
		}
	}
}
