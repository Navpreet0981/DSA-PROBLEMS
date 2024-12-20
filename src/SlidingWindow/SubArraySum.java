package SlidingWindow;

public class SubArraySum {
//    Using Brute force
public double findMaxAverage(int[] nums, int k) {
    int maxSum = Integer.MIN_VALUE;
    int n = nums.length;
    for(int i =0; i<= n-k; i++){
        int sum =0;
        for(int j = i; j< i + k; j++){
            sum += nums[j];
        }
        maxSum = Math.max(maxSum, sum);
    }
    return (double) maxSum/k;
}


        // Using Sliding Window
    public double findMaxAverage2(int[] nums, int k) {
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
}
