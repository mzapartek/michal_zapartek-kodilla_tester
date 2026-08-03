package com.kodilla.inheritance.homework;

public class WindowsSystem extends OperatingSystem {

    public WindowsSystem(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows został uruchomiony");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows został wyłączony");
    }
}