package org.fasttrackit.homework.course7.rebuilt;

import java.util.*;

public class Assignment {
    private UUID uniqueID;
    private int courseNumber;
    private String title;
    private String description;
    private DifficultyLevel level;
    private Integer id;

    public Assignment(Integer id, UUID uniqueID, int courseNumber, String title, String description, DifficultyLevel level) {
        this.uniqueID = uniqueID;
        this.courseNumber = courseNumber;
        this.title = title;
        this.description = description;
        this.level = level;
        this.id = id;
    }

    public UUID getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(UUID uniqueID) {
        this.uniqueID = uniqueID;
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

    public DifficultyLevel getLevel() {
        return level;
    }

    public void setLevel(DifficultyLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "uniqueID=" + uniqueID +
                ", courseNumber=" + courseNumber +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", level=" + level +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return courseNumber == that.courseNumber && Objects.equals(uniqueID, that.uniqueID) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && level == that.level && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueID, courseNumber, title, description, level, id);
    }
}




