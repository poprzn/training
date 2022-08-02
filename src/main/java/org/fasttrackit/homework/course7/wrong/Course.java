package org.fasttrackit.homework.course7.wrong;

public class Course  {

    private int courseNumber;
    private String title;
    private String description;

    public Course(int courseNumber, String title, String description) {
            this.courseNumber = courseNumber;
            this.title = title;
            this.description = description;
    }

    @Override
    public String toString() {
        return "ListOfCourses{" +
                "courseNumber=" + courseNumber +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
