package carPark;

public class Motorbike extends Vehicle{

	public static final double MOTORSIZE = 0.25;
	
	public Motorbike(String plateNumber, String brand) {
		super(plateNumber, brand, MOTORSIZE);
	}
	
}
