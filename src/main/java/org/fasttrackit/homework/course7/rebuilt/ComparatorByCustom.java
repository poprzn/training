package org.fasttrackit.homework.course7.rebuilt;

import java.util.Comparator;

public class ComparatorByCustom implements Comparator<Assignment> {
    @Override
    public int compare(Assignment o1, Assignment o2) {
        int comparedByCourseNumber = Integer.compare(o1.getCourseNumber(),o2.getCourseNumber());

        int compareByLevel = o1.getLevel().name().compareTo(o2.getLevel().name());
        if (comparedByCourseNumber == 0) {
            return compareByLevel;
        }

        return comparedByCourseNumber;
    }
}
