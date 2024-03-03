package main.java.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class MinimumConsecutiveCardsToPickUp {

    //Sliding Window with HashMap
    public static int minimumCardPickup(int[] cards) {
        int card = 0, answer = Integer.MAX_VALUE;
        Map<Integer, Integer> existentCards = new HashMap<>();

        for (int right = 0; right < cards.length; right++) {
            card = cards[right];

            if (existentCards.containsKey(card)) {
                answer = Math.min(answer, right - existentCards.get(card) + 1);
            }

            existentCards.put(card, right);
        }

        return (answer == Integer.MAX_VALUE) ? -1 : answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", minimumCardPickup(new int[]{3, 4, 2, 3, 4, 7}));
    }
}
