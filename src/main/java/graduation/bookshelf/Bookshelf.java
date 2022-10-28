//package graduation.bookshelf;
//
//import java.util.ArrayList;
//
//public class Bookshelf {
//    private final ArrayList<Book> books = new ArrayList<>();
//
//    public void printBook() {
//        if (books.size() == 0)
//            System.out.println("На полках ещё нету книг, но у вас есть возможность их туда положить.");
//        else {
//            System.out.println("Шкаф содержит " + books.size() + " книг.");
//            for (Book book : books) {
//                System.out.print(book);
//            }
//            System.out.printf("|%40s|\n", " ");
//        }
//    }
//
//    public void addOnBookshelf(Book book) {
//        books.add(book);
//    }
//
//    public boolean deleteBook(String nameBook) {
//        for (int i = 0; i < books.size(); i++) {
//            if (nameBook.equals(books.get(i).getTitle())) {
//                books.remove(books.get(i));
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void clear() {
//        books.clear();
//    }
//}
package graduation.bookshelf;

import java.util.ArrayList;
import java.util.Arrays;

public class Bookshelf {
    private int countBooks;
    private final Book[] books = new Book[10];

    public void printBook() {
        if (countBooks == 0)
            System.out.println("На полках ещё нету книг, но у вас есть возможность их туда положить.");
        else {
            System.out.println("Шкаф содержит " + countBooks + " книг. Свободно "
                    + (books.length - countBooks) + " полок." );
            for (int i = 0; i < countBooks; i++) {
                System.out.print(books[i]);
            }
            System.out.printf("|%40s|\n", " ");
        }
    }

    public void addOnBookshelf(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public boolean deleteBook(String nameBook) {
        for (int i = 0; i < books.length; i++) {
            if (nameBook.equals(books[i].getTitle())) {
                books[i] = null;
                for (int j = i + 1; j < books.length; j++) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
                countBooks--;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }
}

