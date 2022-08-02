package org.fasttrackit.homework.course7.rebuilt;

import java.util.UUID;

public class AssignmentCompared extends Assignment implements Comparable<AssignmentCompared> {

    public AssignmentCompared(Integer id, UUID uniqueID, int courseNumber, String title, String description, DifficultyLevel level) {
        super(id, uniqueID, courseNumber, title, description, level);
    }

    @Override
    public int compareTo(AssignmentCompared other) { // Sorted by number of course and difficulty level
        int comparedByCourseNumber = Integer.compare(other.getCourseNumber(),this.getCourseNumber());
        int compareByLevel = other.getLevel().name().compareTo(this.getLevel().name());

        if (comparedByCourseNumber == 0) {
            return compareByLevel;
        }
        return comparedByCourseNumber;

    }

}



