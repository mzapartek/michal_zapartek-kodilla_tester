package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;

public class School {

    public School(String name, ArrayList<Integer> students) {
        this.name = name;
        this.students = students;
    }

    private String name;
    private ArrayList<Integer> students;

    public String getName() {
        return name;
    }
        public int getTotalStudents() {
            int sum = 0;

            for (int studentsCount : students) {
                sum += studentsCount;
            }

            return sum;
        }
    }
