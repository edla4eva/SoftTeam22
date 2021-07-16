/*
* Utility class to execute DemoUseInterfaceCar.java and DemoInterfaceCar.java
*/

public class DemoMain {
	public static void main(String[] args) {
		// Declare and initialize a DemoUseInterfaceCar object
		DemoUseInterfaceCar demoCar = new DemoUseInterfaceCar(7, 5.65);

		// call getter methods of demoCar object
		int numberOfPassengers = demoCar.getNumberPassengers();
		double speed = demoCar.getSpeed();
		double getTooFastKph = demoCar.getTooFastKPH();

		// Output instance variables of the demoCar object
		System.out.println("Number of passengers: " + numberOfPassengers);
		System.out.println("Get speed: " + speed);
		System.out.println("Get too fast kph: " + getTooFastKph);


		// call methods of demoCar object
		demoCar.slowDown(5.5);
		demoCar.speedUp(6.38);
	}
}