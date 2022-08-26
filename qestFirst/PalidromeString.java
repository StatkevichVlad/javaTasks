package qestFirst;

public class PallidromeString {

    public static boolean isPallindrome(String string){
        boolean result  = true;
        for (int i = 0; i < string.length() / 2; i++) {
            if(string.charAt(i) !=  string.charAt(string.length() -1 -i)){
                result = false;
            }
        }
        return result;
    }
}
