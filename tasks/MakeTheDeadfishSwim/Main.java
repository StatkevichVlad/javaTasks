package tasks.MakeTheDeadfishSwim;

public class Main {

    public static void main(String[] args) {

        String str = "iiisdoso";

        int[] arr = MakeTheDeadFishSwim.parse(str);

        System.out.println(arr.length);

        for (int a : arr){
            System.out.println(a);
        }
    }
}
