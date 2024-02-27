package main.java.leetcode;

import java.util.*;

public class RomanToInteger {
    public static int romanToInteger(String s) {
        List<Integer> valuesForMap =
                new ArrayList<>(Arrays.asList(1, 5, 10, 50 ,100, 500, 1000, 4, 9, 40, 90, 400, 900));
        List<String> keysForMap =
                new ArrayList<>(Arrays.asList("I", "V","X" ,"L" ,"C", "D" ,"M", "IV", "IX", "XL", "XC", "CD", "CM"));
        Map<String, Integer> mappingRomanInt =
                new HashMap<>();

        for (int i = 0; i < keysForMap.size(); i++) {
            mappingRomanInt.put(keysForMap.get(i), valuesForMap.get(i));
        }

        int toReturn = 0;
        String element;
        int j = keysForMap.size() - 1;

        while (j >= 0 && !s.isEmpty()) {
            element = keysForMap.get(j);

            if (s.contains(element)) {
                toReturn += mappingRomanInt.get(element);
                s = s.replaceFirst(element, "");

                if (s.contains(element)) {
                    continue;
                }
            }

            j--;
        }

        return toReturn;
    }


    public static void main(String[] args) {
        System.out.printf("%n%s", romanToInteger("MCMLXXXVII"));
    }
}
