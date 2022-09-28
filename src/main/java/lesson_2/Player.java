package lesson_2;

import java.util.Scanner;

public class Player {
    private String name;
    private int number;

    public Player(String namePlayer) {
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
