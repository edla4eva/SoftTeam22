
/*
* This class will be used to execute the DemoUseInterfaceCar.java and the DemoInterfaceCar.java
*/

public class DemoMain {

	public static void main(String[] args) {

		// Declaring and initializing a DemoUseInterfaceCar object
		DemoUseInterfaceCar demoCar = new DemoUseInterfaceCar(7, 5.65);

		// calling the getter methods of demoCar object
		int numberOfPassengers = demoCar.getNumberPassengers();
		double speed = demoCar.getSpeed();
		double getTooFastKph = demoCar.getTooFastKPH();

		// Output instance variables of the demoCar object
		System.out.println("Number of passengers: "+numberOfPassengers);
		System.out.println("Get speed: "+speed);
		System.out.println("Get too fast kph: "+getTooFastKph);


		// calling methods of demoCar object
		demoCar.slowDown(5.5);
		demoCar.speedUp(6.38);
	
    }

} 