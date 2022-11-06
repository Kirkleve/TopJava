package graduation.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookshelfTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Вас приветствует книжный шкаф, здесь вы можете хранить свои книги!");
        Bookshelf bookshelf = new Bookshelf();
        while (true) {
            displayMenu();
            int menuItem = scanner.nextInt();
            System.out.println();
            switch (menuItem) {
                case 1 -> displayBookshelf(bookshelf);
                case 2 -> findBook(bookshelf);
                case 3 -> addBook(bookshelf);
                case 4 -> deleteBook(bookshelf);
                case 5 -> {
                    bookshelf.clear();
                    System.out.println("Все книги с полок сметены.");
                }
                case 6 -> {
                    System.out.println("До новых встреч.");
                    return;
                }
                default -> System.out.println("Неверный номер действия! Смотрите внимательнее!");
            }
            scanner.nextLine();
            System.out.print("\nДля продолжения работы нажмите Enter");
            scanner.nextLine();
        }
    }

    private static void displayMenu() {
        System.out.print("\nМеню:\n" + """
                1.Вывести на экран все книги
                2.Найти книгу
                3.Добавить книгу на полку
                4.Убрать книгу с полки
                5.Очистить шкаф
                6.Покинуть книжный шкаф
                """.indent(2) + "Выберите номер действия: ");
    }

    private static void findBook(Bookshelf bookshelf) {
        scanner.nextLine();
        System.out.println("Введите название книги которую хотите найти: ");
        String name = scanner.nextLine();
        Book findBook = bookshelf.find(name);
        System.out.println((findBook == null ? "Такой книги нету" : findBook));
    }

    private static void addBook(Bookshelf bookshelf) {
        if (bookshelf.getCountShelf() != bookshelf.getCountBooks()) {
            scanner.nextLine();
            System.out.print("Введите автора: ");
            String author = scanner.nextLine();
            System.out.print("Введите название книги: ");
            String name = scanner.nextLine();
            System.out.print("Введите год книги: ");
            try {
                int year = scanner.nextInt();
                bookshelf.add(new Book(author, name, year));
                System.out.println("\nКнига на полке!");
            } catch (InputMismatchException e) {
                System.out.println("Введите год цифрами! Книгу с не верными данными на полку класть нельзя!");
            }
        } else System.out.println("Извините места в шкафу нету!");
    }

    private static void deleteBook(Bookshelf bookshelf) {
        scanner.nextLine();
        System.out.print("Введите название книги которую хотите удалить: ");
        String deleteName = scanner.nextLine();
        System.out.println((bookshelf.delete(deleteName)) ? "Книга сметена с полки!"
                : "Книги с таким названием в этом книжном шкафу нету!");
    }

    public static void displayBookshelf(Bookshelf bookshelf) {
        int countBooks = bookshelf.getCountBooks();
        if (countBooks == 0)
            System.out.println("На полках ещё нету книг, но у вас есть возможность их туда положить.");
        else {
            System.out.println("Шкаф содержит " + countBooks + " книг. Свободно "
                    + bookshelf.findFreeShelf() + " полок.");
            for (Book book : bookshelf.getAll()) {
                System.out.print(book);
            }
            if (bookshelf.getCountShelf() != bookshelf.getCountBooks()) {
                String line = " ".repeat(bookshelf.getMaxLengthShelf());
                System.out.printf("|%s|\n", line);
            }
        }
    }
}
