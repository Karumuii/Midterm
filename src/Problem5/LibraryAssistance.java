package Problem5;

public class LibraryAssistance extends ServiceRequest {

    public LibraryAssistance() {
        super("Library Assistance");
    }

    @Override
    public String process(String description) {
        return "Library Assistant checked the library concern: \"" + description
                + "\". Your book, borrowing or library-account concern is being reviewed.";
    }

}
