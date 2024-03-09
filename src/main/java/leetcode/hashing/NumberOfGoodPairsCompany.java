package main.java.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairsCompany {
    public static int numIdenticalPairs(int[] nums) {
        int howManyPairs = 0;
        Map<Integer, Integer> counting = new HashMap<>();

        for (int num : nums) {
            counting.merge(num, 1, (e, f) -> e + 1);
        }

        for (Map.Entry<Integer, Integer> e : counting.entrySet()) {
            howManyPairs += (e.getValue() * (e.getValue() - 1)) / 2;
        }

       return howManyPairs;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[] {1, 2, 3}));
    }
}
