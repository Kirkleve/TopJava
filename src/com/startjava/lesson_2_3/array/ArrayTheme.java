package com.startjava.lesson_2_3.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("№1 Реверс значений массива");
        int[] intArray = new int[]{2, 4, 5, 6, 1, 3, 7};
        System.out.println(Arrays.toString(intArray).replace(",", ""));
        int temp;
        int length = intArray.length;
        for (int i = 0; i < length / 2; i++) {
            temp = intArray[length - i - 1];
            intArray[length - i - 1] = intArray[i];
            intArray[i] = temp;
        }
        System.out.println(Arrays.toString(intArray).replace(",", "") + "\n");

        System.out.println("№2 Вывод произведения элементов массива");
        intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        length = intArray.length;
        int multiplication = 1;
        for (int i = 1; i < length - 1; i++) {
            multiplication *= intArray[i];
            System.out.print(i + " = " + multiplication + "; ");
        }
        System.out.println();
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
            if (i != 7) {
                System.out.printf("%6.3f ", doubleArray[i]);
            } else System.out.println();
        }
        double averageIndex = doubleArray[length / 2];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (averageIndex < doubleArray[i]) {
                doubleArray[i] = 0;
                count++;
            }
        }
        System.out.println("\nИзменённый массив: ");
        for (int i = 0; i < length; i++) {
            if (i != 7) {
                System.out.printf("%6.3f ", doubleArray[i]);
            } else System.out.println();
        }
        System.out.println("\nКоличество изменённых ячеек = " + count + "\n");

        System.out.println("№4 Вывод элементов массива лесенкой в обратном порядке");
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
        String[] strArray = new String[]{"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        length = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (!strArray[i].equals("") && !strArray[i].isBlank()) {
                length++;
            }
        }
        System.out.println(length);
        String[] copyStrArray = new String[length];
        System.arraycopy(strArray, 0, copyStrArray,0, length);
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(copyStrArray));
    }
}
