package main.java.leetcode.slidingwindow;

import static java.lang.Math.max;

public class LongestSubstringWithOnes {
    public static int findLengthOfTheLongestSubStringWithOnes(String s) {
        int left = 0;
        int numberOfZeroes = 0;
        int answer = 0;
        String textAsAResult = "";

        for (int right = 0 ; right < s.length(); right++) {
            if (numberOfZeroes <= 1 && s.substring(left, right).length() >= textAsAResult.length()) {
                textAsAResult = s.substring(left, right);
            }

            if (s.charAt(right) == '0') {
                numberOfZeroes++;
            }

            while (numberOfZeroes > 1) {
                if (s.charAt(left) == '0') {
                    numberOfZeroes--;
                }

                left++;
            }

            answer = max(answer, right - left + 1);
        }

        System.out.printf("%n%s - > %s", textAsAResult, answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", findLengthOfTheLongestSubStringWithOnes("1101100111"));
    }
}
