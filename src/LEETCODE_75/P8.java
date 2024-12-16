package LEETCODE_75;

public class P8 {
// Increasing Triplet Subsequence
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false; // A triplet is not possible if the array has less than 3 elements

        int first = Integer.MAX_VALUE; // Smallest number seen so far
        int second = Integer.MAX_VALUE; // Second smallest number seen so far

        for (int num : nums) {
            if (num <= first) {
                first = num; // Update the smallest number
            } else if (num <= second) {
                second = num; // Update the second smallest number
            } else {
                // We found a number greater than both `first` and `second`
                return true;
            }
        }

        return false;
    }
}
