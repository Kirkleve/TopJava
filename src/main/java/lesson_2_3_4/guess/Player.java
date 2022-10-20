package lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int[] numbers = new int[10];
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number, int count) {
        this.numbers[count] = number;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
