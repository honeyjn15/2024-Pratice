package net.javaguide.Array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 2, 3, 1};
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int element : arr) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        for (Map.Entry<Integer, Integer> countMap : map.entrySet()) {
            if (countMap.getValue() > 1) {
                System.out.println("Element-->" + countMap.getKey() + "Value--->" + countMap.getValue());
            }
        }

    }
}
