package lesson_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Калькулятор:");
        int number1 = 7;
        int number2 = 4;
        int result = 0;
        char simbol = '^';
        switch (simbol) {
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
        }
        System.out.println(number1 + " " + simbol + " " + number2 + " = " + result);
    }
}
