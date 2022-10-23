package lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Угадай число");
        System.out.print("Введите имя первого игрока: ");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);
        System.out.print("Введите имя третьего игрока: ");
        String name3 = scanner.nextLine();
        Player player3 = new Player(name3);
        System.out.print("Сколько раундов вы хотите?: ");
        int round = scanner.nextInt();
        GuessNumber game = new GuessNumber(round ,player1, player2, player3);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите повторить игру? [yes/no]:");
            choice = scanner.nextLine();
        }
        System.out.println("До новых встреч!");
    }
}
