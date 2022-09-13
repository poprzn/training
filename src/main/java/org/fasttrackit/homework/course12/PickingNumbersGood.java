package org.fasttrackit.homework.course12;

import java.util.List;

public class PickingNumbersF {

    public static int pickingNumbers(List<Integer> a) {
        int[] arr = new int[101];
        int result = 0;

        for (int i = 0; i < a.size(); i++) {
            int value = a.get(i);
            arr[value]++;

        }

        for (int i = 1; i < a.size(); i++) {
            result = Math.max(result, arr[i] + arr[i - 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pickingNumbers(List.of(1, 1, 2, 2, 4, 4, 5, 5, 5)));
    }
}

