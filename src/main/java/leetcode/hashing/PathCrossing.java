package main.java.leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public static boolean isPathCrossing(String path) {
        Set<String> visitedPoints = new HashSet<>();
        visitedPoints.add("0, 0");
        int x = 0, y = 0;
        String point = "";

        for (char p : path.toCharArray()) {
            if (p == 'N') {
                y++;
            } else if (p == 'E') {
                x++;
            } else if (p == 'W') {
                x--;
            } else if (p == 'S') {
                y--;
            }

            point = String.format("%s, %s", x, y);

            if (visitedPoints.contains(point)) {
                return true;
            }

            visitedPoints.add(point);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", isPathCrossing("NS"));
    }
}
