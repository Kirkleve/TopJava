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

        System.out.println("№3 Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        int count = 0;
        while (number != 0){
            number /= 10;
            System.out.println(number);
        }
    }
}
