package main.java.leetcode.arrays;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answers = new int[nums.length];
        int howManyNumbers;

        for (int i = 0; i < answers.length; i++) {
            howManyNumbers = 0;

            for (int num : nums) {
                if (num < nums[i]) {
                    howManyNumbers += 1;
                }
            }

            answers[i] = howManyNumbers;
        }

        return answers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }
}
