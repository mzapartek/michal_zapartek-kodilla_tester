package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
public class CarFactoryTestSuite {


    @Test
    public void shouldCreateCarBean() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Car car = (Car) context.getBean("chooseCar");

        Assertions.assertNotNull(car);
    }

    @Test
    public void shouldChooseCabrioInSummer() {
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.chooseCar(7, 12);

        Assertions.assertEquals("Cabrio", car.getCarType());
    }

    @Test
    public void shouldChooseSUVInWinter() {
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.chooseCar(1, 12);

        Assertions.assertEquals("SUV", car.getCarType());
    }

    @Test
    public void shouldChooseSedanInSpring() {
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.chooseCar(4, 12);

        Assertions.assertEquals("Sedan", car.getCarType());
    }

    @Test
    public void shouldChooseSedanInAutumn() {
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.chooseCar(10, 12);

        Assertions.assertEquals("Sedan", car.getCarType());
    }

    @Test
    public void shouldTurnHeadlightsOnAt20() {
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.chooseCar(7, 20);

        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldTurnHeadlightsOffAt6() {
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.chooseCar(7, 6);

        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldTurnHeadlightsOnBefore6() {
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.chooseCar(7, 5);

        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }
}