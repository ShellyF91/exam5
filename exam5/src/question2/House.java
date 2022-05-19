package question2;

import java.util.ArrayList;

public class House {
	
	Address address; 
	ArrayList<Room> rooms = new ArrayList<Room>(); 
	boolean hasYard; 
	boolean hasBasement;
	double area;
	
	public House(Address address, ArrayList<Room> rooms, boolean hasYard, boolean hasBasement, double area) {
		this.address = address;
		this.rooms = rooms; 
		this.hasYard = hasYard;
		this.hasBasement = hasBasement;
		this.area = area;
		
	}
	
	@Override
	public String toString() {
		String msg = String.format("adress: %s, %d rooms, hasYard = %b, hasBasement = %b, area = %f", address, rooms.size(), hasYard, hasBasement, area);
		return msg; 
	}
	
	

}
