package main.java.leetcode;

import java.util.Arrays;

public class MinimumNumberofMovestoSeatEveryone {
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int total = 0, move;

        for (int i = 0; i < seats.length; i++) {
            move = (students[i] - seats[i]);

            if (move < 0) {
                total += (move * -1);
            } else {
                total += move;
            }
        }

        return total;
    }


    public static void main(String[] args) {
        System.out.println(minMovesToSeat(new int[] {4, 1, 5, 9}, new int[] {1, 3, 2, 6}));
    }
}
