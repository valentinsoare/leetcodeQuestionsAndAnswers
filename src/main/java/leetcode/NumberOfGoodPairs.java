package main.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int numberOfGoodPars = 0;
        List<int[]> goodPairs = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    goodPairs.add(new int[] {i, j});
                    numberOfGoodPars += 1;
                }
            }
        }

//        int[] count = new int[101];
//
//        for (int a : nums) {
//            numberOfGoodPars += count[a]++;
//        }

        return numberOfGoodPars;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3}));
    }
}
