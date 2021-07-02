package Rwinkah;

public interface demoInterfaceCar {

    public static final double TOO_FAST_KPH = 160.9;

    //Methods in an interface are abstract without using the keyword.
    public boolean slowDown(double amount);
    public boolean speedUp(double amount);

}
