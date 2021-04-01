package lesson6;

public class AnimalTest {

    static int cntAnimal = 0;
    static int cntdog = 0;
    static int cntcat = 0;

    public static void newCat(String name, int running){
        boolean checkrunning = false;
        Cat cat = new Cat(name, running);
        cntAnimal++;
        cntcat++;
        checkrunning = cat.run(running);
        if (checkrunning == true) System.out.println(cntAnimal + ". " + "Кличка кота - " + name + "; Он пробежал - " + running
                + " метров! " + "Коты не любят плавать!" + "\n");
        else System.out.println(cntAnimal + ". " + "Коты могут пробежать не более 200 метров!" + " Вы задаёте - " + running + " метров!" +
                "\nПожалуйста введите верное значение для котика по кличке - " + name + "!\n");
    }

    public static void newDog(String name, int running, int swim){
        boolean checkrunning = false;
        boolean checkswim = false;
        cntAnimal++;
        cntdog++;
        Dog dog = new Dog(name, running, swim);
        checkrunning = dog.run(running);
        checkswim = dog.swim(swim);
        if (checkrunning == true && checkswim == true)  System.out.println(cntAnimal + ". " + "Кличка собаки - " + name + "; Он пробежал - " +
                running + " метров; " + "Он проплыл - " + swim + " метров!" + "\n");
        else System.out.println(cntAnimal + ". " + "Собаки могут пробежать не более 500 метров и проплыть не более 10 метров!" + " Задано бег - "
                + running + " метров!" + " Плавание - "  + swim + " метров!" +
                "\nПожалуйста введите верные значения для собачки по кличке - " + name + "!\n");
    }

    public static void main(String[] args) {
        System.out.println();
        newCat("Barsik", 200);
        newCat("Tom", 800);
        newDog("Bobik",500,10);
        newDog("Ball",500,30);
        newDog("Polkan",500,5);
        System.out.println("Котов - " + cntcat + ";");
        System.out.println("Собак - " + cntdog+ ";");
        System.out.println("Животных - " + cntAnimal + ";");
    }
}
