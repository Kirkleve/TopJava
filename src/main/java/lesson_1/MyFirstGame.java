package lesson_1;

import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Угадай число");
        Random rnd = new Random();
        int compNumber = rnd.nextInt(10000);
        int min = 0;
        int max = 10000;
        int playerNumber = max / 2;
        int count = 0;
        while (playerNumber != compNumber) {
            if (playerNumber > compNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                max = playerNumber;
                playerNumber -= (max - min) / 2;
            } else if (playerNumber < compNumber){
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                min = playerNumber;
                playerNumber += (max - min) / 2;
            }
            count++;
        }
        System.out.println("Вы победили за " + count + " попыток");
    }
}
