package LEETCODE_75;

public class P26 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int maxDepth(TreeNode root) {

            // Basically, We have to find the height of the tree
            if(root == null){
                return 0;
            }

            int lh = maxDepth(root.left);
            int rh = maxDepth(root.right);

            return Math.max(lh, rh) + 1;
    }
}
