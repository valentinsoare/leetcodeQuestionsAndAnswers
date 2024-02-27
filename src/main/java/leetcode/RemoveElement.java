package main.java.leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int countDiff = 0;
        int whereToPut = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[whereToPut++] = nums[i];
                countDiff++;
            }
        }

        return countDiff;
    }

    public static void main(String[] args) {
        removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }
}
