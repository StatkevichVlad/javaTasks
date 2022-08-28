package tasks.removeDuplicatesfromSortedArray;

import java.util.Arrays;


public class RDFSA {
    public int removeDuplicates(int[] nums) {

            return Arrays.stream(nums)
                    .distinct()
                    .toArray()
                    .length;
    }

    public int[] removeDuplicatesArray(int[] nums) {
        return null;
    }
}
