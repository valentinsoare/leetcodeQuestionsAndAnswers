package main.java.leetcode.hashing;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        int numberOfJewels = 0;

        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) >= 0) {
                numberOfJewels++;
            }
        }

        return numberOfJewels;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", numJewelsInStones("aA", "aAAbbbb"));
    }
}
