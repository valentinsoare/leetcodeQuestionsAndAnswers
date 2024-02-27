package main.java.leetcode;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        if (nums[nums.length - 1] != nums[k]) {
            nums[k] = nums[nums.length - 1];
        }

        return k + 1;
    }

    public static int removeDuplicatesV2(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});

    }
}
