package lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setNumber1();
        calculator.setSymbol();
        calculator.setNumber2();
        calculator.setResult(calculator.getNumber1(),
                calculator.getSymbol(), calculator.getNumber2());
        calculator.getResult();
        calculator.returnCalculation();
    }
}
