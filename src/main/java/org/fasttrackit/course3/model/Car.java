package org.fasttrackit.course3.model;

import javax.swing.*;

public class Car {
    private String brand;
    private int numberOfDoors;
    private Integer numberOfWheels;
    //model
    //color
    //numberOfWheels


    public Car() {
    }

    public Car(String givenBrand) {
        brand = givenBrand;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
