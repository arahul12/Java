
public class FourWheeler extends Vehicle
{
	String audioSystem;
	int numberofDoors;
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberofDoors() {
		return numberofDoors;
	}
	public void setNumberofDoors(int numberofDoors) {
		this.numberofDoors = numberofDoors;
	}
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberofDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberofDoors = numberofDoors;
	}
	public void displayDetailInfo()
	{
		System.out.println("Audio System:"+audioSystem);
		System.out.println("Number of Doors:" + numberofDoors);
	}
}
