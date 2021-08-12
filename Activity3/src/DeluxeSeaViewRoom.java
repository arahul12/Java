
public class DeluxeSeaViewRoom extends DeluxeRoom {

	private int ratePerSqFeet;
	public DeluxeSeaViewRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet=12;
	}
	
	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	
	
}
