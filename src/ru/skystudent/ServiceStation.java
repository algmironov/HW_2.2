package ru.skystudent;

public class ServiceStation {
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.modelName);
        for (int i = 0; i <= car.wheelsCount; i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }
    public void check(Bicycle bicycle) {

        System.out.println("Обслуживаем " + bicycle.modelName);
        for (int i = 0; i <= bicycle.wheelsCount; i++) {
            bicycle.updateTyre();
        }
    }
    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.modelName);
        for (int i = 0; i <= truck.wheelsCount; i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
        }
}

