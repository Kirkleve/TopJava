package graduation.bookshelf;

import java.util.ArrayList;

public class Bookshelf {
    private final ArrayList<Book> books = new ArrayList<>();

    public void printBook() {
        if (books.size() == 0)
            System.out.println("На полках ещё нету книг, но у вас есть возможность их туда положить.");
        else {
            System.out.println("Шкаф содержит " + books.size() + " книг.");
            for (Book book : books) {
                System.out.print(book);
            }
            System.out.printf("|%40s|\n", " ");
        }
    }

    public void addOnBookshelf(Book book) {
        books.add(book);
    }

    public boolean deleteBook(String nameBook) {
        for (int i = 0; i < books.size(); i++) {
            if (nameBook.equals(books.get(i).getTitle())) {
                books.remove(books.get(i));
                return true;
            }
        }
        return false;
    }

    public void clear() {
        books.clear();
    }
}
