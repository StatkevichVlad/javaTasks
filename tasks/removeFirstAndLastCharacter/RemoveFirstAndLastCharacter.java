package tasks.removeFirstAndLastCharacter;
/*
DESCRIPTION:
It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
 You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
 */

public class RemoveFirstAndLastCharacter {
    // some years ago code
    public static String remove0(String str) {

        char[] chars = str.toCharArray();

        String s = "" ;

        for (int i = 1; i <str.length()-1; i++) {
            s = s + chars[i];
        }

        return s;
    }

    public static String remove(String str){
        return str.substring(1 , str.length() -1);
    }
}
