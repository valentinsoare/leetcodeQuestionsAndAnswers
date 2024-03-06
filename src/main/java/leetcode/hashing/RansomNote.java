package main.java.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            letters.put(magazine.charAt(i), letters.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (int j = 0; j < ransomNote.length(); j++) {
            if (!letters.containsKey(ransomNote.charAt(j))) {
                return false;
            }

            letters.put(ransomNote.charAt(j), letters.getOrDefault(ransomNote.charAt(j), 0) - 1);

            if (letters.get(ransomNote.charAt(j)) == 0) {
                letters.remove(ransomNote.charAt(j));
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", canConstruct("aa", "aab"));
    }
}
