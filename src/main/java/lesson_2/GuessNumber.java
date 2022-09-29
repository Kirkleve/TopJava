package lesson_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private String namePlayer1;
    private String namePlayer2;
    private int compNumber;
    private int playerNumber1;
    private int playerNumber2;

    public GuessNumber(String player1, String player2) {
        namePlayer1 = player1;
        namePlayer2 = player2;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер загадал число, попробуйте его отгадать,\n" +
                "тот кто отгадал число первым побеждает, ход первого игрока определяется случайно");
        randomNumber();
        int randomPlayer = 1 + (int) (Math.random() * 2);
        if (randomPlayer == 2) {
            String temp = namePlayer2;
            namePlayer2 = namePlayer1;
            namePlayer1 = temp;
        }
        while (playerNumber1 != compNumber &&
                playerNumber2 != compNumber) {
            playerNumber1 = movesPlayer(namePlayer1, compNumber);
            if (playerNumber1 == compNumber) break;
            playerNumber2 = movesPlayer(namePlayer2, compNumber);
        }
    }

    public int movesPlayer(String player, int compNumber) {
        System.out.printf("%s угадай число:%n", player);
        int numberPlayer = new Scanner(System.in).nextInt();
        if (numberPlayer < compNumber)
            System.out.println("Число меньше загаданного");
        else if (numberPlayer > compNumber)
            System.out.println("Число больше загаданного");
        else System.out.printf("Поздравляю игрок %s победил!)%n", player);
        return numberPlayer;
    }

    public void randomNumber() {
        Random random = new Random();
        compNumber = random.nextInt(100);
    }
}
