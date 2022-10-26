package graduation.bookshelf;

public class Book {
    private final String author;
    private final String title;
    private final int yearPublication;

    public Book(String author, String title, int yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        String line = "-".repeat(40);
        String book = author + ", " + title + ", " + yearPublication;
        return """
                |%-40s|
                |%s|
                """.formatted(book, line);
    }
}
