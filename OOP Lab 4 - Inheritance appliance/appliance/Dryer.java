package appliance;

public class Dryer extends Appliance {
	
	// Attributes (fields)
	private boolean sensorDry;
	
	// Constructors
	// calls setters for all four attributes
	public Dryer(String brand, String model, double capacityKg, boolean sensorDry) {
		super(brand, model, capacityKg);
		setSensorDry(sensorDry);
	}

	public boolean isSensorDry() {
		return sensorDry;
	}
	
	public void setSensorDry(boolean sensorDry) {
		this.sensorDry = sensorDry;
	}
	
	@Override
	public String toString() {
		return super.toString() + "sensorDry [sensorDry=" + sensorDry + ", getSensorDry()=" + isSensorDry() +  "]";
	}

	// Methods
	public void startDry() {
		System.out.println("Dryer is running");
	}

	public void stopDry() {
		System.out.println("Dryer cycle finished.");
	}
}