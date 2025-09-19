package net.javaguide.striver;

public class LongestCommonPrefix {

    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    public String findCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null) {
            return null;
        }

        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String str[] = {"flower", "flow", "flowe"};
        longestCommonPrefix.findCommonPrefix(str);
    }
}