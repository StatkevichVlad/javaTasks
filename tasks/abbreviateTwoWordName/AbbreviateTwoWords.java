package tasks.abbreviateTwoWordName;
/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F
 */

public class AbbreviateTwoWords {
// some years ago code
    public static String abbrevName(String name) {

        char[] chars = name.toCharArray();

        char[] ch = new char[3];
        ch[0] = chars[0];
        ch[1] = '.';


        for(int i =0; i < chars.length; i++){
            if(chars[i] == ' '){
                ch[2] = chars[i+1];
            }
        }


        String name1 = new String(ch).toUpperCase();

        return name1;
    }
//today code
    public static String abbrevName1(String name){
       return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();


    }
}
