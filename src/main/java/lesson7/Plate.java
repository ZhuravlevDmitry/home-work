package lesson7;

public class Plate {

    private int meal;   // Еды в тарелке

    public int getMeal() {
        return meal;
    }

    public Plate(int meal) {
        this.meal = meal;
        System.out.println(" В миску положили - " + meal + " единиц еды!");
    }

    public int decreaseFood(int appetite) {
        meal -= appetite;
        return meal;
    }

    void addMeal() {
        this.meal += 100;
        System.out.println(" В миску добавили ещё - 100 единиц еды!" + " Теперь в миске - " + meal + " единиц еды!");
    }

    boolean checkMeal(int n) {
        return ((meal - n) >= 0);
    }

}
