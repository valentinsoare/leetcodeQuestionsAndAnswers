package main.java.leetcode.twopointers;

public class MinimumCommonValue {

    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0, answer = Integer.MAX_VALUE;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                answer = Math.min(answer, nums1[i]);
                i++; j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", getCommon(
                new int[] {1, 2, 3},
                new int[] {2, 4}
        ));
    }
}
