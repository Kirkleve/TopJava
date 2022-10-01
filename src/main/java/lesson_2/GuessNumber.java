package lesson_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = new Player(player1.getName());
        this.player2 = new Player(player2.getName());
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер загадал число, попробуйте его отгадать,\n" +
                "тот кто отгадал число первым побеждает, ход первого игрока определяется случайно");
        generateRandomNumber();
        int randomPlayer = 1 + (int) (Math.random() * 2);
        if (randomPlayer == 2) {
            Player temp = player2;
            player2 = player1;
            player1 = temp;
        }
        while (true) {
            if (makeMove(player1)) break;
            if (makeMove(player2)) break;
        }
    }

    public void generateRandomNumber() {
        int randomPlayer = (int) ((Math.random() * 10) + 1);
        secretNum = randomPlayer;
    }

    public boolean makeMove(Player player) {
        System.out.printf("%s угадай число:%n", player.getName());
        player.setNumber(new Scanner(System.in).nextInt());
        if (player.getNumber() == secretNum) {
            System.out.printf("Поздравляю игрок %s победил!)%n", player.getName());
            return true;
        }
        else if (player.getNumber() > secretNum)
            System.out.println("Число больше загаданного");
        else
            System.out.println("Число меньше загаданного");
        return false;
    }
}
