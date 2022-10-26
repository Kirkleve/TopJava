package lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private final Player[] players;
    private int secretNumber;
    private final int ROUND_LIMIT;

    public GuessNumber(int ROUND_LIMIT, Player... player) {
        this.ROUND_LIMIT = ROUND_LIMIT;
        this.players = player;
    }

    public void start() {
        System.out.println("Компьютер загадал число, попробуйте его отгадать,\n" +
                "тот кто отгадал число первым побеждает, ход первого игрока определяется случайно.\n" +
                "У каждого игрока всего 10 попыток! И у вас " + ROUND_LIMIT + " раунд(а)");
        int countAttempts = 1;
        int countRound = 1;
        while (countRound <= ROUND_LIMIT) {
            System.out.println(countRound + " раунд");
            generateSecretNumber();
            castLots();
            while (makeMove(players)) {
                if (countAttempts == 10) {
                    System.out.println("Ха Ха компьютер победил)");
                    break;
                }
                countAttempts++;
            }
            printPlayersNumbers();
            countRound++;
        }
        findWinner();
    }

    private void generateSecretNumber() {
        secretNumber = (int) ((Math.random() * 100) + 1);
    }

    private void castLots() {
        for (int i = players.length - 1; i > 0; i--) {
            int position = (int) (Math.random() * i);
            Player temp = players[position];
            players[position] = players[i];
            players[i] = temp;
        }
    }

    private boolean makeMove(Player... players) {
        Scanner scanner = new Scanner(System.in);
        int count;
        String namePlayer;
        for (Player player : players) {
            count = player.getcount();
            namePlayer = player.getName();
            System.out.printf("%d попытка %s угадай число:%n", count + 1, namePlayer);
            int number = scanner.nextInt();
            while (player.addNumber(number)) {
                System.out.println("Вы ввели число " + (number > 100 ? "больше 100" : "меньше 1") +
                        ", можно вводить числа от 1 до 100\nПопробуйте ещё раз!");
                number = scanner.nextInt();
            }
            if (number == secretNumber) {
                System.out.printf("Поздравляю игрок %s угадал число %d с %d попытки%n",
                        namePlayer, secretNumber, count);
                player.countRoundWin();
                return true;
            }
            System.out.println("Число " + (number > secretNumber ? "больше" : "меньше") + " загаданного");
            if (count == 9) {
                System.out.printf("У игрока %s закончились попытки\n", namePlayer);
            }
        }
        return false;
    }

    private void printPlayersNumbers() {
        for (Player player : players) {
            System.out.println("Числа которые игрок " + player.getName() + " называл:");
            for (int number : player.getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println();
            player.clear();
        }
    }

    private void findWinner() {
        for (int i = 0; i < players.length - 1; i++) {
            for (int j = 0; j < players.length - i - 1; j++) {
                if (players[j + 1].getIncCountRoundWin() > players[j].getIncCountRoundWin()) {
                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
        StringBuilder winner = new StringBuilder(players[0].getName());
        for (int i = 1; i < players.length; i++) {
            if (players[0].getIncCountRoundWin() == players[i].getIncCountRoundWin())
                winner.append(" ").append(players[i].getName());
        }
        System.out.println("И побеждает в " + ROUND_LIMIT + " раундах: " +
                winner + "!\nУра Ура Ура!");
    }
}
