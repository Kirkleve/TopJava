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

    public int gettingResult(int number1, int symbol, int number2) {
        int result;
        switch (symbol) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '^':
                int num = number1;
                for (int i = 1; i < number2; i++)
                    num *= number1;
                result = num;
                break;
            case '%':
                result = number1 % number2;
                break;
            default:
                throw new IllegalArgumentException("Извените такого символа нет!");
        }
        return result;
    }

    public void printResult(int result) {
        System.out.printf("%d %c %d = %d%n", number1, mathOperation, number2, result);
    }
}
