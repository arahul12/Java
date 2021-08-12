import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean tele,wifi;
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room \n 2. Deluxe AC Room \n 3.Suite AC Room");
		System.out.println("Select Room Type:");
		int type=scanner.nextInt();
		if(type==1)
		{	scanner.nextLine();
			System.out.println("Hotel name:");
			String hotel=scanner.nextLine();
			System.out.println("Room Square Feet Aread:");
			
			int area=scanner.nextInt();
			System.out.println("Room has TV(yes/no)");
			scanner.nextLine();
			String tv=scanner.nextLine();
			if(tv=="yes")
			{
				tele=true;
			}
			else
			{
				tele=false;
			}
			System.out.println("Room has Wifi(yes/no)");
			scanner.nextLine();
			String Wifi=scanner.nextLine();
			if(Wifi=="yes")
			{
				wifi=true;
			}
			else
			{
				wifi=false;
			}
			DeluxeRoom deluxeRoom=new DeluxeRoom(hotel,area,tele,wifi);
			System.out.println("Room Tariff per day is:" + deluxeRoom.calculateTariff());
		}
		if(type==2)
		{
			System.out.println("Hotel name:");
			String hotel=scanner.nextLine();
			System.out.println("Room Square Feet Aread:");
			int area=scanner.nextInt();
			System.out.println("Room has TV(yes/no)");
			String tv=scanner.nextLine();
			if(tv=="yes")
			{
				tele=true;
			}
			else
			{
				tele=false;
			}
			System.out.println("Room has Wifi(yes/no)");
			String Wifi=scanner.nextLine();
			if(Wifi=="yes")
			{
				wifi=true;
			}
			else
			{
				wifi=false;
			}
			DeluxeSeaViewRoom deluxeSeaViewRoom= new DeluxeSeaViewRoom(hotel,area,tele,wifi);
			System.out.println("Room Tariff per day is:" + deluxeSeaViewRoom.calculateTariff());
		}
		if(type==3)
		{
			System.out.println("Hotel name:");
			String hotel=scanner.nextLine();
			System.out.println("Room Square Feet Aread:");
			int area=scanner.nextInt();
			System.out.println("Room has TV(yes/no)");
			String tv=scanner.nextLine();
			if(tv=="yes")
			{
				tele=true;
			}
			else
			{
				tele=false;
			}
			System.out.println("Room has Wifi(yes/no)");
			String Wifi=scanner.nextLine();
			if(Wifi=="yes")
			{
				wifi=true;
			}
			else
			{
				wifi=false;
			}
			SuiteRoom suiteRoom = new SuiteRoom(hotel,area, tele, wifi);
			System.out.println("Room Tariff per day is:" + suiteRoom.calculateTariff());
		}
		
				
		
		
	
	}
	
}
