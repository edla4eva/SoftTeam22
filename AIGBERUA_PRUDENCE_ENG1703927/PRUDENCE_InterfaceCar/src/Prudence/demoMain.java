package Prudence;

public class demoMain {

    public static void main(String[] args){

        demoUseInterfaceCar demoCar = new demoUseInterfaceCar(2, 5.68);
        demoCar.slowDown(2);
        demoCar.speedUp(12);
        demoCar.getNumberPassengers();
        demoCar.getSpeed();
        demoCar.getTooFastKPH();


    }

}
