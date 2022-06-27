package tasks.convertStringToArray;
/*
Write a function to split a string and convert it into an array of words.

Examples (Input ==> Output):
"Robin Singh" ==> ["Robin", "Singh"]

"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */

public class StringToArray {
    public static String[] convert(String s){
         String[] res =  s.split(" ");
        return res;
    }
}
