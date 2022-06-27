package tasks.invertValues;
/*
Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []
 */

public class InvertValues {
    public static int[] invert(int[] array) {
        int[] ints = new int[array.length];

        for(int i = 0; i <array.length; i++ ){
                ints[i] = -array[i] ;
        }

        return ints;
    }
}
