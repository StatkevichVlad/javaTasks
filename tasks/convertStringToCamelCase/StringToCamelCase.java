package tasks.convertStringToCamelCase;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
DESCRIPTION:
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within
the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred
to as Pascal case).

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"


 */

public class StringToCamelCase {
    //today code
    public static String toCamelCase1(String s){
        String[] words = s.split("[-_]");

        return !s.isEmpty() ? words[0] + Arrays.stream(words)
                .skip(1)
                .map(w -> w.replace(w.charAt(0),Character.toUpperCase(w.charAt(0))))
                .collect(Collectors.joining()) : "";
    }

    //some years ago code
    public static String toCamelCase(String s){

        if (s.contains("-")) {
            String[] arr = s.split("-");

            String res = arr[0];

            for (int i = 1; i < arr.length; i++) {
                res = res + arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
            }

            res = res.substring(0, res.length());

            return res;
        }
        if (s.contains("_")) {
            String[] arr = s.split("_");

            String res = arr[0];

            for (int i = 1; i < arr.length; i++) {
                res = res + arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
            }

            res = res.substring(0, res.length());

            return res;
        }

        return "";
    }
}
