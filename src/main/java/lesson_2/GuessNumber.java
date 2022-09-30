package lesson_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player namePlayer1;
    private Player namePlayer2;
    private int compNumber;

    public GuessNumber(Player player1, Player player2) {

        namePlayer1 = new Player(player1.getName());
        namePlayer2 = new Player(player2.getName());
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер загадал число, попробуйте его отгадать,\n" +
                "тот кто отгадал число первым побеждает, ход первого игрока определяется случайно");
        generatesRandomNumber();
        int randomPlayer = 1 + (int) (Math.random() * 2);
        if (randomPlayer == 2) {
            Player temp = namePlayer2;
            namePlayer2 = namePlayer1;
            namePlayer1 = temp;
        }
        while (true) {
            movesPlayer(namePlayer1, compNumber);
            if (namePlayer1.getNumber() == compNumber) break;
            movesPlayer(namePlayer2, compNumber);
        }
    }

    public void generatesRandomNumber() {
        Random random = new Random();
        random.setSeed(1);
        compNumber = random.nextInt(101);
    }

    public boolean movesPlayer(Player player, int compNumber) {
        System.out.printf("%s угадай число:%n", player.getName());
        player.setNumber(new Scanner(System.in).nextInt());
        if (player.getNumber() < compNumber)
            System.out.println("Число меньше загаданного");
        else if (player.getNumber() > compNumber)
            System.out.println("Число больше загаданного");
        else {
            System.out.printf("Поздравляю игрок %s победил!)%n", player.getName());
            return true;
        }
        return false;
    }
}
