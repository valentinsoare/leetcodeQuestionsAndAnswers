package main.java.leetcode.hashing;

import java.util.*;

public class SumOfUniqueElements {
    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int num : nums) {
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : numbers.entrySet()) {
            if (e.getValue() == 1) {
                sum += e.getKey();
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", sumOfUnique(new int[] {1,2,3,2}));
    }
}
