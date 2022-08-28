package tasks.removeElement;

import java.util.Arrays;

public class RemoveElement {
    private int[] nums;

    public int removeElement(int[] nums, int val) {

        return Arrays.stream(nums)
                .filter(i -> i != val)
                .toArray()
                .length;
    }

    public int[] removeElementA(int[] nums, int val) {


        return Arrays.stream(nums)
                .filter(i -> i != val)
                .toArray();
    }
}
