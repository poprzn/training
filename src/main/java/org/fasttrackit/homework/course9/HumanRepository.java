package org.fasttrackit.homework.course9;


import org.fasttrackit.homework.course5.Humans;
import org.fasttrackit.homework.course5.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HumanRepository<T extends Humans> {

    List<T> humansList = new ArrayList<>();

        // Add to list method
     void add(T toAdd) {
        humansList.add(toAdd);
    }
        //Read all humans inside the list method
     List<T> getAll() {
        return humansList.stream()
                .collect(Collectors.toList());
     }

        //Delete a human based on an ID method
     void deleteById(String id) {
         humansList.stream()
                 .filter(human1 -> human1.getId().equals(id))
                 .forEach(humanToDelete -> humansList.remove(humanToDelete));
    }

    void updateById (String id, T human) {
         humansList.stream()
                 .filter(hum1 -> hum1.getId().equals(id))
                 .forEach(updateElement -> updateElement.move());
     }




}






