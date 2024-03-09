package main.java.leetcode.arrays;


public class JumpGameCompany {
    public static boolean canJump(int[] nums) {
        int limit = 0;

        for (int i = 0; i <= limit; i++) {
            limit = Math.max(limit, i + nums[i]);

            if (limit >= nums.length - 1)  {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.printf("%n%s", canJump(new int[] {2,3,1,1,4}));
    }
}
