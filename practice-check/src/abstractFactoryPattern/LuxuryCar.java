package abstractFactoryPattern;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to Luxury Cars.");
	}

}
