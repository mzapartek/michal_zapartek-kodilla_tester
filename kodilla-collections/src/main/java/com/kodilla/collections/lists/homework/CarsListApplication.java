package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;


import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Ford ford = new Ford();
        cars.add(ford);
        cars.add(new Opel());
        cars.add(new BMW());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(1);
        cars.remove(ford);

        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println("List size: " + cars.size());
        }
    }
}