package graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int countBooks;
    private final Book[] books = new Book[10];
    private int maxLengthShelf;

    public Book[] getAll() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getCountShelf() {
        return books.length;
    }

    public int getMaxLengthShelf() {
        return maxLengthShelf;
    }

    public int findFreeShelf() {
        return books.length - countBooks;
    }

    public Book find(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(books[i].getTitle())) {
                return books[i];
            }
        }
        return null;
    }

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
        findLengthShelf();
    }

    public boolean delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(books[i].getTitle())) {
                countBooks--;
                if (i < countBooks) {
                    System.arraycopy(books, i + 1, books, i, countBooks - i);
                }
                books[countBooks] = null;
                findLengthShelf();
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }

    public void findLengthShelf() {
        maxLengthShelf = sort();
        for (int i = 0; i < countBooks; i++) {
            books[i].setPrintLength(maxLengthShelf);
        }
    }

    public int sort() {
        int[] arr = new int[countBooks];
        for (int i = 0; i < countBooks; i++) {
            arr[i] = books[i].getLengthShelf();
        }
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}

