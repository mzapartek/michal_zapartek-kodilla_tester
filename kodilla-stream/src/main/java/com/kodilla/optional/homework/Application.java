package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Anna Nowak");
        Teacher teacher2 = new Teacher("Tomasz Kowalski");


        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", teacher1));
        students.add(new Student("Piotr Wiśniewski", null));
        students.add(new Student("Maria Zielińska", teacher2));
        students.add(new Student("Adam Nowak", null));

        for (Student student : students) {
            String teacherName = getTeacherName(student);

            System.out.println(
                    "uczeń: " + student.getName()
                            + ", nauczyciel: " + teacherName
            );
        }
    }
public static String getTeacherName(Student student) {
    Teacher teacher = Optional.ofNullable(student.getTeacher())
            .orElse(new Teacher("<undefined>"));

    return teacher.getName();
}
}
