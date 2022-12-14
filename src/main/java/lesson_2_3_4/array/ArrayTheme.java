package lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("№1 Реверс значений массива");
        int[] intArray = {2, 4, 5, 6, 1, 3, 7};
        System.out.println(Arrays.toString(intArray).replace(",", ""));
        int length = intArray.length;
        for (int i = 0; i <= length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[--length];
            intArray[length] = temp;
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
            System.out.print(i + (i != length - 2 ? " * " : (" = " + mult)));
        }
        System.out.println("\n0[" + intArray[0] + "]; " + "9[" + intArray[length - 1] + "]");

        System.out.println("\n№3 Удаление элементов массива");
        Random random = new Random();
        double[] doubleArray = new double[15];
        length = doubleArray.length;
        for (int i = 0; i < length; i++) {
            doubleArray[i] = random.nextDouble();
        }
        System.out.println("Исходный массив:");
        printArray(doubleArray);
        double middleNum = doubleArray[length / 2];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (middleNum < doubleArray[i]) {
                doubleArray[i] = 0;
                count++;
            }
        }
        System.out.println("\nИзменённый массив:");
        printArray(doubleArray);
        System.out.println("\nКоличество изменённых ячеек = " + count);

        System.out.println("\n№4 Вывод элементов массива лесенкой в обратном порядке");
        char[] charArray = new char[('Z' - 'A') + 1];
        length = charArray.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            charArray[i] = (char) ('A' + i);
        }
        for (int i = length - 1; i >= 0 ; i--) {
            System.out.println(sb.append(charArray[i]));
        }

        System.out.println("\n№5 Генерация уникальных чисел");
        intArray = new int[30];
        length = intArray.length;
        for (int i = 0; i < length; i++) {
            while (true) {
                boolean unique = false;
                intArray[i] = (int) (60 + (Math.random() * 40));
                for (int j = 0; j < i; j++) {
                    if (intArray[i] == intArray[j]) {
                        unique = true;
                        break;
                    }
                }
                if (!unique) break;
            }
        }
        for (int i = intArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
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
        String[] srcStrArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.println("Начальный массив:\n" + Arrays.toString(srcStrArray));
        length = 0;
        for (String str : srcStrArray) {
            if (!str.isBlank()) length++;
        }
        String[] destStrArray = new String[length];
        int destPos = 0;
        count = 0;
        for (int i = 0; i < srcStrArray.length; i++) {
            if (!srcStrArray[i].isBlank()) count++;
            else if (count > 0) {
                System.arraycopy(srcStrArray, i - count, destStrArray, destPos, count);
                destPos += count;
                count = 0;
            }
        }
        System.out.println("Длинна массива без пустых строк:\n" + length);
        System.out.println("Новый копированный массив:\n" + Arrays.toString(destStrArray));
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%6.3f ", array[i]);
            if (i == 7)
                System.out.println();
        }
    }
}
