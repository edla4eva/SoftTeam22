public interface DemoInterfaceCar {
	public static final double TOO_FAST_KPH = 160.9;

	// Methods in an interface are abstract without using te keyword.
	public boolean slowDown(double amount);
	public boolean speedUp(double amount);
}