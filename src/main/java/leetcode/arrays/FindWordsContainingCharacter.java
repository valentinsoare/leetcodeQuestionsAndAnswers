package main.java.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> valuesOfIndexes = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) >= 0) {
                valuesOfIndexes.add(i);
            }
        }

        return valuesOfIndexes;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'a'));
    }
}
