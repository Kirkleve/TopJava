package lesson_2;

import java.util.Scanner;

public class Player {
    String name;
    int number;

    public Player() {
        String namePlayer = new Scanner(System.in).nextLine();
        name = namePlayer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
