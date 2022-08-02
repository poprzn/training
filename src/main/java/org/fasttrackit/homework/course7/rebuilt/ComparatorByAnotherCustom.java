package org.fasttrackit.homework.course7.rebuilt;

import java.util.Comparator;

public class ComparatorByAnotherCustom implements Comparator<Assignment> {


    @Override
    public int compare(Assignment o1, Assignment o2) {
        int compareByNumber = Integer.compare(o1.getCourseNumber(), o2.getCourseNumber());

        int compareByTitle = o1.getTitle().compareTo(o2.getTitle());
        if (compareByNumber == 0) {
            return compareByTitle;
        }

        return compareByNumber;
    }
}
