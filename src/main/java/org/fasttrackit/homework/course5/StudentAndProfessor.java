package org.fasttrackit.homework.course5;

import java.util.Objects;
import java.util.UUID;

public class StudentAndProfessor implements Humans {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    StudentType type;

    @Override
    public UUID getId() {
        return UUID.randomUUID();
    }

    public String move() {
        return "move legs";

    }

    @Override
    public String nameOfUniversity() {
        return "UBB";
    }

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public String numberOfFingers() {
        return "10";
    }

    @Override
    public ScholarType type() {
        return type;
    }


    public String toString() {
        return "Human{" +
                "firstName :" + firstName + '\'' +
                "lastName :" + lastName +
                "dateOfBirth :" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentAndProfessor that = (StudentAndProfessor) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth);
    }

}