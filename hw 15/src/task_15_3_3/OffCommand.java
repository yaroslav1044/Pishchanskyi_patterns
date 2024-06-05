package task_15_3_3;

public class OffCommand implements Command {
    private final Device device;

    public OffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }
}
