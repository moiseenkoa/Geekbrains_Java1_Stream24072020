package ru.geekbrains.java1.lesson1;

public class Main {

    public static void main(String[] args) {
        System.out.println(calc(1, 2, 3, 4));
        System.out.println(task10and20(5, 6));
        isPositiveOrNegative(7);
        sayHello("Вася");
        checkIsYearLeapOrNot(2020);
    }

    /*
     * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
     * a, b, c, d – целочисленные входные параметры этого метода;
     */

    public static float calc(int a, int b, int c, int d){
        float res = a * (b + ((float) c / d));
        return res;
    }

    /*
     * Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
     * если да – вернуть true, в противном случае – false;
     */

    public static boolean task10and20(int a, int b){
        if (a + b >= 10 && a + b <= 20 )
            return true;
        else
            return false;
    }

    /*
     * Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали,
     * или отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
     */

    public static void isPositiveOrNegative(int x){
        if(x >= 0)
            System.out.println("Число положительное.");
        else
            System.out.println("Число отрицательное.");
    }

    /*
     * Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»;
     * Вывести приветствие в консоль.
     */

    public static void sayHello(String name){
        System.out.println("Привет, " + name + "!");
    }

    /*
     * Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     * Для проверки работы вывести результаты работы метода в консоль.
     */

    public static void checkIsYearLeapOrNot(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println(year + " год - високосный.");
        }
        else
        {
            System.out.println(year + " год - невисокосный.");
        }
    }

}
