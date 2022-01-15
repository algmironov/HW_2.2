package ru.skystudent;

public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public Car setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Car setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        return this;
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
