package course5;

import java.util.Objects;

public class StudentAndProfessorClass implements Humans {

    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public void move() {
        System.out.println("moves legs");
    }

    @Override
    public String nameOfUniversity() {
        return "UBB";
    }


    @Override
    public boolean isAlive() {
        return true;
    }

    public String toString() {
        return "Human{" +
                "firstName :" + firstName + '\'' +
                "lastName :" + lastName +
                "dateOfBirth :" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentAndProfessorClass that = (StudentAndProfessorClass) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth);
    }
}