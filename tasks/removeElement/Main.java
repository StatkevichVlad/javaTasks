package tasks.removeElement;

public class Main {
    public static void main(String[] args) {
        RemoveElement removeElement =  new RemoveElement();
        int [] arr = removeElement.removeElementA(new int[] {3,2,2,3,3}, 3);
        System.out.println(arr.toString());

        for (int a : arr){
            System.out.println(a);
        }
    }
}
