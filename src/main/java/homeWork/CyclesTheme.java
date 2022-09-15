package homeWork;

import java.lang.reflect.Array;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("№1 Подсчет суммы четных и нечетных чисел");
        int negativeNumber = -10;
        int positiveNumber = 21;
        int sumPositive = 0;
        int sumNegative = 0;
        System.out.print("В промежутке [" + negativeNumber + ", " + positiveNumber + "],");
        do {
            sumNegative += negativeNumber;
            negativeNumber++;
        } while (negativeNumber != 0);
        do {
            sumPositive += positiveNumber;
            positiveNumber--;
        } while (positiveNumber != 0);
        System.out.print(" сумма чётных чисел = " + sumPositive +
                ", сумма отрицательных чисел равна = " + sumNegative + "\n\n");

        System.out.println("№2 Вывод чисел в интервале (min и max) в порядке убывания");
        int[] array = new int[]{-1, 5, 10};
        int max = array[0];
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        array[0] = min;
        array[array.length - 1] = max;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        System.out.println("\n№3 Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sumDigit = 0;
        int digit = 0;
        StringBuilder inverseNumber = new StringBuilder();
        while (number != 0) {
            digit = number % 10;
            inverseNumber.append(digit);
            sumDigit += digit;
            number /= 10;
        }
        System.out.println("Исходное число в обратном порядке " + inverseNumber + "\n" +
                "Сумма цифр числа " + sumDigit + "\n");

        System.out.println("№4 Вывод чисел на консоль в несколько строк");
        int finalNumber = 24;
        int count = 0;
        for (int i = 1; i < finalNumber; i += 2) {
            count++;
            System.out.printf("%3d", i);
            if (count % 5 == 0) {
                System.out.println("");
            }
        }
        while (count % 5 != 0) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n\n№5 Проверка количества единиц на четность");
        int num = 3141591;
        int newNum = num;
        int countNum = 0;
        String parityCheck = "";
        while (newNum != 0) {
            newNum /= 10;
            countNum++;
        }
        if (countNum % 2 == 0) {
            parityCheck = "чётное";
        } else {
            parityCheck = "нечётное";
        }
        System.out.println("число " + num + " содержит " + countNum + " (" +
                parityCheck + ") " + "количество единиц" + "\n");

        System.out.println("№6 Отображение фигур в консоли");
        StringBuilder symbolStar = new StringBuilder();
        StringBuilder symbolGrid = new StringBuilder();
        StringBuilder symbolDolar = new StringBuilder();
        int countSimbolStar = 50;
        int countSymbolGrid = 15;
        int countSymbolDolar = 9;
        int valueSymbolGrid = 5;
        int valueSymbolDolar = 2;
        int index = 1;
        for (int i = 0; i < countSimbolStar; i++) {
            if (i % 10 == 0) {
                symbolStar.append('\n');
            }
            symbolStar.append('*');
        }
        while (countSymbolGrid != 0) {
            if (index > valueSymbolGrid ) {
                symbolGrid.append('\n');
                index = 0;
                valueSymbolGrid--;
            } else {
                symbolGrid.append('#');
                countSymbolGrid--;
            }
            index++;
        }
        do {
            symbolDolar.append('$');
            if (index == valueSymbolDolar) {
                if (valueSymbolDolar / 4 == 0) {
                    valueSymbolDolar++;
                } else {
                    valueSymbolDolar--;
                }
                symbolDolar.append('\n');
                index = 1;
            }
            index++;
            countSymbolDolar--;
        } while (countSymbolDolar != 0);
        System.out.println("" + symbolStar + "\n\n" + symbolGrid + "\n\n" +
                symbolDolar + "\n");

        System.out.println("№7 Отображение ASCII-символов");
        System.out.println(" Dec  Char");
        for (int i = 0; i <= 47; i++) {
            if (i % 2 != 0) System.out.printf("%4d%5c%n", i, (char)i);
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) System.out.printf("%4d%5c%n", i, (char)i);
        }

        System.out.println("\n№8 Проверка, является ли число палиндромом");
        int setNumbers = 1234321;
        int revers = 0;
        int i = 0;
        int originalNum = setNumbers;
        while (setNumbers != 0) {
            revers = setNumbers % 10;
            i = i * 10 + revers;
            setNumbers /= 10;
        }
        if (originalNum == i) System.out.println("Это число палиндром\n");
        else System.out.println("Это число не палиндром\n");

        System.out.println("№9 Определение, является ли число счастливым");
        int luckyNumber = 678777;
        int originalLuckyNumber = luckyNumber;
        int sumReversNumber = 0;
        int sumFirstNumbers = 0;
        String result = "";
        while (luckyNumber != 0) {
            if (luckyNumber / 1000 != 0) {
                sumReversNumber += luckyNumber % 10;
            } else {
                sumFirstNumbers += luckyNumber % 10;
            }
            luckyNumber /= 10;
        }
        System.out.println("Сумма цифр " + (originalLuckyNumber / 1000) + " = " + sumFirstNumbers + "\n" +
                "Сумма цифр " + (originalLuckyNumber % 1000) + " = " + sumReversNumber);
        System.out.println(sumFirstNumbers == sumReversNumber ? "Число счастливое" : "Число не счастливое");

        System.out.println("\n№10 Вывод таблицы умножения Пифагора");
        int tablePifagora = 0;
        System.out.println("         Таблица Пифагора");
        System.out.printf(" |%4d%4d%4d%4d%4d%4d%4d%4d", 2, 3, 4 , 5, 6, 7, 8, 9);
        System.out.println("\n----------------------------------");
        for (int j = 2; j < 10; j++) {
            System.out.print(j+"|");
            for (int k = 2; k < 10; k++) {
                tablePifagora = j * k;
                System.out.printf("%4d",tablePifagora);
            }
            System.out.println();
        }
    }
}
