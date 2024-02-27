package main.java.leetcode;

import java.util.*;

public class ExtractDuplicatesFromArray {
    public static void main(String[] args) {
        Set<Integer> uniq = new LinkedHashSet<>(), duplicates = new LinkedHashSet<>();
        List<Integer> input = new ArrayList<>(
                Arrays.asList(2, 3, 4,1, 2, 9, 1, 3, 2, 9)
        );

        for (Integer e : input) {
            if (!uniq.contains(e)) {
                uniq.add(e);
            } else {
                duplicates.add(e);
            }
        }

        System.out.printf("%n%s%n%s", uniq, duplicates);
    }
}
