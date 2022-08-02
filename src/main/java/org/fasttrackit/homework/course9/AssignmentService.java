package org.fasttrackit.homework.course9;

import org.fasttrackit.homework.course7.rebuilt.Assignment;
import org.fasttrackit.homework.course7.rebuilt.DifficultyLevel;

import java.util.UUID;

public class AssignmentService {

    private static final AssignmentRepository<Assignment> assignmentRepository = new AssignmentRepository<>();

    public static void main(String[] args) throws EntityNotFoundException, ValidationException {
        assignmentRepository.add(new Assignment(1, UUID.randomUUID(), 1, "Drept", "Penal", DifficultyLevel.HARD));
        assignmentRepository.add(new Assignment(2, UUID.randomUUID(), 2, "Mate", "1+1", DifficultyLevel.MEDIUM));
        assignmentRepository.add(new Assignment(3, UUID.randomUUID(), 3, "Sport", "Fugim", DifficultyLevel.EASY));
        assignmentRepository.add(new Assignment(4, UUID.randomUUID(), 4, "Engleza", "Hello", DifficultyLevel.EASY));
        System.out.println(assignmentRepository.getAll());

        assignmentRepository.updateById(new Assignment(5, UUID.randomUUID(), 5, "Franceza", "Bonjour", DifficultyLevel.MEDIUM));
        assignmentRepository.updateById(new Assignment(6, UUID.randomUUID(), 6, "Romana", "Sal", DifficultyLevel.EASY));
        System.out.println(assignmentRepository.getAll());


        assignmentRepository.deleteById(String.valueOf(1));
        assignmentRepository.deleteById(String.valueOf(2));
        System.out.println(assignmentRepository.getAll());

        System.out.println(assignmentRepository.getAllByName("Franceza"));

    }

}




