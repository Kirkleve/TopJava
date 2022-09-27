package lesson_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    int compNumber;
    int playerNumber;

    public int getCompNumber() {
        return compNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void hiddeNumber() {
        Random random = new Random();
        compNumber = random.nextInt(100);
    }

    public int whoStartGame() {
        int randomPlayer = 1 + (int)(Math.random() * 2);
        return randomPlayer;
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
}
