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
            while (true) {
                if (makeMove(players)) {
                    break;
                }
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
        for (int i = players.length - 1; i > 0 ; i--) {
            int position = (int) (Math.random() * i);
            Player temp = players[position];
            players[position] = players[i];
            players[i] = temp;
        }
    }

    private boolean makeMove(Player... players) {
        Scanner scanner = new Scanner(System.in);
        for (Player player : players) {
            System.out.printf("%d попытка %s угадай число:%n", player.getCount() + 1, player.getName());
            int number;
            do {
                number = scanner.nextInt();
            } while (player.addNumber(number));
            if (number == secretNumber) {
                System.out.printf("Поздравляю игрок %s угадал число %d с %d попытки%n",
                        player.getName(), secretNumber, player.getCount());
                player.countRoundWin();
                return true;
            }
            System.out.println("Число " + (number > secretNumber ? "больше" : "меньше") + " загаданного");
            if (player.getCount() == 9) {
                System.out.printf("У игрока %s закончились попытки\n", player.getName());
            }
        }
        return false;
    }

    private void printPlayersNumbers() {
        int[] copyNumbers;
        for (Player player : players) {
            System.out.println("Числа которые игрок " + player.getName() + " называл:");
            copyNumbers = player.getNumbers();
            for (int number : copyNumbers) {
                System.out.print(number + " ");
            }
            System.out.println();
            player.clear();
        }
    }

    private void findWinner() {
        for (int i = 0; i < players.length - 1; i++) {
            for (int j = 0; j < players.length - i - 1; j++) {
                if (players[j + 1].getCountRoundWin() > players[j].getCountRoundWin()) {
                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
        StringBuilder winner = new StringBuilder(players[0].getName());
        for (int i = 1; i < players.length; i++) {
            if (players[0].getCountRoundWin() == players[i].getCountRoundWin())
                winner.append(" ").append(players[i].getName());
        }
        System.out.println("И побеждает в " + ROUND_LIMIT + " раундах: " +
                winner + "!\nУра Ура Ура!");
    }
}
