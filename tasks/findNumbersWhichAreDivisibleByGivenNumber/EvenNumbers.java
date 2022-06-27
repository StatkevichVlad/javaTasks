package tasks.findNumbersWhichAreDivisibleByGivenNumber;
/*
Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.

Example(Input1, Input2 --> Output)
[1, 2, 3, 4, 5, 6], 2 --> [2, 4, 6]
 */

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbers {

    //today code
    public static int[] divisibleByStreamAPI(int[] numbers, int divider){
        return Arrays.stream(numbers)
                .filter(num -> num % divider == 0)
                .toArray();
    }

    //some years ago code
    public static int[] divisibleBy(int[] numbers, int divider) {
        ArrayList array = new ArrayList();

        for(int i =0; i < numbers.length; i++){
            if(numbers[i] % divider == 0){
                array.add(numbers[i]);
            }
        }

        int[] res = new int[array.size()];

        for(int i = 0; i <res.length; i++){
            res[i] = (int) array.get(i);
        }

        return res;
    }
}
