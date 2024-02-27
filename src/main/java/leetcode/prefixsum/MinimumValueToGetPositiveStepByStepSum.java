package main.java.leetcode.prefixsum;

public class MinimumValueToGetPositiveStepByStepSum {
    public static int minStartValue(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int startValue = 1;
        boolean withSuccess;
        int theSum = 1;

        for (int j = startValue; j < Integer.MAX_VALUE; j++) {
            withSuccess = true;
            theSum = j + nums[0];

            if (theSum < 1) {
                theSum = 1;
                continue;
            }

            prefixSum[0] = theSum;

            for (int i = 1; i < nums.length; i++) {
                theSum = prefixSum[i - 1] + nums[i];

                if (theSum < 1) {
                    withSuccess = false;
                    break;
                }

                prefixSum[i] = theSum;
            }

            if (withSuccess) {
                startValue = j;
                break;
            }
        }

        return startValue;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", minStartValue(new int[]{-3, 2, -3, 4, 2}));
    }
}
