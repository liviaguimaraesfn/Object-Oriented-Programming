/*
 * Customer.java
 * TU858/2 Object-Oriented Programming Lab
 *
 * This class represents a Customer object with three attributes:
 *
 * Author: Livia Guimaraes
 * Date: 30/09/2025
 */

package w2;

public class Customer {

    // Attributes (fields) for each customer
	String firstName; // customer's first name
	String surname; // customer's surname
	String city; // customer's city
	int customerNumber; // customer's number
	int loyaltyPoints; // customer's amount of loyalty points

    // Default constructor (creates an empty customer object)
    public Customer() {
    }

    // Constructor with three parameters: firstName, surname, and city
    public Customer(String firstName, String surname, String city) {
        this.firstName = firstName;
        this.surname = surname;
        this.city = city;
    }

    // Constructor with all five attributes
    public Customer(String firstName, String surname, String city, int customerNumber, int loyaltyPoints) {
        this.firstName = firstName;
        this.surname = surname;
        this.city = city;
        this.customerNumber = customerNumber;
        this.loyaltyPoints = loyaltyPoints;
    }
    
    // Method to return a string with the customer's details
    // This overrides the default toString() method in Java
    @Override
    public String toString() {
        // Build a readable version of the attributes
        return "firstName=" + this.firstName + ", surname=" + this.surname + ", city=" + this.city + ", customerNumber=" + this.city + ", loyaltyPoints=" + this.loyaltyPoints;
    }
    
    public String toUpperCase() {
    	// Converts all of the characters in this String to upper case using the rules of the default locale.
    	return city.toUpperCase();
    }
}