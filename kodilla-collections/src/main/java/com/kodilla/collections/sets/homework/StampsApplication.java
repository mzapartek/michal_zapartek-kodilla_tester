package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Polska", 40.0, 30.0, false));
        stamps.add(new Stamp("Niemcy", 50.0, 20.0, false));
        stamps.add(new Stamp("Litwa", 55.0, 25.0, false));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}