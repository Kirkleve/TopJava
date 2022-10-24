package lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int count;
    private int countRoundWin;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addNumber(int number) {
        if (number <= 100 && 0 < number) {
            numbers[count] = number;
            count++;
            return false;
        } else {
            System.out.println("Вы ввели число " + (number > 100 ? "больше 100" : "меньше 1") +
                    ", можно вводить числа от 1 до 100\nПопробуйте ещё раз!");
            return true;
        }
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, count);
    }

    public int getCount() {
        return count;
    }

    public int getCountRoundWin() {
        return countRoundWin;
    }

    public void countRoundWin() {
        countRoundWin++;
    }

    public void clear() {
        Arrays.fill(numbers, 0, count, 0);
        count = 0;
    }
}
