package lesson1;

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


    }
}
