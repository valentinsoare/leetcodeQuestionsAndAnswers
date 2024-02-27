package main.java.leetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {

    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0;
        int right = nums.size() - 1;
        int sum = 0;
        int numberOfPairs = 0;

        while (left < right) {
            sum = (nums.get(left) + nums.get(right));

            if (sum < target) {
                numberOfPairs += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return numberOfPairs;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", countPairs(new ArrayList<>(Arrays.asList(-1,1,2,3,1)), 2));
    }
}
