package main.java.leetcode;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static int maxProductDifference(int[] nums) {
        List<Integer> working = Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new));

        int lastElements = working.size();
        Collections.sort(working);

        return (((working.get(lastElements - 1)) * (working.get(lastElements - 2))) - (working.get(0) * working.get(1)));
    }

    public static void main(String[] args) {
        int[] nums = new int[] {4, 2, 5, 9, 7, 4, 8};
        System.out.println(maxProductDifference(nums));
    }
}
