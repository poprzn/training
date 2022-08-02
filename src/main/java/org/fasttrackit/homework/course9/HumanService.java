package org.fasttrackit.homework.course9;

import org.fasttrackit.homework.course5.Professor;
import org.fasttrackit.homework.course5.Student;

public class HumanService {

    private static final HumanRepository<Student> STUDENT_HUMAN_REPOSITORY = new HumanRepository<>();
    private static final HumanRepository<Professor> PROFESSOR_HUMAN_REPOSITORY = new HumanRepository<>();


    public static HumanRepository<Professor> getProfessorRepository() {
        return PROFESSOR_HUMAN_REPOSITORY;
    }

    public static HumanRepository<Student> getStudentRepository() {
        return STUDENT_HUMAN_REPOSITORY;
    }
}

