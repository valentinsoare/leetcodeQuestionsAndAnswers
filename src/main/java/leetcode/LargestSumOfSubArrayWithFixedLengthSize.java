package main.java.leetcode;

public class LargestSumOfSubArrayWithFixedLengthSize {
    public static int findLargestSumOfSubArrayWithFixedLengthSize(int[] nums, int k) {
        int calcSum = 0, answer = calcSum;

        for (int i = 0; i < k; i++) {
            calcSum += nums[i];
        }

        for (int i = k; i < nums.length; i++) {
            calcSum += nums[i] - nums[i - k];
            answer = Math.max(answer, calcSum);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", findLargestSumOfSubArrayWithFixedLengthSize(new int[]{3, -1, 4, 12, -8, 5, 6}, 4));
    }
}
