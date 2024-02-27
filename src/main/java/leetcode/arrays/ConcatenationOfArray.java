package main.java.leetcode.arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] concatenateArray(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }

        System.out.println(Arrays.toString(ans));

        return ans;
    }

    public static void main(String[] args) {
        concatenateArray(new int[]{1, 2, 1});
    }
}
