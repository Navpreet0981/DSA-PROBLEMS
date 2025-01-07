package LEETCODE_75;

public class P32 {
 //   Definition for a binary tree node.
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

        int maxLength = 0;
        public int longestZigZag(TreeNode root) {
            if (root == null) return 0;

            // Start DFS in both directions
            dfs(root.left, 1, true);  // Left child, starting direction is left
            dfs(root.right, 1, false); // Right child, starting direction is right

            return maxLength;
        }

        public void dfs(TreeNode root, int length, boolean isLeft){
            if(root == null){
                return;
            }

            maxLength = Math.max(maxLength, length);

            if(isLeft){
                dfs(root.left, 1, true);
                dfs(root.right, length + 1, false);
            } else {
                dfs(root.right, 1, false);
                dfs(root.left, length + 1, true);
            }
        }
}
