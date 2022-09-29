package lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Угадай число");
        System.out.print("Имя первого игрока: ");
        Scanner scanner = new Scanner(System.in);
        String namePlayer1 = scanner.nextLine();
        Player player1 = new Player(namePlayer1);
        System.out.print("Имя второго игрока: ");
        String namePlayer2 = scanner.nextLine();
        Player player2 = new Player(namePlayer2);
        GuessNumber guessNumber = new GuessNumber(player1.getName(), player2.getName());
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                guessNumber.startGame();
            }
            System.out.println("\nХотите повторить игру? [yes/no]:");
            choice = scanner.nextLine();
        }
        System.out.println("До новых встреч!");
    }
}
