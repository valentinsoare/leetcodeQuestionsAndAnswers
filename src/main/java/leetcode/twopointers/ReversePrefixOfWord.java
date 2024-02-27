package main.java.leetcode.twopointers;

public class ReversePrefixOfWord {

    public static String reversePrefix(String word, char ch) {
        char temp;
        int startReverse = 0;
        int endOfReverse = word.indexOf(ch);
        char[] letters = word.toCharArray();

        while (startReverse < endOfReverse) {
            temp = letters[startReverse];
            letters[startReverse] = letters[endOfReverse];
            letters[endOfReverse] = temp;

            startReverse++;
            endOfReverse--;
        }

        return new String(letters);
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", reversePrefix("abcdefd", 'd'));
    }

}
