package lesson_2;

import java.util.Scanner;

public class Calculator {
    private int number1;
    private int number2;
    private char mathOperation;

    public void setNumber1(int number) {
        number1 = number;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber2(int number) {
        number2 = number;
    }

    public int getNumber2() {
        return number2;
    }

    public char setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
        while (this.mathOperation != '+' && this.mathOperation != '-' && this.mathOperation != '*' && this.mathOperation != '/'
                && mathOperation != '^' && mathOperation != '%') {
            System.out.println("Неверный математический символ, введите один из символов + - * / ^ %");
            this.mathOperation = new Scanner(System.in).nextLine().charAt(0);
        }
        return this.mathOperation;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public int calculate() {
        switch (mathOperation) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return number1 / number2;
            case '^':
                int result = number1;
                for (int i = 1; i < number2; i++)
                    result *= number1;
                return result;
            case '%':
                return number1 % number2;
            default:
                throw new IllegalArgumentException("Извините такого символа нет!");
        }
    }
}
