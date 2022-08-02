package org.fasttrackit.homework.course5;

import java.util.UUID;

public class Student implements Humans {

    private int dateOfEnrollment;
    private String facultyName;
    private String specializationName;
    ScholarType type;
    UUID id;

    public int getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(int dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    @Override
    public String move() {
        return "move fingers";
    }

    @Override
    public String nameOfUniversity() {
        return "UTCN";
    }

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public String numberOfFingers() {
        return "10";
    }

    public ScholarType type() {
        return type;
    }

    public ScholarType getType() {
        return type;
    }

    public void setType(ScholarType type) {
        this.type = type;
    }

    @Override
    public UUID getId() {
        return UUID.randomUUID();
    }

    public void setId(UUID id) {
        this.id = id;
    }
}

