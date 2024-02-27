package main.java.leetcode.slidingwindow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public static int maxVowels(String s, int k) {
        int number = 0, numberOfVowelsAsAnswer = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int right = 0; right < k; right++) {
            if (vowels.contains(s.charAt(right))) {
                number++;
            }
        }

        numberOfVowelsAsAnswer = Math.max(numberOfVowelsAsAnswer, number);
        number = numberOfVowelsAsAnswer;

        for (int right = k; right < s.length(); right++) {
            if (vowels.contains(s.charAt(right - k))) {
                number--;
            }

            if (vowels.contains(s.charAt(right))) {
                number++;
            }

            numberOfVowelsAsAnswer = Math.max(numberOfVowelsAsAnswer, number);
        }

        return numberOfVowelsAsAnswer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", maxVowels("leetcode", 3));
    }
}
