package main.java.leetcode.prefixsum;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        if (nums.length == 0) return -1;
        int leftSum = 0, rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int j = 0; j < nums.length; j++) {
            rightSum -= nums[j];

            if (leftSum == rightSum) {
                return j;
            }

            leftSum += nums[j];
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", pivotIndex(new int[] {-1,-1,-1,1,1,-1}));
    }

}
