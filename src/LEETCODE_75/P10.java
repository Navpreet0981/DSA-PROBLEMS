package LEETCODE_75;

public class P10 {
    //Move Zeros At the End On An Array
    public void moveZeroes(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        int nonZeroIndx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndx] = nums[i];
                nonZeroIndx++;
            }
        }

        for (int i = nonZeroIndx; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
