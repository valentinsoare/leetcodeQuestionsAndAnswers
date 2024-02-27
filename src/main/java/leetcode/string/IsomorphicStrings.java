package main.java.leetcode.string;

import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (t.length() != s.length()) return false;

        LinkedHashMap<Character, Integer> letterLocations = new LinkedHashMap<>();

        for (int i = 0; i < t.length(); i++) {
            letterLocations.put(t.charAt(i), i);
        }

        String toCompareA = letterLocations.values().toString();
        letterLocations.clear();

        for (int j = 0; j < s.length(); j++) {
            letterLocations.put(s.charAt(j), j);
        }

        String toCompareB = letterLocations.values().toString();
        return (toCompareA.equals(toCompareB));
    }

    public static boolean isIsomorphicV2(String s, String t) {
        if (t.length() != s.length()) return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }

            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }

        System.out.printf("%n%s", Arrays.toString(map1));
        return true;
    }

    public static boolean isIsomorphicV3(String s, String t) {
        if (t.length() != s.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", isIsomorphic("paper", "title"));
        System.out.printf("%n%s", isIsomorphicV2("soar", "area"));
    }
}
