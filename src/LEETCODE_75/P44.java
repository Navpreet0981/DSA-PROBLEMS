package LEETCODE_75;

import java.util.PriorityQueue;

public class P44 {
//      Total Cost to hire k workers
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        long totalCost = 0;

        // Pointers for the left and right groups
        int left = 0, right = n - 1;

        // Priority queues to track the smallest costs
        PriorityQueue<Integer> leftPQ = new PriorityQueue<>();  // Left candidates
        PriorityQueue<Integer> rightPQ = new PriorityQueue<>(); // Right candidates

        // Add initial candidates to both groups
        while (left < candidates && left < n) {
            leftPQ.offer(costs[left]);
            left++;
        }
        while (right >= n - candidates && right >= left) {
            rightPQ.offer(costs[right]);
            right--;
        }

        // Hire `k` workers
        for (int i = 0; i < k; i++) {
            // Compare the smallest costs from both groups
            if (!leftPQ.isEmpty() && (rightPQ.isEmpty() || leftPQ.peek() <= rightPQ.peek())) {
                // Hire from the left group
                totalCost += leftPQ.poll();
                if (left <= right) { // Add the next worker to the left group if possible
                    leftPQ.offer(costs[left]);
                    left++;
                }
            } else {
                // Hire from the right group
                totalCost += rightPQ.poll();
                if (left <= right) { // Add the next worker to the right group if possible
                    rightPQ.offer(costs[right]);
                    right--;
                }
            }
        }

        return totalCost;
    }
}
