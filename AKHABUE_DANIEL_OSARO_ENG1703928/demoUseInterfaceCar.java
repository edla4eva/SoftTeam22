package danielak0009;

public class demoUseInterfaceCar implements demoInterfaceCar {
    private int numberPassengers;
    private double speed;

    public demoUseInterfaceCar (int numberPassengers, double speed)
    {
        this.numberPassengers = numberPassengers;
        this.speed = speed;
    }

    public int getNumberPassengers()
    {
        System.out.println("NumberPassengers:" + numberPassengers);

        return numberPassengers;
    }

    public boolean slowDown(double amount)
    {
        System.out.println("slowDown amount:" + amount);
        return true;
    }

    public boolean speedUp(double amount){
        System.out.println("speedUp amount: " + amount);
        return true;
    }

    public double getSpeed(){
        System.out.println("Speed:" + speed);
        return speed;
    }

    public double getTooFastKPH(){
        System.out.println("getTooFastKPH:" + TOO_FAST_KPH);
        return demoUseInterfaceCar.TOO_FAST_KPH;
    }




}
