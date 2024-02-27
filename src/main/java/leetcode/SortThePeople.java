package main.java.leetcode;

import java.util.*;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> mappedValues = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            mappedValues.put(heights[i], names[i]);
        }

        LinkedList<Map.Entry<Integer, String>> sortedNamesByHeight = new LinkedList<>(mappedValues.entrySet());
        sortedNamesByHeight.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));

        String[] valueToReturn = new String[sortedNamesByHeight.size()];

        for (int j = 0; j < sortedNamesByHeight.size(); j++) {
            valueToReturn[j] = sortedNamesByHeight.get(j).getValue();
        }

        return valueToReturn;
    }

    public static void main(String[] args) {
        String[] names = new String[] {"Alice","Bob","Bob"};
        int[] heights = new int[] {155,185,150};

        sortPeople(names, heights);
    }
}
