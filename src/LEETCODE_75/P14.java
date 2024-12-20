package LEETCODE_75;

public class P14 {
//    Max Sum Of Sub Arrays
public double findMaxAverage(int[] nums, int k) {
    // Using Sliding Window
    int n = nums.length;
    int sum = 0;

    for (int i = 0; i < k; i++) {
        sum += nums[i];
    }

    int maxSum = sum;
    for (int i = k; i < n; i++) {
        sum += nums[i] - nums[i - k];
        maxSum = Math.max(maxSum, sum);
    }
    return (double) maxSum / k;
}

/*
Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
 */
}
