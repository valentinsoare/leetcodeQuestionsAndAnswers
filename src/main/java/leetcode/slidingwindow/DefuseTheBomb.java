package main.java.leetcode.slidingwindow;

import java.util.Arrays;

public class DefuseTheBomb {

    public static int[] decrypt(int[] code, int k) {
        int[] defuseCode = new int[code.length];

        if (k == 0) return defuseCode;

        int sum = 0;
        int left = 1;
        int right = k;


        if (k < 0) {
            k = Math.abs(k);
            left = code.length - k;
            right = code.length - 1;
        }

        for (int i = left; i <= right; i++) {
            sum += code[i];
        }

        for (int j = 0; j < code.length; j++) {
            defuseCode[j] = sum;
            sum -= code[(left++) % code.length];
            sum += code[(++right) % code.length];
        }

        return defuseCode;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", Arrays.toString(decrypt(new int[]{2, 4, 9, 3}, -2)));
    }
}
