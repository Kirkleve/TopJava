package lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                System.out.println("Введите математическую операцию, в формате 2 + 2");
                String mathExpression = scanner.nextLine();
                int calculate = Calculator.calculate(mathExpression);
                if (calculate == 0) {
                    System.out.println("Попробуйте снова");
                } else {
                    System.out.println(mathExpression + " = " + calculate);
                }
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            choice = scanner.nextLine();
        }
        System.out.println("Прощайте! Рад был помочь.");
    }
}
