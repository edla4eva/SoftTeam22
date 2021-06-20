package danielak0009;

public class autoMobile {

    public static void main(String[] args){

        demoUseInterfaceCar newAutoMobile = new demoUseInterfaceCar(5, 3.45);
        newAutoMobile.getNumberPassengers();
        newAutoMobile.getSpeed();
        newAutoMobile.getTooFastKPH();
        newAutoMobile.slowDown(3);
        newAutoMobile.speedUp(2);


    }

}
