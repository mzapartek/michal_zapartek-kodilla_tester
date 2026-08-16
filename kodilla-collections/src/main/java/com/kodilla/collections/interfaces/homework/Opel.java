package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 15;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 20;
    }
}
