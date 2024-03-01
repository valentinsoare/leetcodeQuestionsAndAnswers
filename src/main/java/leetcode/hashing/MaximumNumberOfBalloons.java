package main.java.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {

    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> elements = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if ("balloon".contains(String.valueOf(text.charAt(i)))) {
                elements.put(text.charAt(i), elements.getOrDefault(text.charAt(i), 0) + 1);
            }
        }

        if (elements.size() < ("balloon".length() - 2)) return 0;
        int minValue = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> e : elements.entrySet()) {
            char word = e.getKey();
            int count = e.getValue();

            if (word == 'l' || word == 'o') {
                minValue = Math.min(minValue, (count / 2));
            } else {
                minValue = Math.min(minValue, count);
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", maxNumberOfBalloons("loonbalxballpoon"));
    }
}
