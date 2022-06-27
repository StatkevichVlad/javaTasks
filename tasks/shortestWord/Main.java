package tasks.shortestWord;

public class Main {
    public static void main(String[] args) {
        String s = "bla blabla blablabla";

        System.out.println(ShortestWord.findShort(s));
        System.out.println("---");
        System.out.println(ShortestWord.findShort1(s));
    }
}
