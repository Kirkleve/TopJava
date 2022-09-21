package lesson_2;

import java.util.Scanner;

public class Calculator {
    private int number1;
    private int number2;
    private int result;
    private char symbol;

    public void setNumber1() {
        System.out.print("Введите первое число: ");
        number1 = new Scanner(System.in).nextInt();
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber2() {
        System.out.print("Введите второе число: ");
        number2 = new Scanner(System.in).nextInt();
    }

    public int getNumber2() {
        return number2;
    }

    public void setResult(int number1, int symbol, int number2) {
        switch (symbol) {
            case '+':
                result = number1 + number2;
                return;
            case '-':
                result = number1 - number2;
                return;
            case '*':
                result = number1 * number2;
                return;
            case '/':
                result = number1 / number2;
                return;
            case '^':
                int num = number1;
                for (int i = 1; i < number2; i++)
                    num *= number1;
                result = num;
                return;
            case '%':
                result = number1 % number2;
                return;
            default:
                System.out.println("Неверный матиматический знак");
        }
    }

    public void getResult() {
        System.out.printf("%d %c %d = %d%n", number1, symbol, number2, result);
    }

    public char setSymbol() {
        System.out.print("Введите знак математической операции: ");
        symbol = new Scanner(System.in).nextLine().charAt(0);
        while (symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/'
                && symbol != '^' && symbol != '%') {
            System.out.println("Неверный математический символ, введите один из символов + - * / ^ %");
            symbol = new Scanner(System.in).nextLine().charAt(0);
        }
        return symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void returnCalculation() {
        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        String choice = new Scanner(System.in).nextLine();
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                setNumber1();
                setSymbol();
                setNumber2();
                setResult(getNumber1(), getSymbol(), getNumber2());
                getResult();
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                choice = new Scanner(System.in).nextLine();
            } else {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                choice = new Scanner(System.in).nextLine();
            }
        }
        System.out.println("Прощайте был рад помоч");
    }
}
