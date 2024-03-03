package main.java.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int answer = 0, left = 0;
        Map<Character, Integer> registeredChars = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            if (!registeredChars.containsKey(s.charAt(right)) || registeredChars.get(s.charAt(right)) < left) {
                registeredChars.put(s.charAt(right), right);
                answer = Math.max(answer, right - left + 1);
            } else {
                left = registeredChars.get(s.charAt(right)) + 1;
                registeredChars.put(s.charAt(right), right);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", lengthOfLongestSubstring("tmmzuxt"));
    }
}
