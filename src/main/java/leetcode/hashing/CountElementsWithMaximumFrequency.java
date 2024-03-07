package main.java.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {

    public static int maxFrequencyElements(int[] nums) {
        int maxFreq = Integer.MIN_VALUE, answer = 0;
        Map<Integer, Integer> numberFreq = new HashMap<>();

        for (int num : nums) {
            numberFreq.put(num, numberFreq.getOrDefault(num, 0) + 1);
            maxFreq = Math.max(maxFreq, numberFreq.get(num));
        }

        for (Map.Entry<Integer, Integer> e : numberFreq.entrySet()) {
            if (e.getValue() == maxFreq) {
                answer += maxFreq;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", maxFrequencyElements(new int[] {1,2,2,3,1,4}));
    }
}
