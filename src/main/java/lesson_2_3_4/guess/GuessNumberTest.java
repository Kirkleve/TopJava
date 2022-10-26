package lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Угадай число");
        System.out.print("Сколько игроков будет?: ");
        Scanner scanner = new Scanner(System.in);
        int countPlayers = scanner.nextInt();
        Player[] players = createPlayers(countPlayers);
        System.out.print("Сколько раундов вы хотите?: ");
        GuessNumber game = new GuessNumber(scanner.nextInt(), players);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите повторить игру? [yes/no]:");
            scanner.nextLine();
            choice = scanner.nextLine();
        }
        System.out.println("До новых встреч!");
    }

    public static Player[] createPlayers(int countPlayers) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[countPlayers];
        int count = 1;
        for (int i = 0; i < countPlayers; i++) {
            System.out.print("Введите имя " + count + " игрока: ");
            players[i] = new Player(scanner.nextLine());
            count++;
        }
        return players;
    }
}
