/*
 *	Журавлев Дмитрий
 *	Д/З № 5
 */
package Dz5;

public class Users {
    //    Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//    Конструктор класса должен заполнять эти поля при создании объекта.
//    Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//    Создать массив из 5 сотрудников.

    //Филды
    private String name;
    private String surname;
    private String middlename;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    //Генерируем конструктор для создания анкеты сотрудника

    public Users(String name, String surname, String middlename, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Users(String vyacheslav, String sidorov, String engineer, String position, int i, int phone, int salary) {
    }

    //Метод-функция класса для вывода данных анкет сотрудников старше 40 лет
    private static void print(Users[] pers) {
        for (int i = 0; i < 5; i++) {
            if (pers[i].age >= 40) {
                System.out.printf((i+1) +". " + "(%s, %s, %s, %s, %s, %s, %s, %s)\n",
                        pers[i].name, pers[i].surname, pers[i].middlename, pers[i].email,
                        pers[i].position, pers[i].phone, pers[i].salary, pers[i].age);
            }
        }
    }
    public static void main(String[] args) {
        //Объявляем массив объектов
        Users[] persArray = new Users[5];

        //Для каждой ячейки массива задаем объект
        persArray[0] = new Users("Ivan",
                "Ivanovich",
                "Ivanov",
                "Engineer",
                "ivanov@mailbox.com",
                892312313,
                44000,
                47);

        persArray[1] = new Users("Vyacheslav",
                "Andreevich",
                "Sidorov",
                "Engineer",
                "sidor@mailbox.com",
                892_312_313,
                44_000,
                47);

        persArray[2] = new Users("Darya",
                "Aleksandrovna",
                "Dmetrieva",
                "Secretary",
                "darya@mailbox.com",
                892312314,
                29000,
                29);

        persArray[3] = new Users("Ilda",
                "Nikolaevna",
                "Ivanova",
                "Senior engineer",
                "ivivana@mailbox.com",
                892312317,
                60000,
                42);

        persArray[4] = new Users("Juliya",
                "Sergeevna",
                "Goncharova",
                "Quality Assurance engineer",
                "goncharova@mailbox.com",
                92312412,
                130000,
                46);
        System.out.println("\nЗадание к уроку № 5.\nВыводим из массива (структурное подразделение организации)" +
                " анкетные данные сотрудников, старше 40 лет:\n");
        //Вызываем метод для вывода данных анкет сотрудников старше 40 лет
        print(persArray);
    }

}


