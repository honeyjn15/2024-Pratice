package net.javaguide;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComparatorTwoNumber {
    public static void main(String[] args) {
        String s1 = "12233344445";
        String s2 = "12345";

        String result = IntStream.range(0, s2.length())
                .filter(i -> s1.indexOf(s2.charAt(i)) == -1)

                .mapToObj(i -> String.valueOf(i + 1))
                .collect(Collectors.joining(","));

        System.out.println(result);

    }

}
