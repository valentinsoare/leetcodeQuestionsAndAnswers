package main.java.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateTwo {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Integer elementIndex = 0;
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            elementIndex = numbers.put(nums[i], i);

            if (elementIndex != null && i - elementIndex <= k) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }
}
