package lesson6;

public class Dog extends Animal{
    protected String name;
    protected int swim;


    private final int MaxLengthRun = 500;
    private final int MaxLengthSwim = 10;

    public Dog(String name,  int running, int swim) {
        super();
        this.name = name;
        this.running = running;
        this.swim = swim;
    }

    @Override
    boolean run(int LengthRun) {
        super.run(LengthRun);
        if ((LengthRun >= 0) && (LengthRun <= MaxLengthRun))
            return true;
        else return false;
    }

    @Override
    boolean swim(int LengthSwim) {
        super.swim(LengthSwim);
        if ((LengthSwim >= 0) && (LengthSwim <= MaxLengthSwim))
            return true;
        else return false;
    }
}
