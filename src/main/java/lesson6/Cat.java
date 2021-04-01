package lesson6;

public class Cat extends Animal {
    public String name;
    public boolean swim;
    public int running;


    private final int MaxLengthRun = 200;


    public Cat(String name, int running) {
        super();
        this.name = name;
        this.running = running;
    }

    @Override
    boolean run(int LengthRun) {
        super.run(LengthRun);
        if ((LengthRun >= 0) && (LengthRun <= MaxLengthRun))
            return true;
        else return false;
    }
}

