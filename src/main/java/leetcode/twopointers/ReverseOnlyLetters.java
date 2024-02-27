package main.java.leetcode.twopointers;

public class ReverseOnlyLetters {

    public static String reverseOnlyLetters(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String is not valid!");
        }

        int left = 0, right = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while (left < right) {
            if (!Character.isLetter(s.charAt(left))) {
                left++;
            } else if (!Character.isLetter(s.charAt(right))) {
                right--;
            } else {
                sb.setCharAt(left, s.charAt(right));
                sb.setCharAt(right--, s.charAt(left++));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
