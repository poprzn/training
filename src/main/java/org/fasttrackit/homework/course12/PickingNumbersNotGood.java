package org.fasttrackit.homework.course12;

import java.util.List;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        int maxResult = -1;
        int index = 0;
        int first = 0;

        while (index < a.size()) {

            if (Math.abs(a.get(first)) - a.get(index) > 1) {
                first = a.get(index);
            }

            maxResult = Math.max(maxResult, a.get(index) - first + 1);
            index++;
        }
        index--;

        return Math.max(maxResult, a.get(index) - first + 1);
    }

    public static void main(String[] args) {
        System.out.println("\n" + pickingNumbers(List.of(1, 1, 2, 2, 4, 4, 5, 5, 5)));
    }
}
