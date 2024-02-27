package main.java.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildArrayFromPermutation {
    public static int[] createArrayFromPermutation(List<Integer> numbersToWorkWith) {
        int[] fromPerm = new int[numbersToWorkWith.size()];
        int tempIndex;

        for (int i = 0; i < numbersToWorkWith.size(); i++) {
            tempIndex = numbersToWorkWith.get(i);

            if ((tempIndex >= 0) && (tempIndex < numbersToWorkWith.size())) {
                fromPerm[i] = numbersToWorkWith.get(tempIndex);
            }
        }

        return fromPerm;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayFromPermutation(new ArrayList<>(Arrays.asList(0, 2, 1, 5, 3, 4)))));
    }
}