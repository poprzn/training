package org.fasttrackit.homework.course7.rebuilt;


import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElementsList {


    public static void main(String[] args) {
        // Unique elements
        System.out.println("\nCourses");
        AssignmentCompared c1 = new AssignmentCompared(1, UUID.randomUUID(), 3, "Maths", "We learn how to calculate", DifficultyLevel.MEDIUM);
        AssignmentCompared c2 = new AssignmentCompared(2, UUID.randomUUID(), 2, "Chemics", "We do magic", DifficultyLevel.HARD);
        AssignmentCompared c3 = new AssignmentCompared(3, UUID.randomUUID(), 3, "Sports", "We mantain healthy", DifficultyLevel.EASY);
        AssignmentCompared c4 = new AssignmentCompared(4, UUID.randomUUID(), 1, "MainLanguage", "We learn how to talk", DifficultyLevel.EASY);
        AssignmentCompared c5 = new AssignmentCompared(5, UUID.randomUUID(), 2, "Phisics", "Mark Twain", DifficultyLevel.MEDIUM);

        HashSet<AssignmentCompared> courses = new HashSet<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        courses.add(c5);
        System.out.println("\nNot sorted" + courses);

        // Sorted by number of course and difficulty level
        TreeSet<AssignmentCompared> sortedCourses = new TreeSet<>();
        sortedCourses.add(c1);
        sortedCourses.add(c2);
        sortedCourses.add(c3);
        sortedCourses.add(c4);
        sortedCourses.add(c5);
        System.out.println("\nSorted" + sortedCourses);

        // Sorted by difficulty level
        Set<AssignmentCompared> treeSet = new TreeSet(new ComparatorByCustom());
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3);
        treeSet.add(c4);
        treeSet.add(c5);
        System.out.println("\nSorted by level" + treeSet);

        // Sorted by title
        Set<AssignmentCompared> anotherTreeSet = new TreeSet<>(new ComparatorByAnotherCustom());
        anotherTreeSet.add(c1);
        anotherTreeSet.add(c2);
        anotherTreeSet.add(c3);
        anotherTreeSet.add(c4);
        anotherTreeSet.add(c5);
        System.out.println(("\nSorted by title") + anotherTreeSet);


        // Stream example sorted by UUID
        System.out.println("\nStream example sorted by UUID");
        Set<String> uniqueIds = courses.stream()
                .map(streamId -> streamId.getUniqueID())
                .map(streamId -> String.valueOf(streamId))
                .collect(Collectors.toSet());
        System.out.println(uniqueIds);



         //Stream example sorted by difficulty level by creating lew list
        System.out.println("\nStream example sorted by difficulty level");
        List<Assignment> thisAssignment = new ArrayList<>();
        thisAssignment.add(c1);
        thisAssignment.add(c2);
        thisAssignment.add(c3);
        thisAssignment.add(c4);
        thisAssignment.add(c5);
        System.out.println("List of same assignments" + thisAssignment);
        List<Assignment> assignmentsByDifficultyLevel = thisAssignment.stream()
                .filter(assignment -> assignment.getLevel().equals(DifficultyLevel.EASY) || assignment.getLevel().equals(DifficultyLevel.MEDIUM))
                .collect(Collectors.toList());
        System.out.println("Filtered" + assignmentsByDifficultyLevel);


//        // Stream example sorted by difficulty level using previous HashSet
//        System.out.println("\nStream example sorted by difficulty level");
//        List<DifficultyLevel> thisAssignment2 = courses.stream()
//                .filter(assignment -> assignment.getLevel().equals(DifficultyLevel.EASY) || assignment.getLevel().equals(DifficultyLevel.MEDIUM))
//                .collect(Collectors.toList());
//        System.out.println(thisAssignment2);



        Map <UUID, List<Assignment>> assignmentHashMap1 = courses.stream()  // Mihnea version
                .collect(Collectors.groupingBy (Assignment::getUniqueID));
        System.out.println("\nHashMap" + assignmentHashMap1);



        Map<UUID, Assignment> uuidAssignmentHashMap1 = thisAssignment.stream()  // Homework version
                .collect(Collectors.toMap(Assignment::getUniqueID,
                        Function.identity()));
        System.out.println("\nHashMap 2" + uuidAssignmentHashMap1);



    }

}
