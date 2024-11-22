package net.javaguide.String;

import java.util.HashMap;
import java.util.Map;

public class Characterfrerquency {
    public static void main(String args[]) {
        String input = "aabbbccddaaabbccceeff";
        char currentChar = input.charAt(0);
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int freq = 1;
        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);
            if (nextChar == currentChar) {
                freq++;
            } else {
                frequencyMap.put(currentChar, freq);
                currentChar = nextChar;
                freq = 1;
            }
        }
        frequencyMap.put(currentChar, freq);

        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character,Integer> map: frequencyMap.entrySet()){
            result.append(map.getKey()).append(map.getValue());
        }
        System.out.println(result.toString());
    }
}
