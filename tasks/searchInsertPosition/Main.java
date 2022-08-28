package tasks.searchInsertPosition;

public class Main {
    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int res = searchInsertPosition.searchInsert(new int[] {1},-11);
        int[] arr = new int[] {2};
        System.out.println(res);
    }
}
