package net.javaguide.String;


//leetcode ---> 28
public class SubstringIndexSearch {

    public static void main(String args[]) {

        SubstringIndexSearch indexSearch = new SubstringIndexSearch();
        String s1 = "rleetcode";
        String s2 = "leet";
        int value = indexSearch.findIndex(s1, s2);
        System.out.println(value);
    }

    private int findIndex(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (m > n) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            if (s1.substring(i, i + m).equals(s2)) {
                return i;
            }
        }
        return -1;
    }
}
