package task_10_3_2;

public class Decaf extends Beverage {
    @Override
    public String description() {
        return "Decaf";
    }

    @Override
    public float cost() {
        return 0.50f;
    }
}
