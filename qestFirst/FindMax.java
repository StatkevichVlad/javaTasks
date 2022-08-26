package qestFist;

public class FindMax {

    public static int maxInt(int[] array){
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }

        return result;
    }
}
