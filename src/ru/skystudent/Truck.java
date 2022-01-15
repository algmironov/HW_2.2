package ru.skystudent;

public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }



    public String getModelName() {
        return modelName;
    }

    public Truck setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Truck setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        return this;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
