package net.javaguide.NormalJavaCodingProgram;

import java.util.*;

/**
 * This is a series of methods you need to implement. Do them in the order that they appear in the file.
 * When you run the main method, it'll test the implementations.
 */
public class Coding {

    /**
     * Check if the given list of words has any duplicates.
     * <p>
     * For example, if given words: abc, def, abc
     * <p>
     * This method will return true because abc is repeated. If there wasn't the second abc, then it would return false.
     *
     * @param words the words to check for duplicates
     * @return true if the given words has a duplicate, false otherwise
     */
    public static boolean hasDuplicate(List<String> words) {
        // throw new UnsupportedOperationException("Implement this, please read javadoc first");

        Set<String> seen = new HashSet<>();
        for (String word : words) {
            if (!seen.add(word)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Counts the frequencies of the given list of words.
     * <p>
     * For example, if given words: abc, def, ghi, abc, abc, def, jkl, jkl, jkl, jkl
     * <p>
     * The returned map will contain (note: the order of the map doesn't matter, and can be in any order):
     * abc:3, def:2, ghi:1, jkl:4
     *
     * @param words the list of words to count
     * @return the frequencies of the words, if the passed in words is empty, then an empty map
     */
    public static Map<String, Integer> countFrequencies(List<String> words) {
        // throw new UnsupportedOperationException("Implement this, please read javadoc first");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0)+1);
        }
        return frequencyMap;
    }

    /**
     * Calculate the intersection between the two given sets.
     * <p>
     * Example, if one of the arguments is {a, b, c, d} and the other argument is {b, d, e, f},
     * then the returned intersection will be {b, d}.
     *
     * @param left  one of the sets to intersect
     * @param right one of the sets to intersect
     * @return the intersection of both a and b, that is, all the elements that are in both
     */
    public static Set<String> intersect(Set<String> left, Set<String> right) {
        //throw new UnsupportedOperationException("Implement this, please read javadoc first");
        left.retainAll(right);
        return left;
    }

    /**
     * If there is an Incorrect in the output, check the implementation and try again.
     */
    public static void main(String[] args) {
        testDup(false);
        testDup(false, "apple");
        testDup(false, "apple", "banana");
        testDup(true, "apple", "apple");
        testDup(true, "apple", "banana", "apple");

        testFreq(Collections.emptyMap());
        testFreq(createMap("apple", 1), "apple");
        testFreq(createMap("apple", 1, "banana", 1), "apple", "banana");
        testFreq(createMap("apple", 3, "banana", 2, "orange", 1),
                "apple", "banana", "orange", "apple", "apple", "banana");

        testIntersect(set(), set(), set());
        testIntersect(set("a"), set("a"), set("a"));
        testIntersect(set("a", "b"), set("a", "b"), set("a", "b"));
        testIntersect(set("a", "b", "c"), set("d", "e"), set());
        testIntersect(set("a", "b", "c"), set("b"), set("b"));
        testIntersect(set("a", "b"), set("a", "b", "c", "d"), set("a", "b"));
    }


    /*
     * Ignore the following methods.
     * Below are helper methods to test the implementations.
     */

    private static Map<String, Integer> createMap(Object... expected) {
        Map<String, Integer> map = new HashMap<>(expected.length / 2);
        for (int i = 0; i < expected.length - 1; i += 2) {
            map.put((String) expected[i], (Integer) expected[i + 1]);
        }
        return map;
    }

    private static Set<String> set(String... values) {
        return new HashSet<>(Arrays.asList(values));
    }

    private static <T> void test(T expected, T actual) {
        if (!expected.equals(actual)) {
            System.out.println("Incorrect, expected: " + expected + ", actual: " + actual);
        } else {
            System.out.println("Correct");
        }
    }

    private static void testDup(boolean expected, String... input) {
        List<String> words = Arrays.asList(input);
        System.out.print("hasDuplicate " + words + ": ");
        test(expected, hasDuplicate(words));
    }

    private static void testFreq(Map<String, Integer> expected, String... input) {
        List<String> words = Arrays.asList(input);
        System.out.print("countFrequencies " + words + ": ");
        test(expected, countFrequencies(words));
    }

    private static void testIntersect(Set<String> left, Set<String> right, Set<String> expected) {
        System.out.print("intersect left=" + left + ", right=" + right + ": ");
        test(expected, intersect(left, right));
    }
}

