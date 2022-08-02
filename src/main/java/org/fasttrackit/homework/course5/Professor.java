package org.fasttrackit.homework.course5;

import java.util.UUID;

public class Professor implements Humans {

    private int dateOfHiring;
    private String specializationName;
    private ProfessorType type;
    private UUID id;

    public UUID getUuid() {
        return id;
    }

    public void setUuid(UUID uuid) {
        this.id = uuid;
    }

    public int getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(int dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public String nameOfUniversity() {
        return null;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public String numberOfFingers() {
        return null;
    }

    @Override
    public ScholarType type() {
        return type;
    }

    @Override
    public UUID getId() {
        return UUID.randomUUID();
    }
}
