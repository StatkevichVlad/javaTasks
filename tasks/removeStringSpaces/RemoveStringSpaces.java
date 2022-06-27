package tasks.removeStringSpaces;
/*
DESCRIPTION:
Simple, remove the spaces from the string, then return the resultant string.
 */

public class RemoveStringSpaces {

    static String noSpace(final String x) {
        return x.replaceAll(" ","");
    }
}
