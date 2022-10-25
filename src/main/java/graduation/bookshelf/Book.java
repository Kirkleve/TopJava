package graduation.bookshelf;

public class Book {
    private final String title;
    private final String author;
    private final int yearPublication;

    public Book(String title, String author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        String line = "-".repeat(40);
        String book = title + ", " + author + ", " + yearPublication;
        return """
                |%-40s|
                |%s|
                """.formatted(book, line);
    }
}
