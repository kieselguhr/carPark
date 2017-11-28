package carPark;

public class Vehicle {

	double size;
	
	String plateNumber;
	String brand;
	
	public Vehicle(String plateNumber, String brand, double size) {
		
		this.size = size;
		this.plateNumber = plateNumber;
		this.brand = brand;
		
	}
	
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
}
