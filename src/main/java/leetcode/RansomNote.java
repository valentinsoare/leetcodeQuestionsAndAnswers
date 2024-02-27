package main.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> toStore = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            if (toStore.containsKey(magazine.charAt(i))) {
                toStore.put(magazine.charAt(i), toStore.get(magazine.charAt(i)) + 1);
            } else {
                toStore.put(magazine.charAt(i), 1);
            }
        }

        for (int j = 0; j < ransomNote.length(); j++) {
            if ((!toStore.containsKey(ransomNote.charAt(j))) || (toStore.get(ransomNote.charAt(j)) < 1)) {
                return false;
            }

            toStore.put(ransomNote.charAt(j), toStore.get(ransomNote.charAt(j)) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", canConstruct("aab", "baa"));
    }
}
