public class DemoUseInterfaceCar {
	private int numberPassengers;
	private double speed;

	public DemoUseInterfaceCar(int numberPassengers, double speed) {
		this.numberPassengers = numberPassengers;
		this.speed = speed;
	}

	public int getNumberPassengers() {
		return numberPassengers;
	}

	// Implement the methods declared in DemoInterfaceCar
	public boolean slowDown(double amount) {
		System.out.println("slowDown amount: " + amount);
		return true;
	}

	public boolean speedUp(double amount) {
		System.out.println("speedUp amount: " + amount);
		return true;
	}

	// getters method
	public double getSpeed() {
		return speed;
	}

	public double getTooFastKPH() {
		return DemoInterfaceCar.TOO_FAST_KPH;
	}


}