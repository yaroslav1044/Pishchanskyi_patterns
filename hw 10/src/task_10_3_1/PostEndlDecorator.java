package task_10_3_1;

public class PostEndlDecorator extends BaseDecorator{
    public PostEndlDecorator(Component component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("\n");
    }
}
