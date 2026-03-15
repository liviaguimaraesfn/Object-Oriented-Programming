package appliance;

public class Control {
	public static void main(String[] args) {
		// create a WashingMachine object using constructor
		WashingMachine wm = new WashingMachine("Bosch", "EcoClean", 7.0, 1800);
		wm.startWash();
		wm.stopWash();
		System.out.println(wm); //print
		
		//TestCode append to main in Control.java
		Dryer d = new Dryer("Samsung", "QuickDry", 8.0, true);
		d.startDry();
		d.stopDry();
		System.out.println(d);
		
		Appliance[] appliances = {
				new WashingMachine("Bosch", "EcoClean", 7.0, 1800),
				new Dryer("Samsung", "QuickDry", 8.0, true),
				new WashingMachine("LG", "TurboWash", 9.0, 2000)
		};
		
		for (Appliance a : appliances) {
			System.out.println(a); // calls the correct overridden toString()
		}
	}
}