/*
 * Control.java
 * TU856/2 TU858/2 Object-Oriented Programming Lab
 *
 * This is the main program used to test the Book class.
 * It demonstrates:
 *  - Creating Book objects using different constructors
 *  - Printing object details using toString()
 *  - Using the titleLength() method (which calls the String length() method)
 *
 * Author: Colette Kirwan
 * Date: 28/09/2025
 */

package w2;

public class Control {
    public static void main(String[] args) {
        
        // Create a Book object using the constructor with ISBN + title
        Book javabook = new Book(1234567, "TUD Learning Java");

        // Create another Book object using the constructor with all fields
        Book b1 = new Book(12345, "Java Basics", "Alice Smith");
        
        // Create a Customer object using the constructor with all five attributes
        Customer c1 = new Customer("Livia", "Guimaraes", "Belo Horizonte", 123, 31);
        Customer c2 = new Customer("Kashish", "Kakran", "Mumbai", 124, 30);
        Customer c3 = new Customer("Yana", "Chulovska", "Kyiv", 125, 29);
        Customer c4 = new Customer("Dami", "Tinubu", "Dublin", 126, 28);
        Customer c5 = new Customer("Faith", "Omotayo", "Abuja", 127, 27);

        // Print the details of the books
        // The toString() method makes the output easy to read --(when you print the object - toString() is called behind the scenes)
        System.out.println(javabook);
        System.out.println(b1); // Note: println() automatically calls toString() so you don’t need to write b1.toString()

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        
        // Use the titleLength() method to find out how many characters are in the title
        System.out.println("Title length of '" + b1.m_title + "' is: " + b1.titleLength());

        // creating more Book objects with different values
        Book b2 = new Book(54321, "Advanced Java", "Bob Jones");
        System.out.println(b2);
        
        // Use the toUpperCase() method to print the city names in upper case       
        System.out.println("Customers from the following cities: " + c1.toUpperCase() + ", " + c2.toUpperCase() + ", " + c3.toUpperCase() + ", " + c4.toUpperCase() + ", " + c5.toUpperCase());
    }
}