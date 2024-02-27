package main.java.leetcode;

import java.util.Arrays;

public class MaximumSubarray {
    public static int maxSubArrayWIthNumberOfElementsMentionedInSubArray(int[] nums) {
        //brute force approach

        int max = Integer.MIN_VALUE;
        int k = 4;
        int sum;

        for (int i = 0; i < nums.length - k + 1; i++) {
            sum = 0;

            for (int j = 0; j < k; j++) {
                sum += nums[i + j];
            }

            max = Math.max(max, sum);
        }

        return max;
    }

    public static int maxSubArraySlidingWindow(int[] nums, int k) {
        if (k > nums.length) {
            return -1;
        }

        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        int windowSum = maxSum;

        for (int j = k; j < nums.length; j++) {
            windowSum += nums[j] - nums[j - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static int maxSubArrayKadaneAlgo(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;

            if (sum > maxSum) {
                maxSum = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", maxSubArrayWIthNumberOfElementsMentionedInSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.printf("%n%s", maxSubArraySlidingWindow(new int[] {-2,1,-3,4,-1,2,1,-5,4}, 4));
        System.out.printf("%n%s", maxSubArrayKadaneAlgo(new int[] {-1}));
    }
}
