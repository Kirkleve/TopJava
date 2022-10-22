package lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = new Player(player1.getName());
        this.player2 = new Player(player2.getName());
    }

    public void start() {
        System.out.println("Компьютер загадал число, попробуйте его отгадать,\n" +
                "тот кто отгадал число первым побеждает, ход первого игрока определяется случайно.\n" +
                "У каждого игрока всего 10 попыток!");
        generateSecretNumber();
        castLots();
        int count = 1;
        while (true) {
            if (makeMove(player1) || makeMove(player2)) {
                break;
            }
            if (count == 10) {
                System.out.println("Ха Ха компьютер победил)");
                break;
            }
            count++;
        }
        printPlayerNumbers(player1);
        printPlayerNumbers(player2);
        player1.clear();
        player2.clear();
    }

    private void generateSecretNumber() {
        secretNumber = (int) ((Math.random() * 100) + 1);
    }

    private void castLots() {
        int randomPlayer = 1 + (int) (Math.random() * 2);
        if (randomPlayer == 2) {
            Player temp = player2;
            player2 = player1;
            player1 = temp;
        }
    }

    private boolean makeMove(Player player) {
        System.out.printf("%d попытка %s угадай число:%n", player.getCount() + 1, player.getName());
        int number = new Scanner(System.in).nextInt();
        player.addNumber(number);
        if (number == secretNumber) {
            System.out.printf("Поздравляю игрок %s угадал число %d с %d попытки%n",
                    player.getName(), secretNumber, player.getCount());
            return true;
        }
        if (number > secretNumber)
            System.out.println("Число больше загаданного");
        else
            System.out.println("Число меньше загаданного");
        if (player.getCount() == 9)
            System.out.printf("У игрока %s закончились попытки\n", player.getName());
        return false;
    }

    private void printPlayerNumbers(Player player) {
        System.out.println("Числа которые игрок " + player.getName() + " называл:");
        int[] copyNumber = Arrays.copyOf(player.getNumbers(), player.getCount());
        for (int numbers: copyNumber) {
            System.out.print(numbers + " ");
        }
        System.out.println();
    }
}
