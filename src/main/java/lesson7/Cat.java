package lesson7;

public class Cat {
    private final String name; // Имя
    boolean  satiety; // Сытость
    private final int appetite;// Сколько котику нужно съесть до сытости


    public  Cat(String name, boolean satiety, int appetite) {
        this.name = name;
        this.satiety = false;
        this.appetite = appetite;
        System.out.println(" Имя коткика - " + name + " ,он голоден и чтобы его накормить нужно - " + appetite + " едениц еды!");
    }

    public  String getName() {
        return name;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public  int getAppetite() {
        return appetite;
    }


    public void Eat(Plate p) {
       if (p.decreaseFood(appetite)>=0){
           satiety = true;
       }
    }
}
