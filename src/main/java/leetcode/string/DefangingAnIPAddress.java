package main.java.leetcode.string;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class DefangingAnIPAddress {
    public static String defangIPaddr(String address) {
        List<String> elements = new ArrayList<>(Arrays.asList(address.split("\\.")));
        StringBuilder valueToReturn = new StringBuilder();

        for (int i = 0; i < elements.size(); i++) {
            if (i != elements.size() - 1) {
                valueToReturn.append(elements.get(i)).append("[.]");
            } else {
                valueToReturn.append(elements.get(i));
            }
        }

        return valueToReturn.toString();
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", defangIPaddr("198.187.1.1"));
    }

}
