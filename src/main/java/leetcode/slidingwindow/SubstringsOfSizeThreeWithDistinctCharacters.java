package main.java.leetcode.slidingwindow;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static int countGoodSubstrings(String s) {
        int answer = 0;
        String elements = "";
        boolean charIsRepeating;

        for (int right = 0; right <= s.length() - 3; right++) {
            charIsRepeating = false;
            elements = s.substring(right, right + 3);

            for (int j = 0; j < (elements.length() - 1); j++) {
                int z = elements.substring(j + 1).indexOf(elements.charAt(j));

                if (z != -1) {
                    charIsRepeating = true;
                    break;
                }
            }

            if (!charIsRepeating) {
                answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.printf("%n%s", countGoodSubstrings("xyzzaz"));
    }
}
