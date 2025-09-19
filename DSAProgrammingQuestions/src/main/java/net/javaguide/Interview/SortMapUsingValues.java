/*
package net.javaguide.Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapUsingValues {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("Honey",1);
        map.put("Rohit",2);
        map.put("Mohit",3);
        map.put("Sohit",4);
    }

    public static Map<String, Integer> sortByValue(Map<String , Integer> map){

        TreeMap<String ,Integer > map = new TreeMap<>((o1,o2) ->{
            int compare = map.get(o1).compareTo(map.get(o2));

            return compare ==0?1:compare});
        }

    }
}
*/
