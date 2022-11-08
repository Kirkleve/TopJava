package graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int countBooks;
    private static final Book[] books = new Book[10];
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
        if (books[countBooks - 1].getLengthShelf() > maxLengthShelf) {
            int[] length = findLengthShelf();
            maxLengthShelf = length[length.length - 1];
        }
    }

    public boolean delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(books[i].getTitle())) {
                if (books[i].getLengthShelf() == maxLengthShelf) {
                    int[] length = findLengthShelf();
                    if (1 < countBooks) {
                        maxLengthShelf = length[length.length - 2];
                    } else maxLengthShelf = length[0];
                }
                countBooks--;
                if (i < countBooks) {
                    System.arraycopy(books, i + 1, books, i, countBooks - i);
                }
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

    public int[] findLengthShelf() {
        int[] arr = new int[countBooks];
        for (int i = 0; i < countBooks; i++) {
            arr[i] = books[i].getLengthShelf();
        }
        Arrays.sort(arr);
        return arr;
    }
}

