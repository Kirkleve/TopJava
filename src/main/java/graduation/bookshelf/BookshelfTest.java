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
                case 1 -> printBook(bookshelf);
                case 2 -> addBook(bookshelf);
                case 3 -> name(bookshelf);
                case 4 -> {
                    bookshelf.clear();
                    System.out.println("Все книги с полок сметены.");
                }
                case 5 -> {
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
                2.Добавить книгу на полку
                3.Убрать книгу с полки
                4.Очистить шкаф
                5.Покинуть книжный шкаф
                """.indent(2) + "Выберите номер действия: ");
    }

    private static void addBook(Bookshelf bookshelf) {
        scanner.nextLine();
        System.out.print("Введите автора: ");
        String author = scanner.nextLine();
        System.out.print("Введите название книги: ");
        String name = scanner.nextLine();
        try {
            System.out.print("Введите год книги: ");
            int year = scanner.nextInt();
            bookshelf.add(new Book(author, name, year));
            System.out.println("\nКнига на полке!");
        } catch (InputMismatchException e) {
            System.out.println("Введите год цифрами! Книгу с не верными данными на полку класть нельзя!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недостаточно места на полке!");
        }
    }

    private static void name(Bookshelf bookshelf) {
        scanner.nextLine();
        System.out.print("Введите название книги которую хотите удалить: ");
        String deleteName = scanner.nextLine();
        System.out.println((bookshelf.name(deleteName)) ? "Книга сметена с полки!"
                : "Книги с таким названием в этом книжном шкафу нету!");
    }

    public static void printBook(Bookshelf bookshelf) {
        int length = bookshelf.takeBook().length;
        if (length == 0)
            System.out.println("На полках ещё нету книг, но у вас есть возможность их туда положить.");
        else {
            System.out.println("Шкаф содержит " + length + " книг. Свободно "
                    + bookshelf.freeShelf() + " полок." );
            for (int i = 0; i < length; i++) {
                System.out.print(bookshelf.takeBook()[i]);
            }
            System.out.printf("|%40s|\n", " ");
        }
    }
}
