package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> schools = new HashMap<>();
        Principal principal1 = new Principal("Jan", "Kowalski");
        Principal principal2 = new Principal("Anna", "Nowak");
        Principal principal3 = new Principal("Piotr", "Wiśniewski");

        ArrayList<Integer> students1 = new ArrayList<>();
        School school1 = new School("School 1", students1);
        students1.add(25);
        students1.add(25);
        students1.add(28);
        students1.add(24);

        ArrayList<Integer> students2 = new ArrayList<>();
        students2.add(22);
        students2.add(26);
        students2.add(30);

        School school2 = new School("School 2", students2);
        ArrayList<Integer> students3 = new ArrayList<>();
        students3.add(20);
        students3.add(23);
        students3.add(27);

        School school3 = new School("School 3", students3);
        schools.put(principal1, school1);
        schools.put(principal2, school2);
        schools.put(principal3, school3);

        for (Map.Entry<Principal, School> entry : schools.entrySet()) {

            Principal principal = entry.getKey();
            School school = entry.getValue();

            System.out.println(
                    "Principal: " + principal.getFirstname() + " " + principal.getLastname()
                            + ", school: " + school.getName()
                            + ", students: " + school.getTotalStudents()
            );
        }
    }
}