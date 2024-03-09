package main.java.leetcode.prefixsum;

public class MaxConsecutiveOnesThreeCompany {
    public static int longestOnes(int[] nums, int k) {
        int left = 0, numberOfZeroes = 0, answer = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                numberOfZeroes++;
            }

            while (numberOfZeroes > k) {
                if (nums[left] == 0) {
                    numberOfZeroes--;
                }

                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", longestOnes(
                new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2
        ));
    }
}
