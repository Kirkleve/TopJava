package graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int countBooks;
    private final Book[] books = new Book[10];

    public Book[] getAllBook() {
        return Arrays.copyOf(books, countBooks);
    }

    public int findFreeShelf() {
        return books.length - countBooks;
    }

    public Book findBook(String name) {
        Book book = null;
        for (int i = 0; i < countBooks; i++) {
            if (name.equals((books[i]).getTitle())) {
                book = books[i];
            }
        }
        return book;
    }

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public boolean deleteBook(String name) {
        for (int i = 0; i < countBooks; i++) {
            if (name.equals(books[i].getTitle())) {
                System.arraycopy(books, i + 1, books, i, (countBooks--) - i);
                books[countBooks] = null;
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

