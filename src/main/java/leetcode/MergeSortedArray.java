package main.java.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] outputArray = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                outputArray[k] = nums1[i];
                i++;
            } else if (nums2[j] < nums1[i]) {
                outputArray[k] = nums2[j];
                j++;
            } else if (nums1[i] == nums2[j]) {
                outputArray[k] = nums1[i];
                outputArray[++k] = nums2[j];
                i++;
                j++;
            }

            k++;
        }

        while (i < m) {
            outputArray[k++] = nums1[i++];
        }

        while (j < n) {
            outputArray[k++] = nums2[j++];
        }

        System.out.printf("%n%s", Arrays.toString(outputArray));
    }

    public static void mergeV2(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] toUse1 = Arrays.copyOfRange(nums1, 0, nums1.length);

        while (i < m && j < n) {
            if (toUse1[i] < nums2[j]) {
                nums1[k] = toUse1[i++];
            } else if (nums2[j] < toUse1[i]) {
                nums1[k] = nums2[j++];
            } else if (toUse1[i] == nums2[j]) {
                nums1[k] = toUse1[i++];
                nums1[++k] = nums2[j++];
            }

            k++;
        }

        while (i < m) {
            nums1[k++] = toUse1[i++];
        }

        while (j < n) {
            nums1[k++] = nums2[j++];
        }
    }

    public static void mergeV3(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        mergeV2(new int[] {1, 2,3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3);
    }
}
