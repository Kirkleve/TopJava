package lesson_2;

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
                char mathOperation = scanner.nextLine().charAt(0);
                calculator.setMathOperation(mathOperation);
                System.out.print("Введите второе число: ");
                int number2 = scanner.nextInt();
                calculator.setNumber2(number2);
                System.out.printf("%d %c %d = %d%n", calculator.getNumber1(), calculator.getMathOperation(),
                        calculator.getNumber2(), calculator.calculate());
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                scanner.nextLine();
                choice = scanner.nextLine();
            } else {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                choice = scanner.nextLine();
            }
        }
        System.out.println("Прощайте! Рад был помочь.");
    }
}
