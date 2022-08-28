package tasks.replaceEveryNth;

public class ReplaceEveryNth {

    public static String replaceNth(String text, int n, char oldValue, char newValue) {
        char[] words = text.toCharArray();
        StringBuilder resultString = new StringBuilder();

        int count = 1;
        for (int i = 0; i < words.length ; i++) {
            if (oldValue == words[i]) {
                if (n > 0 && count % n == 0){
                    words[i] = newValue;
                }
                count++;
            }
            resultString.append(words[i]);
        }

        return resultString.toString();
    }
}
