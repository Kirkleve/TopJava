package graduation.bookshelf;

import java.util.Arrays;

public class Book {
    private final String author;
    private final String title;
    private final int yearPublication;
    private final int lengthShelf;

    public Book(String author, String title, int yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
        lengthShelf = (author + title + Arrays.toString(new int[]{yearPublication})).length() + 2;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return author + ", " + title + ", " + yearPublication;
    }

    public int getLengthShelf() {
        return lengthShelf;
    }
}
