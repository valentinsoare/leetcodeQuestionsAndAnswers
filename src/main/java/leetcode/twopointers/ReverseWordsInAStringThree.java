package main.java.leetcode.twopointers;

public class ReverseWordsInAStringThree {

    public static String reverseStr(String word) {
        StringBuilder s = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            s.append(word.charAt(i));
        }

        return s.toString();
    }

    public static String reverseWords(String s) {
        StringBuilder n = new StringBuilder();

        for (String w : s.split(" ")) {
            n.append(reverseStr(w)).append(" ");
        }

        return n.toString().trim();
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", reverseWords("Let's take LeetCode contest"));
    }
}
