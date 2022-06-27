package tasks.convertStringToArray;

public class Main {
    public static void main(String[] args) {
        String[] strings = StringToArray.convert("Hello Vlad Statkevich");

        for(String s : strings){
            System.out.println(s);
        }
    }

}
