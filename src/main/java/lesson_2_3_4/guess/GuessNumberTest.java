package lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Угадай число");
        System.out.print("Сколько раундов вы хотите?: ");
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(scanner.nextInt(), namePlayer(1),
                namePlayer(2), namePlayer(3));
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

    public static Player namePlayer(int countPlayer){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя " + countPlayer + " игрока: ");
        String name = scanner.nextLine();
        return new Player(name);
    }
}
