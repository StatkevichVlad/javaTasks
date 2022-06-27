package tasks.smallestIntegerInArray;

public class Main {


    public static void main(String[] args) {
         int[] array1 = {34, 15, 88, 2};
         int[] array2 = {34, -345, -1, 100};


        System.out.println(SmallestIntegerInArray.findSmallestInt(array1));
        System.out.println(SmallestIntegerInArray.findSmallestInt(array2));

        System.out.println(SmallestIntegerInArray.findSmallestIntByStreamAPI(array1));
        System.out.println(SmallestIntegerInArray.findSmallestIntByStreamAPI(array2));
    }
}
