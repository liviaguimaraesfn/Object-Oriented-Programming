package week4;

public class Movie {
    // Attributes (fields) as three class members
	private String title;
	private String genre;
	private int durationMinutes;
	
    // Default constructor (creates an empty movie object)
    public Movie() {
    }
    
    public int getDurationMinutes() {
    	return durationMinutes;
    }

    // Constructor that sets all three attributes
    public Movie(String title, String genre, int durationMinutes) {
        setTitle(title);
        setGenre(genre);
        setDurationMinutes(durationMinutes);
    }
    
    // Method to return a readable sentence describing the movie
    // This overrides the default toString() method in Java
    @Override
    public String toString() {
        return "title=" + getTitle() + ", genre=" + getGenre() + ", durationMinutes=" + getDurationMinutes();
    }
    
    // Method
    public void setDurationMinutes(int durationMinutes) {
    	if (durationMinutes <= 30 || durationMinutes >= 240) {
    		System.out.println("Invalid movie duration");
    	} else {
    		this.durationMinutes = durationMinutes;
    	}
    }
    
    // Use Source → Generate Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title.trim();
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void playTrailer() {
    	if (this.genre.equals("Action")) {
    		System.out.println("Explosive action trailer now playing!");
    	} else if (this.genre.equals("Romance")) {
        	System.out.println("Romantic preview showing...");	
    	} else {
        	System.out.println("Playing a generic movie trailer...");	
    	}		
	}
}