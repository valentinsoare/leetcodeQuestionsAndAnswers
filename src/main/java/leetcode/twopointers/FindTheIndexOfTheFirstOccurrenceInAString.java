package main.java.leetcode.twopointers;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", strStr("aiurea", "ure"));
    }
}
