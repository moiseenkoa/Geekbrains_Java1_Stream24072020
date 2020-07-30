package ru.geekbrains.java1.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
         */

        System.out.println("Задание 1:");
        int[] arr1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(arr1));
        invertArray(arr1);
        System.out.println(Arrays.toString(arr1));

        /*
         * 2. Задать пустой целочисленный массив размером 8.
         * Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
         */

        System.out.println("Задание 2:");
        int[] arr2 = new int[8];
        System.out.println(Arrays.toString(arr2));
        fillArray(arr2);
        System.out.println(Arrays.toString(arr2));

        /*
         * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
         * принимающий на вход массив и умножающий числа меньше 6 на 2;
         */

        System.out.println("Задание 3:");
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr3));
        multiplyByTwo(arr3);
        System.out.println(Arrays.toString(arr3));

        /*
         * 4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
         */

        System.out.println("Задание 4:");
        int[] arr4 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr4));
        System.out.println("Минимальный элемент: " + minArrayElement(arr4));
        System.out.println("Максимальный элемент: " + maxArrayElement(arr4));

        /*
         * 5*. Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
         * заполнить его диагональные элементы единицами, используя цикл(ы);
         */

        System.out.println("Задание 5:");
        int[][] arr5 = new int[5][5];
        printArray(fillDiagonals(arr5));

        /*
         * 6**. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место,
         * в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
         * checkBalance ([10, 1, 2, 3, 4]) → true.
         */
        System.out.println("Задание 6:");
        int[] arr6 = {1, 1, 1, 2, 1};
        System.out.println("Суммы равны? " + checkBalance(arr6));
    }

    private static int[] invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    private static int[] fillArray(int[] array) {
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 3;
        }
        return array;
    }

    private static int[] multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i]*= 2;
        }
        return array;
    }

    private static int minArrayElement(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i]< min)
                min = array[i];
        }
        return min;
    }

    private static int maxArrayElement(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    private static void printArray(int[][] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillDiagonals(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
        return array;
    }

    private static boolean checkBalance (int[] array) {
        int leftSum;
        int rightSum;
        for (int i = 1; i < array.length - 1; i++) {
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            rightSum = 0;
            for (int j = i; j < array.length; j++ ){
                rightSum += array[j];
            }
            if (leftSum == rightSum)
                return true;
        }
        return false;
    }
}
