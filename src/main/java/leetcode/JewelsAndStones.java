package main.java.leetcode;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        int countJewels = 0;
        char[] elements = stones.toCharArray();

        for (char element : elements) {
            if (jewels.contains(String.valueOf(element))) {
                countJewels += 1;
            }
        }

        return countJewels;
    }


    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}
