package main.java.leetcode.twopointers;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
//        int tempValue = 0, numberOfZeroes = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                numberOfZeroes++;
//            } else {
//                tempValue = nums[i];
//                nums[i - numberOfZeroes] = tempValue;
//                nums[i] = 0;
//            }
//        }
        //----------------------------------------------------------

        int j = 0, tempValue = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && nums[j] == 0) {
                tempValue = nums[i];
                nums[i] = nums[j];
                nums[j] = tempValue;
            }

            if (nums[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] givenArray = new int[] {0, 1, 0, 3, 12};
        moveZeroes(givenArray);
        System.out.printf("%n%s", Arrays.toString(givenArray));
    }
}
