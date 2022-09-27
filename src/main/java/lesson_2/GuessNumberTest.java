package lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Угадай число");
        System.out.print("Имя первого игрока: ");
        Player player1 = new Player();
        System.out.print("Имя второго игрока: ");
        Player player2 = new Player();
        GuessNumber guessNumber = new GuessNumber();
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                System.out.println("Компьютер загадал число, попробуйте его отгадать,\n" +
                        "тот кто отгадал число первым побеждает, ход первого игрока определяется случайно");
                guessNumber.randomNumber();
                System.out.println(guessNumber.getCompNumber());
                if (guessNumber.whoStartGame() == 2) {
                    String temp = player2.getName();
                    player2.setName(player1.getName());
                    player1.setName(temp);
                }
                while (player1.getNumber() != guessNumber.getCompNumber() &&
                        player2.getNumber() != guessNumber.getCompNumber()) {
                    player1.setNumber(guessNumber.movesPlayer(player1.getName(), guessNumber.getCompNumber()));
                    if (player1.getNumber() == guessNumber.getCompNumber()) break;
                    player2.setNumber(guessNumber.movesPlayer(player2.getName(), guessNumber.getCompNumber()));
                }
                System.out.println("\nХотите повторить игру? [yes/no]:");
                choice = new Scanner(System.in).nextLine();
            } else {
                System.out.println("Хотите повторить игру? [yes/no]:");
                choice = new Scanner(System.in).nextLine();
            }
        }
        System.out.println("До новых встреч!");
    }
}
