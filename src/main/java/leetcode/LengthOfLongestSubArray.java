package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

public class LengthOfLongestSubArray {
    public static int findLengthForLongestSubArray(List<Integer> elements, int k) {
        int left = 0, right = 0, currentSum = 0, answer = 0;
        List<Integer> arrayAsAResult = new ArrayList<>();

        for (; right < elements.size(); right++) {
            if (currentSum <= k && elements.subList(left, right).size() > arrayAsAResult.size()) {
                arrayAsAResult = elements.subList(left, right);
            }

            currentSum += elements.get(right);

            while (currentSum > k) {
                currentSum -= elements.get(left);
                left++;
            }

            answer = max(answer, right - left + 1);
        }

        System.out.printf("%n%s", arrayAsAResult);
        return answer;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", findLengthForLongestSubArray(
                List.of(3, 1, 2, 7, 4, 2, 1, 1, 5), 8));
    }
}
