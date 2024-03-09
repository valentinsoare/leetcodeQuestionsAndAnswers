package main.java.leetcode.hashing;

import java.util.*;

public class MajorityElementCompany {
    public static int majorityElement(int[] nums) {
        int[] toCount = new int[20];

        for (int num : nums) {
            toCount[num] = ++toCount[num];
        }

        int max = Arrays.stream(toCount).max().getAsInt();

        for (int i = 0; i < toCount.length; i++) {
            if (toCount[i] == max) {
                return i;
            }
        }

        return 0;
    }

    public static int majorityElementV2(int[] nums) {
        Map<Integer, Integer> toCount = new HashMap<>();

        for (int num : nums) {
            if (toCount.containsKey(num)) {
                toCount.put(num, toCount.get(num) + 1);
            } else {
                toCount.put(num, 1);
            }
        }

        TreeSet<Integer> sorting = new TreeSet<>(toCount.values());
        int mostFreq = sorting.last();

        for (Map.Entry<Integer, Integer> toUse : toCount.entrySet()) {
            if (toUse.getValue() == mostFreq) {
                return toUse.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", majorityElement(new int[] {2,2,1,1,1,2,2}));
        majorityElementV2(new int[] {2,2,1,1,1,2,2});
    }
}
