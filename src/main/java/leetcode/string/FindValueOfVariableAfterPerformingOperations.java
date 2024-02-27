package main.java.leetcode.string;

public class FindValueOfVariableAfterPerformingOperations {
    public static int findValueAfterOperations(String[] operations) {
        int valueToReturn = 0;

        for (String element : operations) {
            if (element.contains("++")) {
                valueToReturn += 1;
            } else if (element.contains("--")) {
                valueToReturn -= 1;
            }
        }

        return valueToReturn;
    }

    public static void main(String[] args) {
        findValueAfterOperations(new String[] {"++X","++X","X++"});
    }
}
