package lesson_2_3_4.calculator;

public class Calculator {
    private static int number1;
    private static int number2;
    private static char mathSign;
    private static String mathOperation;

    private static void parseExpression() {
        try {
            String[] partsExpression = mathOperation.split(" ");
            checkNumber(Integer.parseInt(partsExpression[0]),Integer.parseInt(partsExpression[2]));
            mathSign = checkMathSing(partsExpression[1]);
        } catch (NumberFormatException e) {
            System.out.println("Только целое не отрицательное число!");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Не забываем про пробелы и всего 3 значения(число знак число)!");
        }
    }

    private static void checkNumber(int num1, int num2) {
        if (num1 < 0 || num2 < 0)
            System.out.println("Только целое не отрицательное число!");
        else {
            number1 = num1;
            number2 = num2;
        }
    }

    private static char checkMathSing(String str) {
        char mathSign = str.charAt(0);
        if (mathSign != '+' && mathSign != '-' && mathSign != '*' && mathSign != '/'
                && mathSign != '^' && mathSign != '%') {
            System.out.println("Неверный математический символ, введите только символ + - * / ^ %");
            return 0;
        } else return mathSign;
    }

    public static int calculate(String strMathOperation) {
        mathOperation = strMathOperation;
        parseExpression();
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
}
