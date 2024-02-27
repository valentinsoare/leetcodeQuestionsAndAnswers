package main.java.leetcode;

import java.util.Arrays;

public class ReverseAString {
    public static void reverseString(char[] s) {
        char temp = 0;

        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }

        System.out.printf("%n%s", Arrays.toString(s));
    }

    public static void main(String[] args) {
        reverseString(new char[] {'H','a','n','n','a','h'});
    }
}
