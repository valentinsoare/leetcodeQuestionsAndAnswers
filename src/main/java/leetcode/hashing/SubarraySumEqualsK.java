package main.java.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        int answer = 0, currentSum = 0;

        Map<Integer, Integer> counting = new HashMap<>();
        counting.put(0, 1);

        for (int num : nums) {
            currentSum += num;

            if (counting.get(currentSum - k) != null) {
                answer += counting.get(currentSum - k);
            }

            counting.put(currentSum, counting.getOrDefault(currentSum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", subarraySum(new int[] {1, 3, 4, 6, 7}, 3));
    }
}
