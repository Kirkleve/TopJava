package lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                System.out.println("Введите математическую операцию, в формате 2 + 2");
                try {
                    String mathExpression = scanner.nextLine();
                    System.out.println(mathExpression + " = " + Calculator.calculate(mathExpression));
                } catch (NumberFormatException e) {
                    System.out.println("Только целое, не отрицательное число, не забываем " +
                            "пробелы и ни каких букв!");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            choice = scanner.nextLine();
        }
        System.out.println("Прощайте! Рад был помочь.");
    }
}
