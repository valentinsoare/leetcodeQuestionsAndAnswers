package main.java.leetcode.arrays;

import java.util.Arrays;

public class ATypeOfShuffle {
    public static int[] shuffleTheArray(int[] nums, int n) {
        int[] shuffledArray = new int[nums.length];
        int j = 0;

        for (int i = 0; i < shuffledArray.length - 1; i += 2) {
            shuffledArray[i] = nums[j++];
            shuffledArray[i + 1] = nums[n++];
        }

        return shuffledArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffleTheArray(new int[] {1, 2, 3, 4, 4, 3, 2, 1}, 4)));
    }
}
