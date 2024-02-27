package main.java.leetcode;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class SortingTheSentence {
    public static String sortSentence(String s) {
        List<String> temp = new ArrayList<>();
        StringBuilder toReturn = new StringBuilder();

        for (String element : new ArrayList<>(Arrays.asList(s.split(" +")))) {
            temp.add(element.charAt(element.length() - 1) + element.substring(0, element.length() - 1));
        }

        temp.sort(Comparator.naturalOrder());

        for (String e : temp) {
            toReturn.append(e.substring(1)).append(" ");
        }

        return toReturn.toString().trim();
    }


    public static void main(String[] args) {
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }
}
