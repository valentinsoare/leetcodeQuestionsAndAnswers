package main.java.leetcode.hashing;

import java.sql.Array;
import java.util.*;

public class DestinationCity {

    public static String destCity(List<List<String>> paths) {
        Set<String> elements = new HashSet<>();

        for (List<String> path : paths) {
            elements.add(path.get(0));
        }

        for (List<String> path : paths) {
            if (!elements.contains(path.get(1))) {
                return path.get(1);
            }
        }

        return elements.iterator().next();
    }

    public static void main(String[] args) {
        String s = destCity(new ArrayList<>(
                Arrays.asList(List.of("B", "C"),
                        List.of("D", "B"),
                        List.of("C", "A"))));

        System.out.printf("%n%s", s);
    }
}
