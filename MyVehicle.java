package week3.day1;

public class MyVehicle {
	public static void main(String[]arg) {
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Audi audi = new Audi();
		
		audi.openDoor();
		audi.autoPark();
		audi.applyBrake();
		audi.soundHorn();
		
		vehicle.applyBrake();
		vehicle.soundHorn();
		
		car.openDoor();
		car.applyBrake();
	}

}
