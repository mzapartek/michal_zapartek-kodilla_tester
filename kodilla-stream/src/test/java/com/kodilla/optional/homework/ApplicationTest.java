package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {

    @Test
    public void testGetTeacherNameWhenTeacherExists() {
        // given
        Teacher teacher = new Teacher("Anna Nowak");
        Student student = new Student("Jan Kowalski", teacher);

        // when
        String result = Application.getTeacherName(student);

        // then
        assertEquals("Anna Nowak", result);
    }

    @Test
    public void testGetTeacherNameWhenTeacherIsNull() {
        // given
        Student student = new Student("Piotr Wiśniewski", null);

        // when
        String result = Application.getTeacherName(student);

        // then
        assertEquals("<undefined>", result);
    }
}