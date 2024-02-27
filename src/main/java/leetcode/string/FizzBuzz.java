package main.java.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> toReturn = new ArrayList<>();
        StringBuilder element;

        for (int i = 1; i <= n; i++) {
            element = new StringBuilder();

            if (i % 3 == 0) {
                element.append("Fizz");
            }

            if (i % 5 == 0) {
                element.append("Buzz");
            }

            if (element.isEmpty()) {
                element.append(i);
            }

            toReturn.add(String.valueOf(element));
        }

        return toReturn;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", fizzBuzz(15));
    }
}
