package org.fasttrackit.homework.course7.wrong;


public class AssignmentComparedWasted extends Course implements Comparable<AssignmentComparedWasted> {
    public AssignmentComparedWasted(int courseNumber, String title, String description) {
        super(courseNumber, title, description);
    }

    @Override
    public int compareTo(AssignmentComparedWasted o) {
        int numberOfA = this.getCourseNumber();
        int numberOfB = o.getCourseNumber();
        return numberOfA - numberOfB;
    }
}
