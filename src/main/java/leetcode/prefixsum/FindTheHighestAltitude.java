package main.java.leetcode.prefixsum;

public class FindTheHighestAltitude {

    public static int largestAltitude(int[] gain) {
        int value = 0, largestAlt = 0;
        int[] prefixSum = new int[gain.length + 1];
        prefixSum[1] = gain[0];

        for (int i = 2; i < gain.length + 1; i++) {
            value = gain[i - 1] + prefixSum[i - 1];
            prefixSum[i] = value;
            largestAlt = Math.max(value, largestAlt);
        }

        return largestAlt;
    }

    public static void main(String[] args) {
        largestAltitude(new int[] {-5, 1, 5, 0, -7});
    }
}
