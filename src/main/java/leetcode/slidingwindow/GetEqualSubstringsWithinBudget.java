package main.java.leetcode.slidingwindow;

public class GetEqualSubstringsWithinBudget {

    public static int equalSubstring(String s, String t, int maxCost) {
        int left = 0, cost = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            cost += Math.abs(s.charAt(right) - t.charAt(right));

            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", equalSubstring("abcd", "bcdf", 3));
    }
}
