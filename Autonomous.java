package pack;

import pack.InterfaceCar;

public class Autonomous implements InterfaceCar {
    private int num_passengers;
    private double speed;

    public Autonomous(int num_passengers,double speed){
        this.num_passengers=num_passengers;
        this.speed=speed;

   }

    public int getNumPassengers(){

        return num_passengers;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public boolean slowDown(double amount) {
       System.out.println("SlowDown Amount:"+ amount);
        return true;
    }

    @Override
    public boolean speedUp(double amount) {
        System.out.println("Speed up amount: "+amount);
        return true;
    }
    public double getTooFastKPH(){
        return InterfaceCar.TOO_FAST_KPH;
    }

    public static void main(String[] args){
             Autonomous auto=new Autonomous(18,145.9);
             System.out.println("slow down:"+auto.slowDown(89));
             System.out.println("Numbers of Passagers: "+auto.getNumPassengers());
             System.out.println("speed up: "+auto.speedUp(56));
             System.out.println("Speed: "+auto.getSpeed());
             System.out.println("Too fast at KPH: "+auto.getTooFastKPH());




    }
}
