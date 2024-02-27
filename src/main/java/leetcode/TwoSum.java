package main.java.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> toUse = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];

            if (toUse.containsKey(c)) {
                return new int[] {toUse.get(c), i};
            }

            toUse.putIfAbsent(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", Arrays.toString(twoSum(new int[] {4, 5, 6, 8, 2}, 13)));
    }
}
