package sample;

import java.util.ArrayList;
import java.util.List;

public class MediaLab {

	public static List<Flight> flightList = new ArrayList<>();
	public static List<Parking> parkingList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		FileReader setup = new FileReader("/C:\\Users\\stzes\\Desktop\\Stelios\\Subjects\\Media Tech\\MediaLab\\examples\\setup_default.txt");
		FileReader airportdefault = new FileReader("C:\\Users\\stzes\\Desktop\\Stelios\\Subjects\\Media Tech\\MediaLab\\examples\\airport_default.txt");
		populateFlightList(setup, 5);
		populateParkingList(airportdefault,4);
		checkParkingListisPopulated(parkingList);
//		checkFlightListisPopulated(flightList);
	}
	
	public static void printValues(FileReader fr) {
		for(String value: fr.getValues()){
				System.out.print(value);
			}
			System.out.println();
	}
	
	
	
	public static void checkFlightListisPopulated(List<Flight> fl) {
		for (Flight f: fl) {
			System.out.println(f.flightID + f.airjetType + f.destination + f.estimatedTimeDeparture);
		}
	}
	
	public static void checkParkingListisPopulated(List<Parking> pl) {
		for (Parking p: pl) {
			System.out.println(String.valueOf(p.parkingType) + String.valueOf(p.spots) + String.valueOf(p.cost) + p.parkingID);
		}
	}
	
	public static void populateParkingList(FileReader fr, int fields){
		for (String entry: fr.getValues()) {
			String[] components = entry.replaceAll(" ", "").split(",",fields);
			Parking tmpParking = new Parking(Integer.parseInt(components[0]),Integer.parseInt(components[1]),Integer.parseInt(components[2]),components[3]);
			parkingList.add(tmpParking);
		}
	}
	public static void populateFlightList(FileReader fr, int fields) {
		for (String entry: fr.getValues()) {
			String[] components = entry.replaceAll(" ", "").split(",",fields);
			Flight tmpFlight = new Flight(components[0],components[1],Integer.parseInt(components[2]),Integer.parseInt(components[3]),Integer.parseInt(components[4]));
			flightList.add(tmpFlight);
		}
	}
	
	
	
}
