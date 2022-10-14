package lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                System.out.println("Введите математическую операцию, в формате 2 + 2");
                String mathExpression = scanner.nextLine();
                calculator.setMathExpression(mathExpression);
                calculator.checkMathSing();
                int number1 = calculator.getNumber1();
                String mathSign = calculator.getMathSign();
                int number2 = calculator.getNumber2();
                int result = calculator.calculate();
                System.out.printf("%d %s %d = %d%n", number1, mathSign, number2, result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            choice = scanner.nextLine();
        }
        System.out.println("Прощайте! Рад был помочь.");
    }
}
