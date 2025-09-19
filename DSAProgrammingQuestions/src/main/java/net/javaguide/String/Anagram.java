package net.javaguide.String;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        List<String> mainLst = Arrays.asList("silent", "listen","radar", "test", "sett");
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String anagramList : mainLst) {
            String sortedList = sortList(anagramList);
            if (!anagramMap.containsKey(sortedList)) {
                anagramMap.put(sortedList, new ArrayList<>());
            }
            anagramMap.get(sortedList).add(anagramList);
        }

        for(List lst : anagramMap.values()){
            if(lst.size()>1){
                System.out.println("Is Anagram" +lst);
            }
            else{
                System.out.println("Not  Anagram" +lst);
            }
        }
    }



    private static String sortList(String anagramList) {
        char[] ch = anagramList.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}



/*
1. Start the main method.
        2. Define a list of strings named mainLst containing the input strings: "silent", "listen", "radar", "test", "sett".
        3. Initialize a HashMap named anagramMap to store sorted strings as keys and corresponding lists of anagrams as values.
        4. Iterate over each string in mainLst:
a. Sort the current string using the sortList method and store the result in sortedList.
b. Check if anagramMap contains sortedList as a key:
i. If it doesn't, put a new entry in anagramMap with sortedList as the key and a new ArrayList as the value.
ii. If it does, retrieve the list associated with sortedList and add the current string to it.
5. Iterate over each list in anagramMap's values:
a. If the size of the list is greater than 1:
i. Print "Is Anagram" followed by the list of strings in the current list.
b. Else:
i. Print "Not Anagram" followed by the list of strings in the current list.
        6. End the main method.*/
