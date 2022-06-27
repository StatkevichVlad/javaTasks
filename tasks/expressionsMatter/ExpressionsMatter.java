package tasks.expressionsMatter;

import java.util.stream.IntStream;
/*
Task
Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained
Example
With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:

1 * (2 + 3) = 5
1 * 2 * 3 = 6
1 + 2 * 3 = 7
(1 + 2) * 3 = 9
So the maximum value that you can obtain is 9.

Notes
The numbers are always positive.
The numbers are in the range (1  ≤  a, b, c  ≤  10).
You can use the same operation more than once.
It's not necessary to place all the signs and brackets.
Repetition in numbers may occur .
You cannot swap the operands. For instance, in the given example you cannot get expression (1 + 3) * 2 = 8.
 */

public class ExpressionsMatter {

    //today
    public static int expressionsMatter(int a, int b, int c){
        return IntStream.of(a * (b + c) , a * b * c , a + b * c , (a + b) * c ,a + b + c)
                .max()
                .getAsInt();
    }

    //some years ago
    public static int expressionsMatter0(int a, int b, int c)
    {
        int max = 0;
        int max1 = a * (b + c);
        int max2 = a * b * c;
        int max3 = a + b * c;
        int max4 = (a + b) * c;
        int max5 = a + b + c;

        int[] maxes = new int[5];
        maxes[0] = max1;
        maxes[1] = max2;
        maxes[2] = max3;
        maxes[3] = max4;
        maxes[4] = max5;


        for(int i = 0; i <maxes.length; i++){
            if(maxes[i] > max){
                max = maxes[i];
            }
        }
        return max;
    }
}
