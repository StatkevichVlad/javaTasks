package tasks.scrabbleScore;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Letter                           Value
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10
 */

public class ScrabbleScore {

    public static int scrabbleScore(String word) {

        Map<String , Integer> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        int result = 0;

        map.put("A" , 1);
        map.put("E" , 1);
        map.put("I" , 1);
        map.put("O" , 1);
        map.put("U" , 1);
        map.put("L" , 1);
        map.put("N" , 1);
        map.put("R" , 1);
        map.put("S" , 1);
        map.put("T" , 1);
        map.put("D" , 2);
        map.put("G" , 2);
        map.put("B" , 3);
        map.put("C" , 3);
        map.put("M" , 3);
        map.put("P" , 3);
        map.put("F" , 4);
        map.put("H" , 4);
        map.put("V" , 4);
        map.put("W" , 4);
        map.put("Y" , 4);
        map.put("K" , 5);
        map.put("J" , 8);
        map.put("X" , 8);
        map.put("Q" , 10);
        map.put("Z" , 10);

        for (int i = 0; i < word.length() ; i++) {
            String s = Character.toString(word.charAt(i));
            if (map.containsKey(s)) {
                result += map.get(s);
            }
        }

    return result;
    }
}
