package tasks.shortestWord;
/*
DESCRIPTION:
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */

import java.util.Arrays;
import java.util.Comparator;

public class ShortestWord {

    //today code
    public static int findShort1(String s){
        String[] words = s.split(" ");

        return Arrays.stream(words)
                .mapToInt(w -> w.length())
                .min()
                .getAsInt();
    }

    //some years ago code
    public static int findShort(String s) {
        String[] str = s.split(" ");
        int len = str[0].length();


        for(int i =0; i < str.length; i ++){

            if(str[i].length() < len ) {
                len = str[i].length();

            }
        }

        return len;
    }
}
