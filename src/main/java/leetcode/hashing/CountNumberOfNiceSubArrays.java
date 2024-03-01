package main.java.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfNiceSubArrays {

    public static int numberOfSubArrays(int[] nums, int k) {
        int currentSum = 0, answer = 0;
        Map<Integer, Integer> counting = new HashMap<>();
        counting.put(0, 1);

        for (int num : nums) {
            currentSum += num % 2;

            answer += counting.getOrDefault(currentSum - k, 0);
            counting.put(currentSum, counting.getOrDefault(currentSum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", numberOfSubArrays(new int[] {2, 4, 6}, 3));
    }
}
