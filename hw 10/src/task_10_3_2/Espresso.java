package task_10_3_2;

public class Espresso extends Beverage {
    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public float cost() {
        return 0.75f;
    }
}
