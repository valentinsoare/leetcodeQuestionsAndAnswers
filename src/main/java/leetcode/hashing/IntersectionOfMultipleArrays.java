package main.java.leetcode.hashing;

import java.util.*;

public class IntersectionOfMultipleArrays {

    public static List<Integer> intersection(int[][] nums) {
        List<Integer> valuesGiven = Arrays.stream(nums)
                .flatMapToInt(Arrays::stream).boxed().toList();
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> numbers = new HashMap<>();

        for (Integer element : valuesGiven) {
            numbers.put(element, numbers.getOrDefault(element, 0) + 1);

            if (numbers.get(element) == nums.length) {
                result.add(element);
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", intersection(new int[][] {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}}));
    }
}
