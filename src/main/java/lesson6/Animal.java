package lesson6;

public class Animal {
    public   String name;
    public   int running;
    private final int MaxLengthRun = 0;
    private final int MaxLengthSwim = 0;

    boolean run(int LengthRun) {
        return false;
    }
    boolean swim(int LengthSwim){
        return false;
    }

    public Animal(String name){
        this.name = name;
    }

    public Animal() {
    }

}


