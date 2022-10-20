package lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = new Player(player1.getName());
        this.player2 = new Player(player2.getName());
    }

    private void removeNumbers() {
        Arrays.fill(player1.getNumbers(),0, player1.getCount(), 0);
        Arrays.fill(player2.getNumbers(),0, player2.getCount(), 0);
        player1.setCount(0);
        player2.setCount(0);
    }

    public void start() {
        System.out.println("Компьютер загадал число, попробуйте его отгадать,\n" +
                "тот кто отгадал число первым побеждает, ход первого игрока определяется случайно.\n" +
                "У каждого игрока всего 10 попыток!");
        generateSecretNumber();
        int randomPlayer = 1 + (int) (Math.random() * 2);
        if (randomPlayer == 2) {
            Player temp = player2;
            player2 = player1;
            player1 = temp;
        }
        while (true) {
            player1.setCount(player1.getCount() + 1);
            player2.setCount(player2.getCount() + 1);
            if (makeMove(player1)) {
                break;
            }
            if (makeMove(player2)) {
                break;
            }
            if (player1.getCount() == 10 && player2.getCount() == 10) {
                System.out.println("Ха Ха компьютер победил)");
                removeNumbers();
                break;
            }
        }
    }

    private void generateSecretNumber() {
        secretNum = (int) ((Math.random() * 100) + 1);
    }

    private void printNumbersPlayer(Player player) {
        System.out.println("Числа которые игрок " + player.getName() + " называл:");
        int[] copyNumber = Arrays.copyOf(player.getNumbers(), player.getCount() + 1);
        for (int i = 1; i < copyNumber.length; i++) {
            System.out.print(copyNumber[i] + " ");
        }
    }

    private boolean makeMove(Player player) {
        System.out.printf("%d попытка %s угадай число:%n",player.getCount(), player.getName());
        int number = new Scanner(System.in).nextInt();
        player.addNumber(number, player.getCount());
        if (number == secretNum) {
            System.out.printf("Поздравляю игрок %s угадал число %d с %d попытки%n",
                    player.getName(), secretNum, player.getCount());
            printNumbersPlayer(player);
            removeNumbers();
            return true;
        }
        if (number > secretNum)
            System.out.println("Число больше загаданного");
        else
            System.out.println("Число меньше загаданного");
        if (player.getCount() == 9)
            System.out.printf("У игрока %s закончились попытки\n", player.getName());
        return false;
    }
}
