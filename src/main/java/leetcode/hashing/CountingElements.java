package main.java.leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public static int countElements(int[] arr) {
        int answer = 0;
        Set<Integer> numbers = new HashSet<>();

        for (int v : arr) {
            numbers.add(v);
        }

        for (int num : arr) {
            if (numbers.contains(num + 1)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", countElements(new int[] {1, 1, 2, 2}));
    }
}
