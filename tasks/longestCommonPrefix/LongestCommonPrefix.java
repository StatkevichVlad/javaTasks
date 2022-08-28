package tasks.longestCommonPrefix;
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {



    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String firstWord = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(firstWord) != 0){
                firstWord = firstWord.substring(0 , firstWord.length() -1);
                if(firstWord.isEmpty()) return "";
            }

        }
        return firstWord;
    }
}
