package graduation.bookshelf;

import java.util.ArrayList;
import java.util.Arrays;

public class Bookshelf {
    private int countBooks;
    private final ArrayList <Book> books = new ArrayList<>(2);

    public void printBook() {
        if (countBooks == 0)
            System.out.println("На полках ещё нету книг, но у вас есть возможность их туда положить.");
        else {
            System.out.println("Шкаф содержит " + countBooks + " книг.");
            for (int i = 0; i < countBooks; i++) {
                System.out.print(books.get(i));
            }
            System.out.printf("|%40s|\n", " ");
        }
    }

    public void addOnBookshelf(Book book) {
        books.add(countBooks, book);
        countBooks++;
    }

    public boolean deleteBook(String nameBook) {
        for (int i = 0; i < books.size(); i++) {
            if (nameBook.equals(books.get(i).getTitle())) {
                books.remove(i);
                for (int j = i + 1; j < books.size(); j++) {
                    Book temp = books.get(i);
                    books.add(i, books.get(j));
                    books.add(j, temp);
                }
                countBooks--;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(new ArrayList[]{books}, 0, countBooks, null);
        countBooks = 0;
    }
}
