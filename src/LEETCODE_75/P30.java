package LEETCODE_75;

public class P30 {
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
        public int goodNodes(TreeNode root) {
            return goodNodeCount(root, Integer.MIN_VALUE);
        }

        public  int goodNodeCount(TreeNode root, int maxVal){

            if(root == null ){
                return 0;
            }

            int count = 0;
            if(root.val >= maxVal ){
                count++;
            }

            maxVal = Math.max(maxVal, root.val);
            count +=  goodNodeCount(root.left, maxVal);
            count +=  goodNodeCount(root.right, maxVal);

            return count;
        }
}
