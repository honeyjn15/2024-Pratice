package net.javaguide.String;

import java.util.HashMap;
import java.util.Map;

//Leet code ---13
public class RomanToInt {
    // Character → Integer map
    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) return 0;

        int total = 0;

        // for loop with manual index control (no i++ in header)
        for (int i = 0; i < s.length(); ) {
            int curr = map.get(s.charAt(i));

            //if cur is greater then next only then move i+2 else i++;
            if (i + 1 < s.length()) {
                int next = map.get(s.charAt(i + 1));

                if (curr < next) {
                    // subtractive pair like IV, IX, XL, CM...
                    total += (next - curr);
                    // skip both
                    i = i + 2;
                    continue;
                }
            }

            // normal single character
            total += curr;
            i++;
        }

        return total;
    }

    // quick test
    public static void main(String[] args) {
        RomanToInt solver = new RomanToInt();
        System.out.println(solver.romanToInt("MMCMV"));   // 2905
        System.out.println(solver.romanToInt("XLVII"));   // 47
        System.out.println(solver.romanToInt("LXXXIII")); // 83
        System.out.println(solver.romanToInt("MCMXCIV")); // 1994
    }
}
