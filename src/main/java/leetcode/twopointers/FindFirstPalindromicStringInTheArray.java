package main.java.leetcode.twopointers;

public class FindFirstPalindromicStringInTheArray {
    public static boolean isPalindrome(String word) {
        int k = 0, j = word.length() - 1;

        while (k < j) {
            if (word.charAt(k++) != word.charAt(j--)) {
                return false;
            }
        }

        return true;
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
    }
}
