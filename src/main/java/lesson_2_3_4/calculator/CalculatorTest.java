package lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                System.out.print("Введите первое число: ");
                int number1 = scanner.nextInt();
                calculator.setNumber1(number1);
                System.out.print("Введите знак математической операции: ");
                scanner.nextLine();
                char mathSign = scanner.nextLine().charAt(0);
                while (mathSign != '+' && mathSign != '-' && mathSign != '*' && mathSign != '/'
                        && mathSign != '^' && mathSign != '%') {
                    System.out.println("Неверный математический символ, введите один из символов + - * / ^ %");
                    mathSign = new Scanner(System.in).nextLine().charAt(0);
                }
                calculator.setMathSign(mathSign);
                System.out.print("Введите второе число: ");
                int number2 = scanner.nextInt();
                calculator.setNumber2(number2);
                int result = calculator.calculate();
                System.out.printf("%d %c %d = %d%n", number1, mathSign, number2, result);
                scanner.nextLine();
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            choice = scanner.nextLine();
        }
        System.out.println("Прощайте! Рад был помочь.");
    }
}
