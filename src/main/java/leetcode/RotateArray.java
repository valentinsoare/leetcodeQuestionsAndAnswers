package main.java.leetcode;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateFirstVersion(int[] nums, int k) {
        int lengthOfArray = nums.length;
        int[] resultArr = nums;
        nums = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            nums[(i + k) % lengthOfArray] = resultArr[i];
        }

        return nums;
    }

    public static void reverse(int nums[], int i, int j) {
        int li = i;
        int ri = j;

        while(li < ri) {
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;

            li++;
            ri--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        if (k < 0) {
            k += nums.length;
        }

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        System.out.printf("%s%n", Arrays.toString(rotateFirstVersion(new int[] {1, 2, 3, 4, 5, 6, 7}, 3)));
    }
}
