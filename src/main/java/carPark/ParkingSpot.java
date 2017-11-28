package carPark;

import java.util.ArrayList;

public class ParkingSpot {

	ArrayList<Vehicle> vehicleSpot;
	
	public ParkingSpot() {
		vehicleSpot = new ArrayList<Vehicle>();
	}
	
	public String[] vehicleParked() {
		
		String[] parkedCars = new String[vehicleSpot.size()];
		int i =0;
		
		for(Vehicle v : vehicleSpot ){
			parkedCars[i] = v.getPlateNumber();
			i++;
		}
		
		return parkedCars;
		
	}
	
	public void addVehicle(Vehicle v) {
		if(spaceLeft() >= v.getSize()) {
			vehicleSpot.add(v);
		}
	}
	
	public double spaceLeft() {
		double size = 1;
		
		for(Vehicle v : vehicleSpot ){
			size -= v.getSize();
		}
		
//		System.out.println("SIZE is " + size);
		
		return size;
		
	}
	
	public boolean isEmpty() {
		if(vehicleSpot.size() == 0 ) {
			return true;
		}
		return false;
	}
	
}
