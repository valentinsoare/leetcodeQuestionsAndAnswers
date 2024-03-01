package main.java.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public static int findMaxLength(int[] nums) {
        int count = 0, answer = 0;
        Map<Integer, Integer> elements = new HashMap<>();
        elements.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count += 1;
            } else {
                count += (-1);
            }

            if (elements.containsKey(count)) {
                answer = Math.max(answer, i - elements.get(count));
            } else {
                elements.put(count, i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", findMaxLength(new int[] {1, 0, 1}));
    }
}
