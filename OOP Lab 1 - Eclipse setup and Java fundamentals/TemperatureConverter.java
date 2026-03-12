package ie.tudublin.cmpu2016.lab1;

import java.util.Scanner; // import statement

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner class works like scanf in C, but as an object
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter Celsius: ");
			double c = sc.nextDouble();
			double f = (c * 9.0 / 5.0) + 32.0;
			System.out.println("Fahrenheit = " + f);
		}
		sc.close(); // call to finish/close
		}
}