package net.javaguide.String;

import java.util.HashMap;
import java.util.Map;

//Leet code ---12
public class IntToRoman {
    public String intToRoman(int num) {

        String ONES[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String TENS[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String HUNDRED[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String THOUSAND[] = {"", "M", "MM", "MMM"};

        return THOUSAND[num / 1000] +
                HUNDRED[(num % 1000) / 100] +
                TENS[(num % 100) / 10] +
                ONES[num % 10];

    }

    public static void main(String[] args) {
        IntToRoman solver = new IntToRoman();
        System.out.println(solver.intToRoman(2905));   // 2905
        System.out.println(solver.intToRoman(47));   // 47
        System.out.println(solver.intToRoman(83)); // 83
        System.out.println(solver.intToRoman(1994)); // 1994
    }
}
