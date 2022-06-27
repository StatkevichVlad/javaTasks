package tasks.nthSmallestElement;

/*
Task
Given an array/list [] of integers , Find the Nth smallest element in this array of integers
 */

import java.util.Arrays;

public class NthSmallestElement {

    public static int nthSmallest(final int[] arr, final int n) {

        int[] array = Arrays.stream(arr)
                .sorted()
                .toArray();

        return array[n-1]; // Do your magic!
    }
}
