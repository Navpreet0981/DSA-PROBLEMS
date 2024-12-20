package LEETCODE_75;

public class P16 {
//Max Number Of Consecutive Ones
public int longestOnes(int[] nums, int k) {
    int n = nums.length;
    int i = 0;
    int j = 0;
    int count_of_zero = 0; //monitor count of zero
    int ans = 0; //store maxlength of subarray

    while(j <  n){
        if(nums[j] == 0){
            count_of_zero++;
        }
        while(count_of_zero > k){
            // if count of zero greater than k
            if(nums[i] == 0){
                count_of_zero--;
            }
            i++;
        }
        ans = Math.max(ans, j-i+1);
        j++;
    }
    return ans;
}
/*
Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */
}
