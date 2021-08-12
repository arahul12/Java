
public class DeluxeRoom extends HotelRoom
	{
		private int ratePerSqFeet;
		
		public void setRatePerSqFeet(int ratePerSqFeet) {
			this.ratePerSqFeet = ratePerSqFeet;
		}

		public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
			super(hotelName, numberOfSqFeet, hasTV, hasWifi);
			this.ratePerSqFeet=10;
			// TODO Auto-generated constructor stub
		}
		
		public int getRatePerSqFeet()
		{
			if(this.isHasWifi()==true)
			{	return ratePerSqFeet+2;	}
			else
			{
				return ratePerSqFeet;
			}
		}
		
	}

