package main.java.leetcode.string;


public class LengthOfLastWordCompany {
    public static int lengthOfLastWord(String s) {
//        List<String> toReturn = Arrays.asList(s.trim().split(" "));
//        return toReturn.get(toReturn.size() - 1).length();

        String[] toReturn = s.split(" ");
        return toReturn[toReturn.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", lengthOfLastWord("Hello World"));
    }

}
