package org.fasttrackit.homework.course9;

import org.fasttrackit.homework.course5.Professor;
import org.fasttrackit.homework.course5.Student;

public class HumanService {

    private final HumanRepository<Student> studentHumanRepository;
    private final HumanRepository<Professor> professorHumanRepository;

    public HumanService(HumanRepository<Student> studentHumanRepository, HumanRepository<Professor> professorHumanRepository) {
        this.studentHumanRepository = studentHumanRepository;
        this.professorHumanRepository = professorHumanRepository;
    }
}

