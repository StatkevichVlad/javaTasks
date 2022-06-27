package tasks.maximumProduct;

import java.util.stream.IntStream;

/*
Task
Given an array of integers , Find the maximum product obtained from multiplying 2 adjacent numbers in the array.

Explanation:
The maximum product obtained from multiplying 2 * 3 = 6, and they're adjacent numbers in the array.
adjacentElementsProduct([9, 5, 10, 2, 24, -1, -48]); ==> return 50
Explanation:
Max product obtained from multiplying 5 * 10 = 50 .

adjacentElementsProduct([-23, 4, -5, 99, -27, 329, -2, 7, -921])  ==>  return -14
Explanation:
The maximum product obtained from multiplying -2 * 7 = -14, and they're adjacent numbers in the array
 */

public class MaximumProduct {

    public int adjacentElementsProduct(int[] array) {

        return IntStream.range(0 , array.length -1)
                .map(i -> array[i] * array[i+1])
                .max()
                .getAsInt();
    }
}
