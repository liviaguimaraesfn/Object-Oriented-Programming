package week4;

public class Control {
    public static void main(String[] args) {
        
        // Create a Movie object
        Movie m1 = new Movie("Avengers", "Action", 143);
        Movie m2 = new Movie("Wicked", "Fantasy", 160);
        Movie m3 = new Movie("Now You See Me", "Action", 115);
        Movie m4 = new Movie("Thor", "Action", 114);
        Movie m5 = new Movie("Sing", "Fantasy", 108);
        
        // Print the details of the movies
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        
        // Call setters/getters (including an invalid duration test) 
        System.out.println("\n-- Setter/Getter tests --"); 
        m3.setDurationMinutes(500); // invalid (too long) -> should print a warning 
        System.out.println(m3.getTitle() + " duration (after invalid set): " + m3.getDurationMinutes()); 
        m3.setDurationMinutes(130); // valid 
        System.out.println(m3.getTitle() + " duration (after valid set): " + m3.getDurationMinutes()); 

        // Fix m4 by setting a valid duration 
        m4.setDurationMinutes(90); 
        System.out.println(m4.getTitle() + " duration (after fix): " + m4.getDurationMinutes());  
        
        // calling playTrailer() for each
        m1.playTrailer();
        m2.playTrailer();
        m3.playTrailer();
        m4.playTrailer();
        m5.playTrailer();
    }
}


