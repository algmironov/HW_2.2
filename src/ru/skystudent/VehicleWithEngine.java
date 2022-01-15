package ru.skystudent;

public abstract class VehicleWithEngine extends Vehicle {
    public VehicleWithEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
