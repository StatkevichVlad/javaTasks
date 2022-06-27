package tasks.findNumbersWhichAreDivisibleByGivenNumber;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int divider = 2;

        int[] array1 = EvenNumbers.divisibleBy(numbers,divider);
        for (int a : array1){
            System.out.println(a);
        }

        System.out.println("------------");

        int[] array2 = EvenNumbers.divisibleByStreamAPI(numbers,divider);
        for (int a : array2){
            System.out.println(a);
        }
    }
}
