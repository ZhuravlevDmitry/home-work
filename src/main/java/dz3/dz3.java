/*
 * Журавлев Дмитрий
 * Д/З № 3
 */
package dz3;


import java.util.Scanner;

public class dz3 {
        //Объявляем методы
        private static final Scanner scanner;
    static {
        scanner = new Scanner(System.in);
    }
    private static void game(int range) {

        int move = 3;
        int number = (int) (Math.random() * range);
        for (int i = 1; i <= move; i++) {
            System.out.println("Попытка: " + i);
            System.out.println("Угадайте число от 0 до " + range);
            System.out.println("Введите число -  ");
            int input_number = scanner.nextInt();
            while (true) {
                if (input_number > range){
                    System.out.println("Попытка: " + i + "." + "\nВведите корректное значение");
                    input_number = scanner.nextInt();

                }  else break;
            }
            if (number == input_number) {
                System.out.println("Вы Угадали!!!");
                break;
            }
            if (number < input_number) System.out.println("Загаданное число меньше");
            else System.out.println("Загаданное число больше");
        }
        System.out.println("Правильный ответ " + number +"." + " Попробуйте снова.");
    }
    //Объявляем класс
    public static void main(String[] args) {
        task1();

    }
    //Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается
    // 3 попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное
    // пользователем число, чем загаданное, или меньше. После победы или проигрыша выводится запрос –
    // «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

            static void task1() {

                System.out.println("Задание 1.");
                System.out.println("Ваша задача угадать число с трёх попыток");
                int range = 9;
                //Вызываем метод game
                game(range);
                while (true) {
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                    System.out.println("Введите команду:");
                    Scanner in = new Scanner(System.in);
                    String command = in.next();
                    switch (command) {
                        case "1":
                            game(range);
                            break;
                        case "0":
                            System.out.println("Программа завершена");
                            return;
                    }
                }
            }
            }




