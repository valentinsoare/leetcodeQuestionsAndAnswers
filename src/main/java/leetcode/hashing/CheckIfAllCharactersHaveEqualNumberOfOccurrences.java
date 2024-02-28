package main.java.leetcode.hashing;

import java.util.*;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    public static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }

        Set<Integer> freq = new HashSet<>(letters.values());
        return freq.size() == 1;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", areOccurrencesEqual("aaabb"));
    }
}
