package sample;

public class Flight {
	public String flightID; 
	public String destination;
	public int airjetType;
	public int estimatedTimeDeparture;
	public int flightType;
	
	public Flight(String flightID, String destination,int flightType, int airjetType, int estimatedTimeDeparture) {
		this.airjetType = airjetType;
		this.destination = destination;
		this.estimatedTimeDeparture = estimatedTimeDeparture;
		this.flightID = flightID;
		this.flightType = flightType;
	}

	
}
