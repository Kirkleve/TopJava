package lesson_1;

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
        } while (startRange != endRange);
        System.out.print(" сумма чётных чисел = " + sumOdd +
                ", сумма нечётных чисел равна = " + sumEven + "\n\n");

        System.out.println("№2 Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = -1;
        int num2 = 5;
        int num3 = 10;
        int maximumNmber = 0;
        int minimumNumber = 0;
        if (num1 > num2 && num1 > num3) {
            maximumNmber = num1;
            if (num2 > num3) minimumNumber = num3;
            else minimumNumber = num2;
        } else if (num1 < num2 && num2 > num3) {
            maximumNmber = num2;
            if (num1 > num3) minimumNumber = num3;
            else minimumNumber = num1;
        } else if (num1 < num3 && num2 < num3) {
            maximumNmber = num3;
            if (num1 > num2) minimumNumber = num2;
            else minimumNumber = num1;
        }
        for (int i = maximumNmber - 1; i > minimumNumber; i--) {
            System.out.printf(i + " ");
        }

        System.out.println("\n\n№3 Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке ");
        while (number != 0) {
            int digit = 0;
            digit = number % 10;
            sumDigits += digit;
            number /= 10;
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
        number = 3141591;
        int copyNumber = number;
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
        System.out.println("число " + number + " содержит " + countOnes + " (" +
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
