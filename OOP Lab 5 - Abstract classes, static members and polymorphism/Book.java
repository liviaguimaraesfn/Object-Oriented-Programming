package lab5;
/** @author Livia */

/** class called book */
public class Book extends LibraryItem {
	/** field to store the author's name */
    private final String author;

    /** constructor called book
    	@param author is the book author's name
    	@param title is the book's title */
    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    /** method called getLoanDays that returns number of loan days for a book
    	@return the loan period in days */
    @Override
    public int getLoanDays() { return 21; }


    /** method called String describe that returns book description
    	@return the book description */
    @Override
    public String describe() {
        return super.describe() + " (Book by " + author + ")";
    }
}