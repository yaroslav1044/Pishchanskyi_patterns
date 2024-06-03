package task_6_3_2.components;

public class WheelDisk {
    private final double diameter;
    private final double width;
    private final MaterialType materialType;

    public WheelDisk(double diameter, double width, MaterialType materialType) {
        this.diameter = diameter;
        this.width = width;
        this.materialType = materialType;
    }

    @Override
    public String toString() {
        return "WheelDisk{" +
                "diameter=" + diameter +
                ", width=" + width +
                ", materialType=" + materialType +
                '}';
    }
}
