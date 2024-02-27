package main.java.leetcode;

import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int preSum = 0;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            result[i] = preSum;
        }

        System.out.printf("%n%s", Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        runningSum(new int[] {1, 2, 3, 4});
        runningSum(new int[] {1, 1, 1, 1, 1});
    }
}
