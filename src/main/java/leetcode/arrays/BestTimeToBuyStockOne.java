package main.java.leetcode.arrays;

public class BestTimeToBuyStockOne {
    public static int maxProfit(int[] prices) {
        int max = 0, min = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < min) {
                min = price;
            }

            max = Math.max(max, price - min);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", maxProfit(new int[]{7,6,4,2,5, 3}));
    }
}
