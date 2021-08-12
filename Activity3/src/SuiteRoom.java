
class SuiteRoom extends HotelRoom
{
	public SuiteRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) 
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	private int ratePerSqFeet;
	
	public int getRatePerSqFeet()
	{
		if(this.isHasWifi()==true)
		{
			return ratePerSqFeet;
		}
		else
		{
			return ratePerSqFeet+2;
		}
	}

}