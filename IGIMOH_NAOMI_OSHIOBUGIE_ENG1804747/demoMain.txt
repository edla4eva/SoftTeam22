package igimoh_Naomi;

public class demoMain {

    public static void main(String[] args){

        demoUseInterfaceCar demoCar = new demoUseInterfaceCar(7, 5.68);
        demoCar.slowDown(22);
        demoCar.speedUp(32);
        demoCar.getNumberPassengers();
        demoCar.getSpeed();
        demoCar.getTooFastKPH();


    }

}
