package main.java.leetcode.hashing;

import java.util.*;

public class FindPlayersWithZeroOrOneLosses {

    public static List<List<Integer>> findWinners(int[][] matches) {

        NavigableMap<Integer, Integer> countingLost = new TreeMap<>();
        List<List<Integer>> answers =
            new ArrayList<>(Arrays.asList(new ArrayList<>(), new ArrayList<>()));

        int lost = 0, win = 0;

        for (int[] elements : matches) {
            win = elements[0];
            countingLost.putIfAbsent(win, 0);

            lost = elements[1];
            countingLost.put(lost, countingLost.getOrDefault(lost, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> v : countingLost.entrySet()) {
            if (v.getValue() == 0) {
                answers.get(0).add(v.getKey());
            } else if (v.getValue() == 1) {
                answers.get(1).add(v.getKey());
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        List<List<Integer>> winners = findWinners(new int[][]
                {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}}
        );

        System.out.printf("%n%s", winners);
    }
}
