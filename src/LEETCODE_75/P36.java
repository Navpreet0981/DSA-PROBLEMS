package LEETCODE_75;

public class P36 {
    //Search In Binary Search Tree
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


        public TreeNode searchBST(TreeNode root, int val) {
            if(root == null || root.val == val ){return root; }

            if(root.val > val){
                return searchBST(root.left, val);
            } else{
                return searchBST(root.right, val);
            }
        }
}
