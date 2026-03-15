package appliance;

public class WashingMachine extends Appliance {
	
	// Attributes (fields)
	private int powerWatts;
	
	// Constructors
	// calls setters for all four attributes
	public WashingMachine(String brand, String model, double capacityKg, int powerWatts) {
		super(brand, model, capacityKg);
		setPowerWatts(powerWatts);
	}
		
	public int getPowerWatts() {
		return powerWatts;
	}

	public void setPowerWatts(int powerWatts) {
		this.powerWatts = powerWatts;
	}
	
	@Override
	public String toString() {
		return super.toString() + "WashingMachine [powerWatts=" + powerWatts + ", getPowerWatts()=" + getPowerWatts() +  "]";
	}

	// Methods
	public void startWash()
	{
	System.out.println("The washing machine has started washing.") ;
	}
		
	public void stopWash()
	{
	System.out.println("The washing machine has stopped.") ;
	}
}