package main.java.leetcode.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class LargestUniqueNumber {

    public static int largestUniqueNumber(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> counting = new HashMap<>();

        for (int num : nums) {
            counting.put(num, counting.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : counting.entrySet()) {
            if (e.getValue() <= 1) {
                answer = Math.max(answer, e.getKey());
            }
        }

        return (answer != 0) ? answer : -1;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", largestUniqueNumber(new int[]{5,7,3,9,4,9,8,3,1}));
    }
}
