package lab5;
/**
 * Represents a general library item for ONE library branch.
 * Provides unique sequential IDs and shared branch information. @author Livia */

public abstract class LibraryItem {  
	/** TODO 1: Add a field for the branch code (same for all items)
    Every LibraryItem shares the same branch code (e.g. x x int BRANCH_CODE = 1100) */
	public static final int BRANCH_CODE = 3101;
	
    /** TODO 2: Add a counter to track the next available ID number. nextID
	the whole class shares one counter. eg x x x nextID=1 ; */
	private static int nextID = 1;
	 
    private final String itemId;
    private final String title;

	/** TODO 3: In the constructor, fix the String.format and apply post-increment to nextID.
    itemId should be assigned a formatted string value based on nextID so that it appears
    as 001, 002, 003, etc. (Hint: use "%03d" in String.format), read hints in instructions
    After assigning the formatted value, increment nextID. Format itemID such as 3101-001 etc */
    public LibraryItem(String title) {
        this.title = title;
        this.itemId = String.format("%d-%03d", BRANCH_CODE, nextID);
        nextID++;
    }

    public String getItemId() { return itemId; }
    public String getTitle()  { return title;  }

    public abstract int getLoanDays();

    public String describe() {
        return "[#" + itemId + " | " + title + " | Loan: " + getLoanDays() + " days]";
    }
    public static int getNextId() {
        return nextID;
    }
}