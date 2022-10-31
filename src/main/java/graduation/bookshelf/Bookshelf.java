package graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int countBooks;
    private final Book[] books = new Book[10];

    public Book[] takeBook() {
        return Arrays.copyOf(books, countBooks);
    }

    public int freeShelf() {
        return books.length - countBooks;
    }

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public boolean name(String nameBook) {
        for (int i = 0; i < countBooks; i++) {
            if (nameBook.equals(books[i].getTitle())) {
                int shift = i+1;
                books[i] = null;
                System.arraycopy(books, shift, books, i, (countBooks--) - i);
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

