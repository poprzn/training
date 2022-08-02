package org.fasttrackit.demo;

import org.fasttrackit.demo.model.Car;

public class MyFirstClass {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Car razvansCar = new Car();
        Car mariasCar = new Car();
        Car andreisLogan = new Car("Logan");

        System.out.println("Andrei are o masina de tip " +
                andreisLogan.getBrand() + " si are " +
                andreisLogan.getNumberOfDoors() + " usi.");
        razvansCar.setBrand("Audi");
        mariasCar.setBrand("BMW");

        System.out.println("Masina lui Razvan este: " + razvansCar.getBrand());
        System.out.println("Masina Mariei este: "+ mariasCar.getBrand());
        System.out.println(razvansCar.getNumberOfDoors());
        System.out.println(razvansCar.getNumberOfWheels());
        System.out.println("Oprire program");


    }
}
