package main.java.leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> toUse = new HashSet<>();

        for (int num : nums) {
            if (toUse.contains(num)) {
                return true;
            }

            toUse.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.printf("%s", containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }
}
