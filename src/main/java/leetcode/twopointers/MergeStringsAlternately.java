package main.java.leetcode.twopointers;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        int left = 0, right = 0;
        StringBuilder newS = new StringBuilder();

        while (left < word1.length() && right < word2.length()) {
            newS.append(word1.charAt(left++)).append(word2.charAt(right++));
        }

        if (left < word1.length()) newS.append(word1.substring(left));
        if (right < word2.length()) newS.append(word2.substring(right));

        return newS.toString();
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", mergeAlternately("abc", "pqr"));
    }
}
