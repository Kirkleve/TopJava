package lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNum;
    private int countPlayer1;
    private int countPlayer2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = new Player(player1.getName());
        this.player2 = new Player(player2.getName());
    }

    public int getCountPlayer1() {
        return countPlayer1;
    }

    public int getCountPlayer2() {
        return countPlayer2;
    }

    public void setCountPlayer1(int countPlayer1) {
        this.countPlayer1 = countPlayer1;
    }

    public void setCountPlayer2(int countPlayer2) {
        this.countPlayer2 = countPlayer2;
    }

    public void start() {
        System.out.println("Компьютер загадал число, попробуйте его отгадать,\n" +
                "тот кто отгадал число первым побеждает, ход первого игрока определяется случайно.\n" +
                "У каждого игрока всего 10 попыток!");
        generateRandomNumber();
        int randomPlayer = 1 + (int) (Math.random() * 2);
        if (randomPlayer == 2) {
            Player temp = player2;
            player2 = player1;
            player1 = temp;
        }
        countPlayer1 = 0;
        countPlayer2 = 0;
        while (true) {
            if (makeMove(player1, countPlayer1++)) {
                break;
            }
            if (makeMove(player2, countPlayer2++)) {
                break;
            }
            if (countPlayer1 == 10 && countPlayer2 == 10) {
                System.out.println("Ха Ха компьютер победил)");
                break;
            }
        }
    }

    private void generateRandomNumber() {
        secretNum = (int) ((Math.random() * 100) + 1);
    }

    private boolean makeMove(Player player, int count) {
        System.out.printf("%d попытка %s угадай число:%n",count + 1, player.getName());
        int number = new Scanner(System.in).nextInt();
        player.setNumber(number, count);
        if (number == secretNum) {
            System.out.printf("Поздравляю игрок %s угадал число %d с %d попытки%n",
                    player.getName(), secretNum, count);
            System.out.println("Числа которые игрок " + player.getName() + " называл:");
            int[] copyNumber = Arrays.copyOf(player.getNumber(), count + 1);
            for (int arr: copyNumber) {
                System.out.print(arr + " ");
            }
            return true;
        }
        if (number > secretNum)
            System.out.println("Число больше загаданного");
        else
            System.out.println("Число меньше загаданного");
        if (count == 9)
            System.out.printf("У игрока %s закончились попытки\n", player.getName());
        return false;
    }
}
