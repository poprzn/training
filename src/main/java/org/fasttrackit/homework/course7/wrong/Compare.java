package org.fasttrackit.homework.course7.wrong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare {
    public static void main(String[] args) {

        Course c1 = new Course(4, "Chemics", "we do magic");
        Course c2 = new Course(3, "Sports", "we mantain healthy");
        Course c3 = new Course(1, "MainLanguage", "we learn how to talk");
        Course c4 = new Course(3, "Maths", "we learn how to calculate");

        List<String> courses = new ArrayList<>();
        courses.add(String.valueOf(c1));
        courses.add(String.valueOf(c2));
        courses.add(String.valueOf(c3));
        courses.add(String.valueOf(c4));

        System.out.println("Not sorded" + courses);
        Collections.sort(courses);
        System.out.println("Sorted" + courses);

    }
}
