package main.java.leetcode.slidingwindow;

public class FIndOutTheNumberOfSubArraysWithGivenProduct {
    public static int numberOfSubArraysWithGivenProduct(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0, product = 1, answer = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            answer += right - left + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", numberOfSubArraysWithGivenProduct(new int[] {10, 5, 2, 6}, 100));
    }
}
