package main.java.leetcode.hashing;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        String sortedS = "";
        Map<String, List<String>> elements = new HashMap<>();

        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);

            sortedS = new String(word);

            if (!elements.containsKey(sortedS)) {
                elements.put(sortedS, new ArrayList<>());
            }

            elements.get(sortedS).add(new String(str));
        }

        return new ArrayList<>(elements.values());
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
