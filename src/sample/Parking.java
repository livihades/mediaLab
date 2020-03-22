package sample;

public class Parking {

	public int parkingType;
	public String parkingID;
	public Status parkingStatus;
	public int maxParkedTime;
	public int cost;
	
	public Parking(int parkingType, String parkingID, int cost) {
		this.parkingType = parkingType;
		this.parkingID = parkingID;
		this.cost = cost;
	}

	
}

