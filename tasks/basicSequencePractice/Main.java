package tasks.basicSequencePractice;

public class Main {
    public static void main(String[] args) {
        int[] arr;

        arr = SequenceSum.sumOfN(-5);
        for (int a : arr){
            System.out.println(a);
        }
        System.out.println("----");
        arr = SequenceSum.sumOfN1(-5);
        for (int a : arr){
            System.out.println(a);
        }
    }
}
