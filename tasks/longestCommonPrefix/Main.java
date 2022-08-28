package tasks.longestCommonPrefix;

public class Main {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommoPrefix = new LongestCommonPrefix();
        String str = longestCommoPrefix.longestCommonPrefix(new  String[] {"flower" , "flow" , "fly"});
        System.out.println(str);

    }
}
