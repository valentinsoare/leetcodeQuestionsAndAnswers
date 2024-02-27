package main.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinimumSumOfFourDigitNumberAfterSPplittingDigits {
    public static int minimumSum(int num) {
        String valueToWorkWith = String.valueOf(num);
        List<String> digits = new ArrayList<>(Arrays.asList(valueToWorkWith.split("")));

        digits.sort(Comparator.naturalOrder());

        StringBuilder firstNumber = new StringBuilder();
        firstNumber.append(digits.get(0)).append(digits.get(2));

        StringBuilder secondNumber = new StringBuilder();
        secondNumber.append(digits.get(1)).append(digits.get(3));

        return Integer.parseInt(firstNumber.toString()) + Integer.parseInt(secondNumber.toString());
    }

    public static void main(String[] args) {
        System.out.println(minimumSum(4009));
    }
}
