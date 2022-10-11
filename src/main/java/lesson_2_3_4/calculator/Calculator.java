package lesson_2_3_4.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private String mathSign;

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getMathSign() {
        return mathSign;
    }

    public void setMathSign(String mathSign) {
        this.mathSign = mathSign;
    }

    public void splitString(String mathOperation) {
        String[] splitMathOperation = mathOperation.split(" ");
        number1 = Integer.parseInt(splitMathOperation[0]);
        mathSign = splitMathOperation[1];
        number2 = Integer.parseInt(splitMathOperation[2]);
    }

    public int calculate() {
        switch (mathSign) {
            case "+":
                return Math.addExact(number1, number2);
            case "-":
                return Math.subtractExact(number1, number2);
            case "*":
                return Math.multiplyExact(number1, number2);
            case "/":
                return number1 / number2;
            case "^":
                return (int) Math.pow(number1, number2);
            case "%":
                return number1 % number2;
        }
        return 0;
    }
}
