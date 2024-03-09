package main.java.leetcode.hashing;

import java.util.*;

public class SortCharactersByFrequencyCompany {

    public static String frequencySort(String s) {
        Map<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            letters.merge(s.charAt(i), 1, (e, f) -> e + 1);
        }

        List<Integer> valuesFromMap = new ArrayList<>(letters.values());
        String[] answer = new String[valuesFromMap.size()];
        valuesFromMap.sort(Comparator.reverseOrder());

        int location = 0;
        for (Map.Entry<Character, Integer> e : letters.entrySet()) {
            location = valuesFromMap.indexOf(e.getValue());
            answer[location] = String.valueOf(e.getKey()).repeat(e.getValue());
            valuesFromMap.set(location, 0);
        }

        return String.join("", answer);
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", frequencySort("Aabb"));
    }
}
