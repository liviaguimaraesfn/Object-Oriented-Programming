package lab5;
/** @author Livia */

/** class called movie */
public class Movie extends LibraryItem {
	/** field to store the director's name */
    private final String director;

    /** constructor called movie
    	@param director is the movie director's name
     	@param title is the movie's title */
    public Movie(String title, String director) {
        super(title);
        this.director = director;
    }
    
    /** TODO Add the missing methods hint you must override them
    	method called getLoanDays that returns number of loan days for a movie
    	@return the loan period in days */
    @Override
    public int getLoanDays() { return 7; }


    /** method called String describe that returns movie description
    	@return the movie description */
    @Override
    public String describe() {
        return super.describe() + " (Movie by " + director + ")";
    }
}