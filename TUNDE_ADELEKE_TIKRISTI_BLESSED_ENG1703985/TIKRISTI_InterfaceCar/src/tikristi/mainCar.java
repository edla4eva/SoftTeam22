package tikristi;

public class mainCar {

    public static void main(String[] args){

        demoUseInterfaceCar newDemoCar = new demoUseInterfaceCar(7, 5.68);
        newDemoCar.slowDown(22);
        newDemoCar.speedUp(32);
        newDemoCar.getNumberPassengers();
        newDemoCar.getSpeed();
        newDemoCar.getTooFastKPH();


    }


}
