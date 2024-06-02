package task_4_3_1.builders;

import task_4_3_1.Car;
import task_4_3_1.components.*;

public class CarBuilder implements Builder {
    private BodyType bodyType;
    private WheelDisk wheelDisk;
    private Transmission transmission;
    private Rubber rubber;
    private Engine engine;
    private String color;

    @Override
    public Builder setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setWheelDisk(WheelDisk wheelDisk) {
        this.wheelDisk = wheelDisk;
        return this;
    }

    @Override
    public Builder setRubber(Rubber rubber) {
        this.rubber = rubber;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(bodyType, wheelDisk, transmission, rubber, engine, color);
    }
}
