package main.java.leetcode.slidingwindow;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int minimalLengthAsAnAnswer = Integer.MAX_VALUE;
        int left = 0, sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minimalLengthAsAnAnswer = Math.min(minimalLengthAsAnAnswer, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minimalLengthAsAnAnswer == Integer.MAX_VALUE ? 0 : minimalLengthAsAnAnswer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s",  minSubArrayLen(7, new int[] {2, 3, 1, 2, 4, 3}));
    }
}
