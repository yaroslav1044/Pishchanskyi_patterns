package task_10_3_1;

public class PostExclaimDecorator extends BaseDecorator{
    public PostExclaimDecorator(Component component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("!");
    }
}
