package tasks.beginnerLostWithoutMap;
/*
Given an array of integers, return a new array with each value doubled.

For example:
[1, 2, 3] --> [2, 4, 6]
*/

public class BeginnerLostWithoutMap {
    public static int[] map(int[] arr) {
        int[] doubles = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            doubles[i] = arr[i]*2;
        }
        return doubles;
    }
}
