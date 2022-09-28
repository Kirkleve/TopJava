package lesson_2;

import java.util.Scanner;

public class Calculator {
    private int number1;
    private int number2;
    private char mathSign;

    public void setNumber1(int number) {
        number1 = number;
    }

    public void setNumber2(int number) {
        number2 = number;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public int calculate() {
        switch (mathSign) {
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
