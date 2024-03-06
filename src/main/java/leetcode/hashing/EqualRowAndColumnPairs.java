package main.java.leetcode.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {

    public static int equalPairs(int[][] grid) {
        String key = "";
        int answer = 0;
        Map<String, Integer> rows = new HashMap<>();
        Map<String, Integer> columns = new HashMap<>();

        for (int[] row : grid) {
            key = Arrays.toString(row);
            rows.put(key, rows.getOrDefault(key, 0) + 1);
        }

        for (int col = 0; col < grid[0].length; col++) {
            int[] colUsed = new int[grid.length];

            for (int row = 0; row < grid.length; row++) {
                colUsed[row] = grid[row][col];
            }

            key = Arrays.toString(colUsed);
            columns.put(key, columns.getOrDefault(key, 0) + 1);
        }

        for (String e : rows.keySet()) {
            answer += rows.get(e) * columns.getOrDefault(e, 0);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", equalPairs(new int[][] {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
    }
}
