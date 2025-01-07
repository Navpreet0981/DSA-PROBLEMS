package LEETCODE_75;

import java.util.HashMap;

public class P31 {
//    Definition for a binary tree node.
 public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
  this.val = val;
  this.left = left;
  this.right = right;
  }
  }
        public int pathSum(TreeNode root, int targetSum) {
            // Map to store the frequency of prefix sums
            HashMap<Long, Integer> prefixSumMap = new HashMap<>();
            // Add the base case: a prefix sum of 0 has occurred once
            prefixSumMap.put(0L, 1);
            // Start the DFS to find the path sum
            return dfs(root, 0L, targetSum, prefixSumMap);
        }

        private int dfs(TreeNode node, long currentSum, int targetSum, HashMap<Long, Integer> prefixSumMap) {
            if (node == null) {
                return 0;
            }

            // Update the current prefix sum
            currentSum += node.val;

            // Check if there's a prefix sum that satisfies the condition
            int count = prefixSumMap.getOrDefault(currentSum - targetSum, 0);

            // Add the current prefix sum to the map
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);

            // Recurse into the left and right subtrees
            count += dfs(node.left, currentSum, targetSum, prefixSumMap);
            count += dfs(node.right, currentSum, targetSum, prefixSumMap);

            // Backtrack: remove the current prefix sum from the map
            prefixSumMap.put(currentSum, prefixSumMap.get(currentSum) - 1);

            return count;
        }
}
