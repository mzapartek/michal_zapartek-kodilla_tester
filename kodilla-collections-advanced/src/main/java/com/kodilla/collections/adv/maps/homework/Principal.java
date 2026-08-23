package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstname, principal.firstname) && Objects.equals(lastname, principal.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }

    private String firstname;
    private String lastname;

    public Principal(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}