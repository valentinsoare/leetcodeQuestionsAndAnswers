package main.java.leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int reversedNumber = 0, digit;
        int temp = x;

        while (x != 0) {
            digit = x % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            x /= 10;
        }

        return reversedNumber == temp;

//        StringBuilder toUseForComparison = new StringBuilder(String.valueOf(x));
//        return toUseForComparison.reverse().toString().equals(String.valueOf(x));
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", isPalindrome(121));
    }
}
