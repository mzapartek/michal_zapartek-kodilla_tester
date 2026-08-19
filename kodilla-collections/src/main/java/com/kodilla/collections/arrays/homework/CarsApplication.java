package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.BMW;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[RANDOM.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        int drawnCar = RANDOM.nextInt(3);
        Car car;

        if (drawnCar == 0) {
            car = new Ford();
        } else if (drawnCar == 1) {
            car = new Opel();
        } else {
            car = new BMW();
        }
        int speedIncrease = RANDOM.nextInt(10) + 1;
        for (int i = 0; i < speedIncrease; i++) {
            car.increaseSpeed();
        }

        return car;
    }
}