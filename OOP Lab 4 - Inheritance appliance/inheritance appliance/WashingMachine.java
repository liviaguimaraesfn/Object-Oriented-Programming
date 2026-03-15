package lab4;

public class WashingMachine {
	
	// Attributes (fields)
	private String brand;
	private String model;
	private double capacityKg;
	private int powerWatts;
	
	// Constructors
	// calls setters for all four attributes
	public WashingMachine(String brand, String model, double capacityKg, int powerWatts) {
		setBrand(brand);
    	setModel(model);
		setCapacityKg(capacityKg);
    	setPowerWatts(powerWatts);
	}
	
	// Methods
	public String startWash() {
		return "The washing machine has started washing.";
	}
	/* 
	public void startWash()
	{
	System.out.println("The washing machine has started washing.") ;
	}
	*/
	
	public String stopWash() {
		return "The washing machine has stopped.";
	}
	/*
	public void startWash()
	{
	System.out.println("The washing machine has stopped.") ;
	}
	 */
	
	// adding/generating getters & setters automatically (source > generate getters and setters > select all
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double getCapacityKg() {
		return capacityKg;
	}

	public void setCapacityKg(double capacityKg) {
		this.capacityKg = capacityKg;
	}

	public int getPowerWatts() {
		return powerWatts;
	}

	public void setPowerWatts(int powerWatts) {
		this.powerWatts = powerWatts;
	}
	
	// adding validation to brand
	public void setBrand(String brand) {
		if (brand == null || brand.isBlank()) {
			this.brand = "Unknown";
		} else {
			this.brand = brand.trim();
		}
	}

	// adding validation (setters) to model
	public void setModel(String model) {
		if (model == null || model.isBlank()) {
			this.model = "Unknown";
		} else {
			this.model = model.trim();
		}
	}
	
	// adding/generating toString (getters) automatically (source > generate toString > getters methods
	@Override
	public String toString() {
		return "WashingMachine [brand=" + brand + ", model=" + model + ", capacityKg=" + capacityKg + ", powerWatts="
				+ powerWatts + ", getBrand()=" + getBrand() + ", getModel()=" + getModel() + ", getCapacityKg()="
				+ getCapacityKg() + ", getPowerWatts()=" + getPowerWatts() + "]";
	}	
}