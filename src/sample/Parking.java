package sample;

public class Parking {

	public int parkingType;
	public String parkingID;
	public Status parkingStatus;
	public int maxParkedTime;
	public int cost;
	public int spots;
	
	public Parking(int parkingType, int spots, int cost, String parkingID) {
		this.parkingType = parkingType;
		this.parkingID = parkingID;
		this.cost = cost;
		this.spots = spots;
	}

	
}

