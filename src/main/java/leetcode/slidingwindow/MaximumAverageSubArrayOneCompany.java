package main.java.leetcode.slidingwindow;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.max;

public class MaximumAverageSubArrayOneCompany {
    public static double findMaxAverage(int[] nums, int k) {
        if (k == 1 && nums.length == 1) {
            return nums[0];
        }

        List<Integer> toWorkWith = Arrays.stream(nums).boxed().toList();

        double sumOfElements = toWorkWith.subList(0, k)
                .stream()
                .mapToInt(e -> e)
                .sum();

        double answer = sumOfElements / k;

        for (int i = k; i < nums.length; i++) {
            sumOfElements += nums[i] - nums[i - k];
            answer = max(answer, sumOfElements / k);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }
}
