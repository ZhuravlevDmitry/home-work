/*
 *	Журавлев Дмитрий
 *	Д/З № 2
 */

import java.util.Arrays;

public class hw2 {

    //Функция, генерирует случайное число из интервала from-to
    static int getRandom(int from, int to) {
        return (int) (from + Math.random() * (to - from));
    }

    static int getRandom(int limit) {
        return (int) (Math.random() * limit);
    }

    static boolean nnn(int[] args){
        boolean result=false;
        // сразу находим сумму всех элементов в массиве
        int summ = 0;
        for (int i = 0; i <args.length; i++)
        {
            summ += args[i];
        }
        int left = 0;
        for (int i = 0; i <args.length-1; i++) {
            left += args[i];
            if (left==summ-left){
                result=true;
            }
        }
        return result;}



    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0

    static void task1() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("\nЗадание 1.\n");
        System.out.print("Заданн массив\n");
        System.out.println(Arrays.toString(a));
        System.out.print("Получен массив\n");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else
                a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }

    //Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    static void task2() {
        int[] a = new int[8];
        System.out.print("\nЗадание 2.\n");
        System.out.print("Получен массив\n");
        for (int i = 1; i < a.length; i++) {
            a[i] = i * 3;

        }
        System.out.println(Arrays.toString(a));
    }


    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;

    static void task3() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("\nЗадание 3.\n");
        System.out.print("Задан массив\n");
        System.out.println(Arrays.toString(a));
        System.out.print("Получен массив\n");
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }

        }
        System.out.println(Arrays.toString(a));
    }
    //Создать квадратный двумерный целочисленный массив
    // (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    // заполнить его диагональные элементы единицами (можно только одну
    // из диагоналей, если обе сложно). Определить элементы одной из
    // диагоналей можно по следующему принципу: индексы таких элементов
    // равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    static void task4() {
        int[][] a = new int[8][8];
        System.out.print("\nЗадание 4.\n");
        System.out.print("Получен массив\n");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = getRandom(10, 100);
                if (i==j) {
                    a[i][j] = 1;}
                if (i + j ==7) {
                    a[i][j] = 1;
                }
                    System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }

            }
    // Задать одномерный массив и найти в нем минимальный и максимальный элементы
    // (без помощи интернета);

    static void task5() {
        int[] a = new int[8];
        int amin;
        int amax;
        System.out.print("\nЗадание 5.\n");
        System.out.print("Получен массив\n");
        for (int i = 0; i < a.length; i++) {
            a[i] = getRandom(10, 100);
        }
        System.out.println(Arrays.toString(a));
        amax = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > amax){
                amax = a[i];
            }
        }
        System.out.print("Макс = " + amax);

        amin = a[0];
        for (int i = 0; i < a.length; i++) {
            if (amin > a[i]){
                amin = a[i];
            }
        }
        System.out.print("\nМин = " + amin);
        }
    /* Написать метод, в который передается ,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и
    правой части массива равны. Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true,
    т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1*/

    static void task6() {
        int[] a = new int[5];

        System.out.print("\nЗадание 6.\n");
        System.out.print("Получен массив\n");
        for (int i = 0; i < a.length; i++) {
            a[i] = getRandom(1, 5);
        }
        System.out.println(Arrays.toString(a));


        System.out.print("Получено\n" + nnn(a));
    }

}











