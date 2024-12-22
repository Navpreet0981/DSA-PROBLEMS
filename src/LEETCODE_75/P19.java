package LEETCODE_75;

public class P19 {
//    Find The Index Of Pivot Where sum from left and right is equal
public int pivotIndex(int[] nums) {
    int totalSum = 0, leftSum = 0;

    for (int num : nums) {
        totalSum += num;
    }

    for (int i = 0; i < nums.length; i++) {
        if (leftSum == totalSum - leftSum - nums[i]) {
            return i;
        }
        leftSum += nums[i];
    }
    return -1;
}
/*
Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
 */
}
