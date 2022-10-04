package org.fasttrackit.homework.course9;

import org.fasttrackit.homework.course5.Professor;
import org.fasttrackit.homework.course5.Student;

public class InjectionRunner {

    public static void main(String[] args) {

        HumanRepository<Student> studentRepository = new HumanRepository<>();
        HumanRepository<Professor> professorRepository = new HumanRepository<>();

         HumanService humanService = new HumanService(studentRepository,professorRepository);

    }
}
