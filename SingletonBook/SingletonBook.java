package SingletonBook;

public class SingletonBook {
    private String author;
    private String title;
    public static SingletonBook singletonBook;
    public static boolean isLoanedOut;
    public SingletonBook(){
        author = "Gamma, Helm, Johnson, and Vlissides";
        title  = "Design Patterns";
        singletonBook = null;
        isLoanedOut = false;
    }
    public String  getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }
}
