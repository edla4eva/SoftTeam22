public class DemoMainProgram
{
    public static void main(String[] args) {
        // Declare and initialize a DemoUseInterfaceCar object
        demoUseInterfaceCar demoCar = new demoUseInterfaceCar(19, 8.654);

        // call getter methods of demoCar object
        int numberOfPassengers = demoCar.getNumberPassengers();
        double speedOfcar = demoCar.getSpeed();
        double getTooFastKph = demoCar.getTooFastKPH();

        // Output instance variables of the demoCar object
        System.out.println("Number of passengers is: " + numberOfPassengers);
        System.out.println("Get speed of car: " + speedOfcar);
        System.out.println("Get too fast kph: " + getTooFastKph);


        // call methods of demoCar object
        demoCar.slowDown(3.9);
        demoCar.speedUp(7.98);
    }
}
