package ru.skystudent;

public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public Bicycle setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Bicycle setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        return this;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
