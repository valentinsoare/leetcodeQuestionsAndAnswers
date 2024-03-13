package main.java.leetcode.twopointers;

import java.util.Arrays;

public class FlippingAnImageCompany {

    public static int[][] flipAndInvertImage(int[][] image) {
        int left = 0, right = 0, tempValue = 0;

        for (int i = 0; i < image.length; i++) {
            left = 0; right = image[i].length - 1;

            while (left < right) {
                tempValue = image[i][left];

                image[i][left] = image[i][right];
                image[i][right] = tempValue;

                left++;right--;
            }
        }

        int row, column = 0;
        for (int i = 0; i < Math.pow(image.length, 2); i++) {
            row = i / image.length;
            column = i % image.length;

            if (image[row][column] == 0) {
                image[row][column] = 1;
            } else {
                image[row][column] = 0;
            }
        }

        return image;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s",
                Arrays.deepToString(flipAndInvertImage(new int[][] {{1,1,0},{1,0,1},{0,0,0}})));
    }
}
