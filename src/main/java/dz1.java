/*
 *	Журавлев Дмитрий
 *	Д/З № 1
 */

public class dz1 {

    public static void main(String[] args) {
        task1();
        System.out.println("a * (b + (c / d)) = " + task2(3.4f,2.2f,3.1f,6.3f));
        System.out.println(task3(7, 18));
        task4(0);
        System.out.println("Значение: a - " + task5(-11));
        task6("Друг");
        task7(1764);
    }

    // Создать переменные всех пройденных типов данных, и инициализировать их значения

    static void task1() {
        System.out.println("\nЗадание 2.");
        // числа (целые и дробные), символы, строки
        byte byteValue = 15; // 1b 256 -> [-128; 127]
        System.out.println("byte = " + byteValue);
        short shortValue = 10000; // 2b 2 ^ 16 [-2^15; 2^15 - 1]
        System.out.println("short = " + shortValue);
        int intValue = 2_000_000_000; // 4b 2 ^ 32
        System.out.println("int = " + intValue);
        long longValue = 1_000_000_000_000L; // 8b 2 ^ 64 -> 10 ^ 19
        System.out.println("long = " + longValue);

        // 1124251 * 10 ^ 5 5 25
        float floatValue = 0.5f; // 4b 2 ^ 25 * 10 ^ (2 ^ 5) 8 digits
        System.out.println("float = " + floatValue);
        double doubleValue = 0.5; // 8b 16 digits
        System.out.println("double = " + doubleValue);
        boolean booleanValue = true; // false
        System.out.println("boolean = " + booleanValue);
        char charValue = '\'';
        System.out.println("char = " + charValue);
        String hello = "Hello ";
        String world = "world!";
        System.out.println(hello + world);

    }
    // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – аргументы этого метода, имеющие тип float
    static float task2(float a, float b, float c, float d) {
        System.out.println("\nЗадание 3.");
        return a * (b + (c / d));
    }
    // Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    static boolean task3(int a, int b) {
        System.out.println("\nЗадание 4.");
        int sum = a + b;
        return sum > 10 && sum < 20;
    }
    // Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    static void task4(int a) {
        System.out.println("\nЗадание 5.");
        if (a >= 0) System.out.println("Число:" + a + " - Положительное");
        else System.out.println("Число " + a + " - Отрицательное");
    }
    // Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.
    static boolean task5(int a) {
        System.out.println("\nЗадание 6.");
        return a < 0;
    }
    // Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    static void task6(String name) {
        System.out.println("\nЗадание 7.");
        System.out.println("\nПривет, "+ name + "!");
    }
    //  * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    //  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    static void task7(int a) {
        System.out.println("\nЗадание 8.");
        if ((a % 4 == 0) || (a % 100 == 0) && (a % 400 == 0)) System.out.println(a + " - год является високосным");
        else System.out.println(a + " - год невисокосный");

    }
}
