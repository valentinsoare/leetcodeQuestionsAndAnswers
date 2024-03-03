package main.java.leetcode.hashing;

import java.util.*;

public class MaxSumOfAPairWithEqualSumOfDigits {

    private static int calculateSumOfDigits(int givenNumber) {
        int sum = 0;

        while (givenNumber > 0) {
            sum += givenNumber % 10;
            givenNumber /= 10;
        }

        return sum;
    }


    public static int maximumSum(int[] nums) {
        int sumOfDigits = 0, answer = Integer.MIN_VALUE;
        Map<Integer, Integer> registeredDigitsSum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sumOfDigits = calculateSumOfDigits(nums[i]);

            if (registeredDigitsSum.containsKey(sumOfDigits)) {
                answer = Math.max(answer, nums[i] + registeredDigitsSum.get(sumOfDigits));
            }

            registeredDigitsSum
                    .put(sumOfDigits, Math.max(registeredDigitsSum.getOrDefault(sumOfDigits, 0), nums[i]));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", maximumSum(new int[] {18,43,36,13,7}));
    }
}
