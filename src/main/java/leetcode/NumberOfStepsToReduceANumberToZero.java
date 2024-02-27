package main.java.leetcode;

public class NumberOfStepsToReduceANumberToZero {
    public static int numberOfSteps(int num) {
        int numberOfSteps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num -= 1;
            }

            numberOfSteps++;
        }

        return numberOfSteps;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", numberOfSteps(14));
    }
}
