package lab4;

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
	}
}