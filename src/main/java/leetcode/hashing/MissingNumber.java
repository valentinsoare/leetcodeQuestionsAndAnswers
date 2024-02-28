package main.java.leetcode.hashing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int givenSum = 0, requiredSum = 0;

        requiredSum = n * (n + 1)/2;

        for (int num : nums) {
            givenSum += num;
        }

        return requiredSum - givenSum;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", missingNumber(new int[] {0, 2}));
    }
}
