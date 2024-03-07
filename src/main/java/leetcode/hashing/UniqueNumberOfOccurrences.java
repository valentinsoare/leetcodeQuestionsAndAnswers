package main.java.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int j : arr) {
            numbers.merge(j, 1, (e, f) -> e + 1);
        }

        int numberToCheck = 0;
        for (int i : arr) {
            if (numbers.containsKey(i)) {
                numberToCheck = numbers.get(i);
            }

            numbers.remove(i);

            if (numbers.containsValue(numberToCheck)) {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", uniqueOccurrences(new int[] {0,0,-2,-1,4,8,-3,9,6}));
    }
}
