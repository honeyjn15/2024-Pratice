package net.javaguide.Collections;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

//I/p : india is a great country
//o/p :
public class FrequencyOfCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String input = sc.nextLine();

        Map<Character, Long> frequencyMap = calculateFrequency(input);
        displayFrequency(frequencyMap);
        sc.close();

    }

    private static void displayFrequency(Map<Character, Long> frequencyMap) {
        frequencyMap.forEach((character, frequency) ->
                System.out.println(+character+ "Frequency is" + frequency));
    }

    private static Map<Character, Long> calculateFrequency(String input) {
        return input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
