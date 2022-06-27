package tasks.invertValues;

public class Main {
    public static void main(String[] args) {
    int[] result = InvertValues.invert(new int[] {1,-2,3,-4,5});

       for (int a : result){
           System.out.println(a);
       }
    }
}
