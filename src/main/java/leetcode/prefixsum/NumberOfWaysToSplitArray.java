package main.java.leetcode.prefixsum;

public class NumberOfWaysToSplitArray {
    public static int waysToSplitArray(int[] nums) {
        long[] prefixSum = new long[nums.length];

        prefixSum[0] = nums[0];
        int numberOfWaysToSplit = 0;

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }

        long leftSection = 0, rightSection = 0;
        for (int j = 0; j < prefixSum.length - 1; j++) {
            leftSection = prefixSum[j];
            rightSection = prefixSum[prefixSum.length - 1] - prefixSum[j];

            if (leftSection >= rightSection) {
                numberOfWaysToSplit++;
            }
        }

        return numberOfWaysToSplit;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", waysToSplitArray(new int[] {10, 4, -8, 7}));
    }
}
