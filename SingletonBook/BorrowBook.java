package SingletonBook;

import static SingletonBook.SingletonBook.isLoanedOut;
import static SingletonBook.SingletonBook.singletonBook;

public class BorrowBook {
    public static SingletonBook borrowBook() {
        if (!isLoanedOut) {
            if(singletonBook == null) {
                singletonBook = new SingletonBook();
            }
            isLoanedOut = true;
            return singletonBook;
        }
        return null;
    }
    public static void returnBook(SingletonBook bookReturned) {
        isLoanedOut = false;
    }

}

