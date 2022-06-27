package tasks.removeDuplicatesfromSortedArray;

public class Main {
    public static void main(String[] args) {
        RDFSA rdfsa = new RDFSA();
        int[] nums = {1,1,2,3,3,3,4,4 };
        System.out.println(rdfsa.removeDuplicates(nums));

         int[] newArr = rdfsa.removeDuplicatesArray(nums);

         for (int a : newArr){
             System.out.println(a);
         }

    }
}
