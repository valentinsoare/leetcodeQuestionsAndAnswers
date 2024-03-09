package main.java.leetcode.twopointers;


public class LexicographicallySmallestPalindrome {
    public static String makeSmallestPalindrome(String s) {
       int i = 0;
       int indexRight;
       char[] arrayToWorkWith = s.toCharArray();

       while (i < arrayToWorkWith.length / 2) {
           indexRight = s.length() - 1 - i;

           if (arrayToWorkWith[i] > arrayToWorkWith[indexRight]) {
               arrayToWorkWith[i] = arrayToWorkWith[indexRight];
           } else {
               arrayToWorkWith[indexRight] = arrayToWorkWith[i];
           }

           i++;
       }

       return String.valueOf(arrayToWorkWith);
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", makeSmallestPalindrome("egcfe"));
    }
}
