package LEETCODE_75;

import java.util.ArrayList;
import java.util.List;

public class P27 {

//    Definition for a binary tree node. --> To FInd THe Leafs Of Bth Trees Are Same Or Not

         static class TreeNode {
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
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> leaves1 = new ArrayList<>();
            List<Integer> leaves2 = new ArrayList<>();

            getLeafNodes(root1, leaves1);
            getLeafNodes(root2, leaves2);

            return leaves1.equals(leaves2);
    }

    public static void getLeafNodes(TreeNode root, List<Integer> leave){
            if(root == null){
                return;
            }

            if(root.left == null && root.right == null){
                leave.add(root.val);
                return;
            }

            getLeafNodes(root.left, leave);
            getLeafNodes(root.right, leave);
    }
}
