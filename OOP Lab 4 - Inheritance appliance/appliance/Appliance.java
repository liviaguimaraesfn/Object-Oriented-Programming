package appliance;

// Appliance with the common parts – attributes and methods
public class Appliance {
	
	// Attributes (fields)
	private String brand;
	private String model;
	private double capacityKg;

	// Constructors
	// calls setters for all four attributes
	public Appliance(String brand, String model, double capacityKg) {
		setBrand(brand);
		setModel(model);
		setCapacityKg(capacityKg);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (brand == null || brand.isBlank()) {
			this.brand = "Unknown";
		} else {
			this.brand = brand.trim();
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model == null || model.isBlank()) {
			this.model = "Unknown";
		} else {
			this.model = model.trim();
		}
	}

	public double getCapacityKg() {
		return capacityKg;
	}

	public void setCapacityKg(double capacityKg) {
		this.capacityKg = capacityKg;
	}

	@Override
	public String toString() {
		return "appliance [getBrand()=" + getBrand() + ", getModel()=" + getModel() + ", getCapacityKg()=" + getCapacityKg() + "]";
	}	
}