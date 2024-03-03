package main.java.leetcode.hashing;

import java.util.Arrays;

public class MaximumOddBinaryNumber {

    public static String maximumOddBinaryNumber(String s) {
        int count_of_zeroes = 0;
        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                arr[i] = s.charAt(i);
                count_of_zeroes++;
            } else {
                arr[i - count_of_zeroes] = '1';
            }
        }

        if ((s.length() == 1) || (count_of_zeroes == 0)) {
            return s;
        }

        if (s.length() <= 3) {
            arr[count_of_zeroes - 2] = '0';
        } else {
            arr[count_of_zeroes - 1] = '0';
        }

        arr[s.length() - 1] = '1';

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", maximumOddBinaryNumber("010"));
    }
}
