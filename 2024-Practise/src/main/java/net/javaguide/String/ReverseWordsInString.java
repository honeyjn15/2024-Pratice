package net.javaguide.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWordsInString {

    public static void main(String args[]) {
        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        String s1 = "   the sky is       blue   ";
        reverseWordsInString.reverseWord(s1);
    }

    public String reverseWord(String s1) {
        int start = 0;
        List<String> words = new ArrayList<>();
        for (int i = 0; i <= s1.length() - 1; i++) {
            if (s1.charAt(i) == ' ') {
                words.add(s1.substring(start, i));
                start = i + 1;
            }

        }
        words.add(s1.substring(start));

        StringBuilder finalResult = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            if(words.get(i).isEmpty()){
                continue;
            }

            if (finalResult.length()>0) {
                finalResult.append(" ");
            }
            finalResult.append(words.get(i));

        }
        System.out.println(finalResult);
        return finalResult.toString();
    }

}
