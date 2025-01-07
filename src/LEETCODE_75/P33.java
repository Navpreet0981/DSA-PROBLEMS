package LEETCODE_75;

public class P33 {
//    Definition for a binary tree node.
 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            // Base case: if the current node is null or matches either p or q
            if (root == null || root == p || root == q) {
                return root;
            }

            // Recursive calls to find p and q in the left and right subtrees
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);

            // If both sides return non-null, the current node is the LCA
            if (left != null && right != null) {
                return root;
            }

            // Otherwise, return the non-null side
            return (left != null) ? left : right;

        }
}
