package tasks.MakeTheDeadfishSwim;
/*
Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.

Deadfish.parse("iiisdoso") =- new int[] {8, 64};
 */


public class MakeTheDeadFishSwim {

    public static int[] parse(String data) {
        char[] commandLine = data.toCharArray();
        int countO = 0;
        int tmp = 0;

        for (int i = 0; i < commandLine.length; i++) {
            if (commandLine[i] == 'o' || commandLine[i] == 'O') {
                countO++;
            }
        }

        int[] resultArray = new int[countO];
        int resultArrayIndex = 0;


        for (int i = 0; i < commandLine.length; i++) {
            if (commandLine[i] == 'i' || commandLine[i] == 'I') {
                tmp++;
            } else if (commandLine[i] == 'd' || commandLine[i] == 'D') {
                tmp--;
            } else if (commandLine[i] == 's' || commandLine[i] == 'S') {
                tmp *= tmp;
            } else if (commandLine[i] == 'o' || commandLine[i] == 'O') {
                resultArray[resultArrayIndex] = tmp;

                resultArrayIndex++;
            }
        }

        return resultArray;

    }
}
