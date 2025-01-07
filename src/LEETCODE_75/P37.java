package LEETCODE_75;

public class P37 {
    //Delete Node In BST
    //Definition for a binary tree node.
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


        public TreeNode deleteNode(TreeNode root, int key) {
            // Base case: if the tree is empty or key is not found
            if (root == null) return null;

            // Search for the node to delete
            if (key < root.val) {
                root.left = deleteNode(root.left, key);
            } else if (key > root.val) {
                root.right = deleteNode(root.right, key);
            } else {
                // Node to delete is found
                if (root.left == null) {
                    // No left child: replace with right child
                    return root.right;
                } else if (root.right == null) {
                    // No right child: replace with left child
                    return root.left;
                }

                // Node has two children: find inorder successor
                TreeNode successor = findInorderSuccessor(root.right);
                root.val = successor.val; // Replace value with successor
                root.right = deleteNode(root.right, successor.val); // Delete successor
            }

            return root;
        }

        // Helper method to find the inorder successor (smallest value in the right subtree)
        private TreeNode findInorderSuccessor(TreeNode root) {
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }
}
