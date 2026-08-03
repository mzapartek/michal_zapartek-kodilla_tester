package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {
    public static void main(String[] args) {
        WindowsSystem windows = new WindowsSystem(2015);
        windows.turnOn();
        windows.turnOff();

        LinuxSystem linux = new LinuxSystem(1991);
        linux.turnOn();
        linux.turnOff();
    }
}