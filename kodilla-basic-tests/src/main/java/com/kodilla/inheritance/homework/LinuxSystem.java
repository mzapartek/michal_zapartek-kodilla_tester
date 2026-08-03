package com.kodilla.inheritance.homework;

public class LinuxSystem extends OperatingSystem {

    public LinuxSystem(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Linux został uruchomiony");
    }

    @Override
    public void turnOff() {
        System.out.println("Linux został wyłączony");
    }
}