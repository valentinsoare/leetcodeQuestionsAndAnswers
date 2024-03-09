package main.java.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class BinarySubArraysWithSumCompany {
    public static int numSubArraysWithSum(int[] nums, int goal) {
        int sum = 0, answer = 0, left = 0, right = 0;

        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(sum, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (prefixSum.containsKey(sum - goal)) {
                answer += prefixSum.get(sum - goal);
            }

            prefixSum.merge(sum, 1, (e, f) -> e + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", numSubArraysWithSum(new int[] {1,0,1,0,1}, 2));
    }
}
