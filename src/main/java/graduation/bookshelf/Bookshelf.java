package graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int countBooks;
    private final Book[] books = new Book[10];

    public Book[] getAll() {
        return Arrays.copyOf(books, countBooks);
    }

    public int findFreeShelf() {
        return books.length - countBooks;
    }

    public Book find(String name) {
        for (int i = 0; i < countBooks; i++) {
            if (name.equals((books[i]).getTitle())) {
                return books[i];
            }
        }
        return null;
    }

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public boolean delete(String name) {
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

    public int getCountBooks() {
        return countBooks;
    }
}

