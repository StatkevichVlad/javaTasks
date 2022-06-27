package tasks.highestAndLowest;

import java.util.Arrays;
import java.util.Comparator;
/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */

public class HighestAndLowest {


    //today code
    public static String highAndLow1(String numbers){
        String[] str = numbers.split(" ");

        return Arrays.stream(str)
                .mapToInt(num ->  Integer.parseInt(num))
                .max()
                .getAsInt()
                + " " +
                Arrays.stream(str)
                .mapToInt(num -> Integer.parseInt(num))
                .min()
                .getAsInt();

    }

    //some years ago
    public static String highAndLow(String numbers) {

        String[] str = numbers.split(" ");

        int[] ints = new int[str.length];

        for(int i =0; i < ints.length; i++){
            ints[i] = Integer.parseInt(str[i]);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i =0; i < ints.length; i++){
            if (ints[i] > max){
                max = ints[i];
            }
            if (ints[i] < min){
                min = ints[i];
            }
        }

        String res = max + " " + min;

        return res;
    }
}
