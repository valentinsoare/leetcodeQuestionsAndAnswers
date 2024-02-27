package main.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        List<String> words = new ArrayList<>(Arrays.asList( s.split(" ")));

        if (words.size() != pattern.length()) return false;

        for (int i = 0; i < words.size(); i++) {
            if (words.indexOf(words.get(i)) != pattern.indexOf(pattern.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", wordPattern("abba", "dog cat cat dog"));
    }
}
