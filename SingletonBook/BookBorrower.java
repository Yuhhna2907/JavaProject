package SingletonBook;

public class BookBorrower {
    private SingletonBook borrowedBook;
    private boolean haveBookBorrowed = false;

    public void borrowBook() {
        borrowedBook = BorrowBook.borrowBook();
        if (borrowedBook == null) {
            haveBookBorrowed = false;
        }
        else {
            haveBookBorrowed = true;
        }
    }
    public String getAuthorAndTitle() {
       if(haveBookBorrowed) {
           return borrowedBook.getAuthorAndTitle();
       }
       return "I don't have the book";
    }
    public void returnBook() {
        BorrowBook.returnBook(borrowedBook);
    }

}
