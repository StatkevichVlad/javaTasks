package tasks.countPositiveSumNegative;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

        int[] resultArray = CountPositiveSumNegative.countPositivesSumNegatives(array);

        for (int a : resultArray){
            System.out.println(a);
        }
    }
}
