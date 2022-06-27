package tasks.isDigit;

/*
DESCRIPTION:
Implement String#digit? (in Java StringUtils.isDigit(String)), which should return true if given object is a digit (0-9),
false otherwise.
 */

public class DigitMarker {

    public static boolean isDigit(String s){

        return (!s.isEmpty() && Character.isDigit(s.charAt(0))) ? true : false;
    }
}

