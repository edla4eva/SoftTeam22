package Gilbert;

public class mainCar {

    public static void main(String[] args){

        demoUseInterfaceCar demoCar = new demoUseInterfaceCar(5, 15.68);
        demoCar.slowDown(22);
        demoCar.speedUp(32);
        demoCar.getNumberPassengers();
        demoCar.getSpeed();
        demoCar.getTooFastKPH();


    }


}