package graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        System.out.println("Вас приветствует книжный шкаф, здесь вы можете хранить свои книги!");
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        while (true) {
            outMenu();
            int menuItem = scanner.nextInt();
            System.out.println();
            switch (menuItem) {
                case 1 -> bookshelf.printBook();
                case 2 -> addBook(bookshelf);
                case 3 -> deleteBook(bookshelf);
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

    public static void outMenu() {
        System.out.print("\nМеню:\n" + """
                1.Вывести на экран все книги
                2.Добавить книгу на полку
                3.Убрать книгу с полки
                4.Очистить шкаф
                5.Покинуть книжный шкаф
                """.indent(2) + "Выберите номер действия: ");
    }

    public static void addBook(Bookshelf bookshelf) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите автора: ");
        String author = scanner.nextLine();
        System.out.print("Введите название книги: ");
        String name = scanner.nextLine();
        System.out.print("Введите год книги: ");
        int year = scanner.nextInt();
        bookshelf.addOnBookshelf(new Book(author, name, year));
        System.out.println("\nКнига на полке!");
    }

    public static void deleteBook(Bookshelf bookshelf) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги которую хотите удалить: ");
        String deleteName = scanner.nextLine();
        System.out.println((bookshelf.deleteBook(deleteName)) ? "Книга сметена с полки!"
                : "Книги с таким названием в этом книжном шкафу нету!");
    }
}
