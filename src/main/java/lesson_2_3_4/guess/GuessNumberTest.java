package lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Угадай число");
        System.out.print("Имя первого игрока: ");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);
        System.out.print("Имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);
        GuessNumber game = new GuessNumber(player1, player2);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                game.start();
                Arrays.fill(player1.getNumber(),0, game.getCountPlayer1(), 0);
                Arrays.fill(player2.getNumber(),0, game.getCountPlayer2(), 0);
            }
            System.out.println("\nХотите повторить игру? [yes/no]:");
            choice = scanner.nextLine();
        }
        System.out.println("До новых встреч!");
    }
}
