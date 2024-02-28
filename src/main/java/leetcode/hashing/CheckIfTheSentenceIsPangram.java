package main.java.leetcode.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class CheckIfTheSentenceIsPangram {

    public static boolean checkIfPangram(String sentence) {
        Set<Character> letters = new HashSet<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < sentence.length(); i++) {
            letters.add(sentence.charAt(i));
        }

        return letters.size() == alphabet.length();
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
