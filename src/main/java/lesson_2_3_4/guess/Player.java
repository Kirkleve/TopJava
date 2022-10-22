package lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        if (number <= 100 && 0 < number) {
            numbers[count] = number;
            count++;
        } else
            System.out.println("Вы ввели число " + (number > 100 ? "больше 100" : "меньше 0") +
                    ", можно вводить числа от 0 до 100\nПопробуйте ещё раз!");
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, count);
    }

    public int getCount() {
        return count;
    }

    public void clear() {
        Arrays.fill(numbers, 0, count, 0);
        count = 0;
    }
}
