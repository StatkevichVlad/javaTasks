package tasks.reversedStrings;
/*
DESCRIPTION:
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'
 */

public class ReversedStrings {


    // some years ago code
    public static String reverse0(String s){
        char[] chars = s.toCharArray();
        char[] chars1 = new char[chars.length];

        for(int i = 0; i <chars.length; i++){
            chars1[i] = chars[chars.length - i -1];
        }

        return new String(chars1);
    }

    //today code
    public static String reverse (String s){

        return new StringBuilder(s).reverse().toString();
    }
}
