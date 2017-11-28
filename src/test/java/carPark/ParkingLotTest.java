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
		ParkingLot pl = new ParkingLot(1, 5);
		
		Car audiR8 = new Car("MAMAM14","Audi");
		Car tytSupra = new Car("SP33D","Toyota");
		Car tytSupra2 = new Car("SP33D2","Toyota");
		Car tytSupra3 = new Car("SP33D3","Toyota");
		Car tytSupra4 = new Car("SP33D4","Toyota");
		Car tytSupra5 = new Car("SP33D5","Toyota");
		
		pl.insertVehicle(audiR8);
		pl.insertVehicle(tytSupra);
		pl.insertVehicle(tytSupra2);
		pl.insertVehicle(tytSupra3);
		pl.insertVehicle(tytSupra4);
		pl.insertVehicle(tytSupra5);
		
		System.out.println(pl.searchVehicle("MAMAM14"));
	}

}
