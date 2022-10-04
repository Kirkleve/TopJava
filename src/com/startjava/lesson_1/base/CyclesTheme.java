package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("№1 Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumOdd = 0;
        int sumEven = 0;
        System.out.print("В промежутке [" + startRange + ", " + endRange + "],");
        do {
            if (startRange % 2 == 0) {
                sumOdd += startRange;
            } else {
                sumEven += startRange;
            }
            startRange++;
        } while (startRange <= endRange);
        System.out.print(" сумма чётных чисел = " + sumOdd +
                ", сумма нечётных чисел равна = " + sumEven + "\n\n");

        System.out.println("№2 Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        if (num1 < min) min = num1;
        if (num3 < min) min = num3;
        for (int i = max - 1; i > min; i--) {
            System.out.printf(i + " ");
        }

        System.out.println("\n\n№3 Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке ");
        while (num != 0) {
            int digit = 0;
            digit = num % 10;
            sumDigits += digit;
            num /= 10;
            System.out.print(digit);
        }
        System.out.println("\nСумма цифр числа " + sumDigits + "\n");

        System.out.println("№4 Вывод чисел на консоль в несколько строк");
        endRange = 24;
        int count = 0;
        for (int i = 1; i < endRange; i += 2) {
            count++;
            System.out.printf("%3d", i);
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        while (count % 5 != 0) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n\n№5 Проверка количества единиц на четность");
        num = 3141591;
        int copyNumber = num;
        int countOnes = 0;
        while (copyNumber != 0) {
            if (copyNumber % 10 == 1) countOnes++;
            copyNumber /= 10;
        }
        String parityCheck = "";
        if (countOnes % 2 == 0) {
            parityCheck = "чётное";
        } else {
            parityCheck = "нечётное";
        }
        System.out.println("число " + num + " содержит " + countOnes + " (" +
                parityCheck + ") " + "количество единиц" + "\n");

        System.out.println("№6 Отображение фигур в консоли");

        int countSimbolStar = 50;
        int countSymbolGrid = 15;
        int countSymbolDolar = 9;
        for (int i = 1; i < countSimbolStar; i++) {
            if (i % 10 != 0) System.out.print("*");
            else System.out.print("\n");
        }
        System.out.println("\n");

        int valueSymbolGrid = 5;
        int index = 1;
        while (countSymbolGrid != 0) {
            if (index > valueSymbolGrid ) {
                System.out.print("\n");
                index = 0;
                valueSymbolGrid--;
            } else {
                System.out.print("#");
                countSymbolGrid--;
            }
            index++;
        }
        System.out.println("\n");

        int valueSymbolDolar = 2;
        do {
            System.out.print("$");
            if (index == valueSymbolDolar) {
                if (valueSymbolDolar / 4 == 0) {
                    valueSymbolDolar++;
                } else {
                    valueSymbolDolar--;
                }
                System.out.print("\n");
                index = 1;
            }
            index++;
            countSymbolDolar--;
        } while (countSymbolDolar != 0);
        System.out.println("\n");

        System.out.println("№7 Отображение ASCII-символов");
        System.out.println(" Dec  Char");
        for (int i = 0; i <= 47; i++) {
            if (i % 2 != 0) System.out.printf("%4d%5c%n", i, (char) i);
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) System.out.printf("%4d%5c%n", i, (char) i);
        }

        System.out.println("\n№8 Проверка, является ли число палиндромом");
        int srcNum = 1234321;
        int reverseNum = 0;
        int copySrcNum = srcNum;
        while (srcNum != 0) {
            int digit = srcNum % 10;
            reverseNum = reverseNum * 10 + digit;
            srcNum /= 10;
        }
        if (copySrcNum == reverseNum) System.out.println("Это число палиндром\n");
        else System.out.println("Это число не палиндром\n");

        System.out.println("№9 Определение, является ли число счастливым");
        int luckyNum = 678777;
        int copyLuckyNum = luckyNum;
        int sumSecondNums = 0;
        int sumFirstNums = 0;
        count = 1;
        while (luckyNum != 0) {
            luckyNum /= 100;
            count *= 10;
        }
        luckyNum = copyLuckyNum;
        while (luckyNum != 0) {
            if (luckyNum / count != 0) {
                sumSecondNums += luckyNum % 10;
            } else {
                sumFirstNums += luckyNum % 10;
            }
            luckyNum /= 10;
        }
        System.out.println("Сумма цифр " + (copyLuckyNum / count) + " = " + sumFirstNums + "\n" +
                "Сумма цифр " + (copyLuckyNum % count) + " = " + sumSecondNums);
        System.out.println(sumFirstNums == sumSecondNums ? "Число счастливое" : "Число не счастливое");

        System.out.println("\n№10 Вывод таблицы умножения Пифагора");
        int tablePifagora = 0;
        System.out.println("         Таблица Пифагора");
        System.out.printf(" |%4d%4d%4d%4d%4d%4d%4d%4d", 2, 3, 4 , 5, 6, 7, 8, 9);
        System.out.println("\n----------------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.print(i+"|");
            for (int j = 2; j < 10; j++) {
                tablePifagora = j * j;
                System.out.printf("%4d",tablePifagora);
            }
            System.out.println();
        }
    }
}
