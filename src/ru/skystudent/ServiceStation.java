package ru.skystudent;

import org.jetbrains.annotations.NotNull;

public class ServiceStation {

    public void check(@NotNull Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i <= car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }
    public void check(@NotNull Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i <= bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }
    public void check(@NotNull Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i <= truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
        }
}

