package main.java.leetcode;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {
    public static int arithmeticTriplets(int[] nums, int diff) {
        int numberOfTriplets = 0;

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num - diff) && seen.contains(num - diff * 2)) {
                numberOfTriplets++;
            }
            seen.add(num);
        }

        return numberOfTriplets;
    }

    public static void main(String[] args) {
        int[] newArr = new int[] {0, 1, 4, 6, 7, 10};

        System.out.printf("%n%s", arithmeticTriplets(newArr, 3));
    }
}
