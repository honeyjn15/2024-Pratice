package net.javaguide.Array;

import java.util.*;

public class HighestFrequencyFirst {

    public static void main(String args[]) {
        int[] arr = {2, 2, 3, 4, 2, 3, 4, 5, 4, 2, 4, 3, 2};
        int result[] = reArrangeTheFrequency(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] reArrangeTheFrequency(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> lst = new ArrayList<>();
        for (int num : arr) {
            lst.add(num);
        }
        lst.sort((a, b) -> {
            int freqCompare = map.get(b).compareTo(map.get(a));
            if (freqCompare == 0) {
                return b.compareTo(a);
            } else {
                return freqCompare;
            }
        });

        int result[] = new int[arr.length];
        for (int i = 0; i < lst.size(); i++) {
            result[i] = lst.get(i);
        }
        return result;
    }
}
