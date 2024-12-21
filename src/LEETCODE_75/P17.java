package LEETCODE_75;

public class P17 {
//    Longest sub-array of 1's after removing one zero
public int longestSubarray(int[] nums) {
    int n = nums.length;
    int zeroCount = 0;
    int left = 0;
    int maxOnes = 0;

    if (nums.length <= 1) {
        return 0;
    }

    for (int right = 0; right < n; right++) {
        if (nums[right] == 0) {
            zeroCount++;
        }

        while (zeroCount > 1) {
            if (nums[left] == 0) {
                zeroCount--;
            }
            left++;
        }

        maxOnes = Math.max(maxOnes, right - left);
    }
    return maxOnes;
}

/*
Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
 */
}
