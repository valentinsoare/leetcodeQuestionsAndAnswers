package main.java.leetcode.twopointers;

import java.util.HashMap;
import java.util.Map;

public class MaximumErasureValue {

    public static int maximumUniqueSubarray(int[] nums) {
        int left = 0, answer = Integer.MIN_VALUE, sum = 0;
        Map<Integer, Integer> countingElements = new HashMap<>();

        for (int num : nums) {
            sum += num;

            countingElements.merge(num, 1, (e, f) -> e + 1);

            while (countingElements.get(num) > 1) {
                countingElements.put(nums[left], countingElements.getOrDefault(nums[left], 0) - 1);
                sum -= nums[left];
                left++;
            }

            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", maximumUniqueSubarray(new int[] {4, 2, 4, 5, 6}));
    }
}
