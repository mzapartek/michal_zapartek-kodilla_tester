package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println("Pole kwadratu: " + square.calculateArea());
        System.out.println("Obwód kwadratu: " + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());

        Circle circle = new Circle(3);

        System.out.println("Pole koła: " + circle.calculateArea());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());

        Person person1 = new Person("Anna", 35, new Doctor());
        person1.displayResponsibilities();

        Person person2 = new Person("Piotr", 40, new Miner());
        person2.displayResponsibilities();

        Person person3 = new Person("Michał", 30, new ITSpecialist());
        person3.displayResponsibilities();
    }
}