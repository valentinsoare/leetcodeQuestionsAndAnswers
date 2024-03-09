package main.java.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubarrayWithAtMostKFrequencyCompany {

    public static int maxSubarrayLength(int[] nums, int k) {
        int left = 0, answer = 0;
        Map<Integer, Integer> countingIntegers = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            countingIntegers.put(nums[right], countingIntegers.getOrDefault(nums[right],0) + 1);

            while (countingIntegers.get(nums[right]) > k) {
                countingIntegers.put(nums[left], countingIntegers.get(nums[left]) - 1);
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", maxSubarrayLength(new int[] {1, 4, 4, 3}, 1));
    }
}
