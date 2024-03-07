package main.java.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindLuckyIntegerInAnArray {

    public static int findLucky(int[] arr) {
        int answer = Integer.MIN_VALUE;
        Map<Integer, Integer> numbersFreq = new HashMap<>();

        for (int j : arr) {
            numbersFreq.merge(j, 1, (e, f) -> e + 1);
        }

        for (Map.Entry<Integer, Integer> e : numbersFreq.entrySet()) {
            if (Objects.equals(e.getKey(), e.getValue())) {
                answer = Math.max(answer, e.getKey());
            }
        }

        return answer == Integer.MIN_VALUE ? -1 : answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", findLucky(new int[] {13,16,7,3,14,4,12,19,6,6,7,16,17,17}));
    }
}
