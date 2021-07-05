package Gilbert;

public class demoUseInterfaceCar implements demoInterfaceCar{

    private int numberPassengers;
    private double speed;

    public demoUseInterfaceCar(int numberPassengers, double speed){

        this.numberPassengers = numberPassengers;
        this.speed = speed;

    }

    public int getNumberPassengers(){
        return numberPassengers;
    }

    public boolean slowDown(double amount){
        System.out.println("slowDown amount: " + amount);
        return true;
    }

    public boolean speedUp(double amount){
        System.out.println("speedUp amount: " + amount);
        return true;
    }

    public double getSpeed(){
        return speed;
    }

    public double getTooFastKPH(){
        return demoInterfaceCar.TOO_FAST_KPH;
    }

}