package LEETCODE_75;

import java.util.Arrays;
import java.util.PriorityQueue;

public class P42 {
//    Find Kth Largest Number
public int findKthLargest(int[] nums, int k) {
    // Using Sorting
//    Arrays.sort(nums);
//    return nums[nums.length - k];

    // without Sorting

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for(int num : nums){
        minHeap.offer(num);

        if(minHeap.size() > k){
            minHeap.poll();
        }
    }
    return minHeap.peek();
}
}
