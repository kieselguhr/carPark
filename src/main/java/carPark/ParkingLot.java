package carPark;

public class ParkingLot {
	
	ParkingSpot parkingSpots[][];
	
	int buildingFloor;
	int spotPerFloor;
	
	public ParkingLot(int buildingFloor, int spotPerFloor) {
		super();
		this.buildingFloor = buildingFloor;
		this.spotPerFloor = spotPerFloor;
		
		parkingSpots = new ParkingSpot[buildingFloor][spotPerFloor];
		
		for(int i = 0; i < buildingFloor ; i++) {
			for(int j=0; j < spotPerFloor ; j++) {
				
				parkingSpots[i][j] = new ParkingSpot();
				
			}
		}
		
	}
	
	public void insertVehicle(Vehicle vehicle) throws VehicleAlreadyInserted{
		
		boolean inserted = false;
		
		if(vehicleFound(vehicle.getPlateNumber())) {
			
			VehicleAlreadyInserted error = new VehicleAlreadyInserted();
			
			throw(error);
			
		}
		
		for(int i = 0; i < buildingFloor ; i++) {
			for(int j=0; j < spotPerFloor ; j++) {
				
				if(inserted) {
					break;
				}
				
				if(parkingSpots[i][j].spaceLeft() >= vehicle.size) {
					
					System.out.println(vehicle.getPlateNumber() + " is inserted on "+i+"F number " + j);
					parkingSpots[i][j].addVehicle(vehicle);
					inserted = true;
					break;
					
				}
			}
			
			if(inserted) {
				break;
			}
			
		}
		if(!inserted) {
			System.out.println("Parking Lot is full");
		}
		
	}
	
	public String searchVehicle(String carPlate) {
		
		for(int i = 0; i < buildingFloor ; i++) {
			for(int j=0; j < spotPerFloor ; j++) {
				
				String[] parkedCars = parkingSpots[i][j].vehicleParked();
				
				for(String whatCar : parkedCars) {
					if(whatCar.equals(carPlate)) {
						return carPlate + " is parked on "+i+"F number " + j; 
					}
				}
				
			}
		}
		
		return "Car not found";
	
	}
	
	public boolean vehicleFound(String carPlate) {
		for(int i = 0; i < buildingFloor ; i++) {
			for(int j=0; j < spotPerFloor ; j++) {
				
				String[] parkedCars = parkingSpots[i][j].vehicleParked();
				
				for(String whatCar : parkedCars) {
					if(whatCar.equals(carPlate)) {
						return true;
					}
				}
				
			}
		}
		
		return false;
	}
	
	public int freeParkingSpace() {
		
		int freeSpace = 0;
		
		for(int i = 0; i < buildingFloor ; i++) {
			for(int j=0; j < spotPerFloor ; j++) {
				
				if(parkingSpots[i][j].isEmpty()) {
					freeSpace++;
				}
				
			}
		}
		
		return freeSpace;
		
	}
	
	
}
