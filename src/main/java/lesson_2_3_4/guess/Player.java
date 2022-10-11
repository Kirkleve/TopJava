package lesson_2_3_4.guess;

public class Player {
    private final String name;
    private int[] number = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int count) {
        this.number[count] = number;
    }

    public int[] getNumber() {
        return number;
    }
}
