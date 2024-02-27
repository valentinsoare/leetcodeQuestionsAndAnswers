package main.java.leetcode.slidingwindow;

public class FindTheKBeautyOfANumber {

    public static int divisorSubstrings(int num, int k) {
        String numberToCheck = "";
        int valueOfKBeauty = 0, numberToUse = 1;

        String numberAsString = String.valueOf(num);

        for (int i = k; i <= numberAsString.length(); i++) {
            numberToCheck = numberAsString.substring(i - k, i);

            numberToUse = Integer.parseInt(numberToCheck);
            if (numberToUse != 0 && num % numberToUse == 0) {
                valueOfKBeauty++;
            }
        }

        return valueOfKBeauty;
    }

    public static void main(String[] args) {
        System.out.printf("%s", divisorSubstrings(240, 2));
    }
}
