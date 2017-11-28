package carPark;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ParkingLotTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		int spotPerFloor = 5;
		int buildingFloor = 2;
		
		ParkingLot pl = new ParkingLot(buildingFloor, spotPerFloor);
		
		Car audiR8 = new Car("MAMAM14","Audi");
		Car tytSupra = new Car("SP33D","Toyota");
		Car tytSupra2 = new Car("SP33D2","Toyota");
		Car tytSupra3 = new Car("SP33D3","Toyota");
		Car tytSupra4 = new Car("SP33D4","Toyota");
		Car tytSupra5 = new Car("SP33D5","Toyota");
		
		Motorbike ninja = new Motorbike("NINJ4", "Kawasaki");
		Motorbike ninja2 = new Motorbike("NINJ42", "Kawasaki");
		
		try {
			
			pl.insertVehicle(audiR8);
			pl.insertVehicle(tytSupra);
			pl.insertVehicle(tytSupra2);
			pl.insertVehicle(tytSupra3);
			pl.insertVehicle(ninja);
			pl.insertVehicle(ninja2);
			
	
//			pl.insertVehicle(tytSupra4);
//			pl.insertVehicle(tytSupra5);
			
//			pl.insertVehicle(audiR8);
			
			
		}catch(VehicleAlreadyInserted e) {
			System.out.println("Vehicle is already inserted");
		}
		
		System.out.println(pl.searchVehicle("MAMAM14"));
		System.out.println(pl.searchVehicle("NINJ432"));
		
		pl.vehicleExit("NINJ4");
//		System.out.println(pl.searchVehicle("NINJ4"));
		
		System.out.println("FREE SPACE IS " + pl.freeParkingSpace());	
		System.out.println("MOTOR SPACE IS " + pl.motorParkingSpace());	
		
	}

}
