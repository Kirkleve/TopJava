package lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("№1 Реверс значений массива");
        int[] intArray = {2, 4, 5, 6, 1, 3, 7};
        System.out.println(Arrays.toString(intArray).replace(",", ""));
        int temp;
        int length = intArray.length;
        for (int i = 0; i < length / 2; i++) {
            temp = intArray[length - i - 1];
            intArray[length - i - 1] = intArray[i];
            intArray[i] = temp;
        }
        System.out.println(Arrays.toString(intArray).replace(",", ""));

        System.out.println("\n№2 Вывод произведения элементов массива");
        intArray = new int[10];
        length = intArray.length;
        for (int i = 0; i < length; i++) {
            intArray[i] = i;
        }
        int mult = 1;
        for (int i = 1; i < length - 1; i++) {
            mult *= intArray[i];
            System.out.print(i);
            if (i != length -2)
                System.out.print(" * ");
        }
        System.out.print(" = " + mult + "\n");
        for (int i = 0; i < length; i++) {
            System.out.print(intArray[i] + "[" + i + "]; ");
            i += length - 1;
            System.out.print(intArray[i] + "[" + i + "]; ");
        }

        System.out.println("\n\n№3 Удаление элементов массива");
        Random random = new Random();
        double[] doubleArray = new double[15];
        length = doubleArray.length;
        System.out.println("Исходный массив: ");
        for (int i = 0; i < length; i++) {
            doubleArray[i] = random.nextDouble();
            System.out.printf("%6.3f ", doubleArray[i]);
            if (i == 7)
                System.out.println();
        }
        double middleNum = doubleArray[length / 2];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (middleNum < doubleArray[i]) {
                doubleArray[i] = 0;
                count++;
            }
        }
        System.out.println("\nИзменённый массив: ");
        for (int i = 0; i < length; i++) {
            System.out.printf("%6.3f ", doubleArray[i]);
            if (i == 7)
                System.out.println();
        }
        System.out.println("\nКоличество изменённых ячеек = " + count);

        System.out.println("\n№4 Вывод элементов массива лесенкой в обратном порядке");
        char startAlf = 64;
        char endAlf = 90;
        char[] charArray = new char[endAlf - startAlf];
        StringBuilder printCharArray = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = endAlf;
            endAlf--;
        }
        for (char arr : charArray) {
            printCharArray.append(arr);
            System.out.println(printCharArray);
        }

        System.out.println("\n№5 Генерация уникальных чисел");
        intArray = new int[30];
        length = intArray.length;
        for (int i = 0; i < length; i++) {
            while (true) {
                boolean check = false;
                intArray[i] = (int) (60 + (Math.random() * 40));
                for (int j = 0; j < i; j++) {
                    if (intArray[i] == intArray[j]) {
                        check = true;
                        break;
                    }
                }
                if (!check) break;
            }
        }
        for (int i = intArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(intArray[i] + " ");
            if ((i + 1) % 10 == 0) System.out.println();
        }

        System.out.println("\n№6 Сдвиг элементов массива");
        String[] strArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.println("Начальный массив:\n" + Arrays.toString(strArray));
        length = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].isBlank()) {
                length++;
                for (int j = i + 1; j < strArray.length; j++) {
                    strArray[j - 1] = strArray[j];
                }
            }
        }
        String[] copyStrArray = new String[length];
        System.out.println("Длинна массива без пустых строк:\n" + length);
        System.arraycopy(strArray, 0, copyStrArray, 0, length);
        System.out.println("Новый копированный массив:\n" + Arrays.toString(copyStrArray));
    }
}
