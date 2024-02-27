package main.java.leetcode.string;

import java.util.*;

public class IntegerToRoman {
    public static String integerToRoman(String s) {
        List<Integer> keysForMap = new ArrayList<>(Arrays.asList(1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000));
        List<String> valuesForMap = new ArrayList<>(Arrays.asList("I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD",
                "D", "CM", "M"));

        StringBuilder toReturn = new StringBuilder();
        int toUseForCalc = Integer.parseInt(s);
        int j = keysForMap.size() - 1;


        while (j >= 0 && toUseForCalc > 0) {
            if (toUseForCalc >= keysForMap.get(j)) {
                toUseForCalc -= keysForMap.get(j);

                toReturn.append(valuesForMap.get(j));

                if (toUseForCalc >= keysForMap.get(j)) {
                    continue;
                }
            }

            j--;
        }

        return toReturn.toString();
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", integerToRoman("1994"));
    }
}
