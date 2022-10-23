package lesson_2_3_4.calculator;

import com.sun.jdi.NativeMethodException;

public class Calculator {
    private static int number1;
    private static int number2;
    private static char mathSign;

    public static int calculate(String mathExpression) {
        parseExpression(mathExpression);
        return switch (mathSign) {
            case '+' -> Math.addExact(number1, number2);
            case '-' -> Math.subtractExact(number1, number2);
            case '*' -> Math.multiplyExact(number1, number2);
            case '/' -> number1 / number2;
            case '^' -> (int) Math.pow(number1, number2);
            case '%' -> number1 % number2;
            default -> 0;
        };
    }

    private static void parseExpression(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        number1 = checkNumber(Integer.parseInt(partsExpression[0]));
        mathSign = checkMathSing(partsExpression[1]);
        number2 = checkNumber(Integer.parseInt(partsExpression[2]));
    }

    private static int checkNumber(int number) {
        if (number < 0) {
            throw new NativeMethodException("Отрицательное число использовать нельзя!");
        }
        return number;
    }

    private static char checkMathSing(String str) {
        char mathSign = str.charAt(0);
        if (mathSign != '+' && mathSign != '-' && mathSign != '*' && mathSign != '/'
                && mathSign != '^' && mathSign != '%') {
            throw new ArithmeticException("Неверный математический символ, введите только символ + - * / ^ %");
        }
        return mathSign;
    }
}
