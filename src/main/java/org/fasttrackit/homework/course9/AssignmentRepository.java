package org.fasttrackit.homework.course9;

import org.fasttrackit.homework.course7.rebuilt.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class AssignmentRepository <T extends Assignment> {

    List<T> assignmentList = new ArrayList<>();

    // Add to list method
    void add(T toAdd) throws ValidationException {
        if (toAdd == null) {
            throw new ValidationException("toAdd is not valid");
        }
        assignmentList.add(toAdd);
        }

    //Read all humans inside the list method
    List<T> getAll() {
        return assignmentList.stream()
                .collect(Collectors.toList());
    }

    //Delete a human based on an ID method
    public void deleteById(String id) throws EntityNotFoundException {
        if (id == null) {
            throw new EntityNotFoundException("Entity error");
        }
        assignmentList.stream()
                .filter(assignmentToDelete -> assignmentToDelete.getUniqueID().toString().equals(id))
                .forEach(a1 -> assignmentList.remove(a1));
    }


    //Modify a human based on its given ID method
    void updateById(T assignment) throws EntityNotFoundException {
        if (assignment == null) {
            throw new EntityNotFoundException("Entity error");
        }

        List<T> foundAssignments = assignmentList.stream()
                .filter(assignmentToFilter -> assignmentToFilter.getUniqueID().equals(assignment.getUniqueID()))
                .toList();

        if(foundAssignments == null || foundAssignments.isEmpty()) {
            throw new EntityNotFoundException("No entity found for given ID");
        }

        foundAssignments
                .forEach(elementToUpdate -> {
                    elementToUpdate.setTitle(assignment.getTitle());
                    elementToUpdate.setDescription(assignment.getDescription());
                    elementToUpdate.setLevel(assignment.getLevel());
                    elementToUpdate.setCourseNumber(assignment.getCourseNumber());
                });
    }


    //Read a human based on its given ID method
    T getById(String id) throws ValidationException {
        if (id == null) {
            throw new ValidationException("State error");
        }
        return assignmentList.stream()
                .filter(a3 -> a3.getUniqueID().equals(id))
                .findFirst().get();
    }


    //Read all humans by name method
    List<T> getAllByName(String name) throws ValidationException {
        Integer nameInt = Integer.parseInt(name);
        if (nameInt == null) {
            throw new ValidationException("Error");
        }

        return assignmentList.stream().filter(assignment -> assignment.getTitle().equals(name))
                .collect(Collectors.toList());
    }
}




