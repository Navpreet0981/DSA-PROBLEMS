package GRAPHS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {//O(n)
    static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if (root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if (root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if (root == null){
                return;
            }
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void leveltraversal(Node root){
            if (root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node curNode = q.remove();
                if (curNode == null){
                    System.out.println();
                    if (q.isEmpty()){
                        break;
                    }else {
                        q.add(null);
                    }
                }else {
                    System.out.print(curNode.data+" ");
                    if (curNode.left != null){
                        q.add(curNode.left);
                    }if (curNode.right != null){
                        q.add(curNode.right);
                    }
                }
            }
        }
        public static int heightOfTree(Node root){
            if (root == null){
                return 0;
            }
            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);
            int height = Math.max(lh,rh)+1;
            return  height;
        }
        public static int CountOfNodes(Node root){
            if (root == null){return 0;}
            int lc = CountOfNodes(root.left);
            int rc = CountOfNodes(root.right);
            return lc + rc+ 1;
        }
        public static int SumOfNodes(Node root){
            if (root == null){return 0;}
            int ls = SumOfNodes(root.left);
            int rs = SumOfNodes(root.right);
            int totalSum = ls + rs + root.data;
            return totalSum;
         }
        public static int diameterOfTree(Node root){
            if (root == null){ return 0;}
            int lDia = diameterOfTree(root.left);
            int rDia = diameterOfTree(root.right);
            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);
            int selfDia = lh+rh+1;
            return  Math.max(Math.max(lDia, rDia), selfDia);

         }
        static class Info{
            int diam;
            int ht;
            public Info(int diam, int ht){
                this.diam = diam;
                this.ht = ht;
            }
         }
        public static Info Diameter(Node root){
            if (root == null){return new Info(0,0);}
            Info leftInfo = Diameter(root.left);
            Info rightInfo = Diameter(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
            return new Info(diam,ht);
         }
        public static void Klevel(Node root, int level, int k){
            if (root == null){
                return;
            }
            if (level == k){
                System.out.print(root.data+" ");
            }
            Klevel(root.left, level+1, k);
            Klevel(root.right, level+1, k);
        }
        public static boolean getPath(Node root, int n, ArrayList<Node>path){
            if (root ==null){
                return false;
            }
            path.add(root);
            if (root.data == n){
                return true;
            }
            boolean foundleft = getPath(root.left,n,path);
            boolean foundright = getPath(root.right,n,path);
            if (foundleft || foundright){
                return true;
            }
            path.remove(path.size()-1);
            return false;
        }
        public static Node lca(Node root, int n1,int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            //Last Common Ancestor
            int i=0;
            for (; i<path1.size() && i< path2.size(); i++){
                if (path1.get(i) != path2.get(i)){
                    break;
                }
            }
            //Last Equal Node -> i-1th
            Node lca = path1.get(i-1);
            return lca;


        }
        public static Node lca2(Node root, int n1, int n2){
            if (root == null || root.data == n1 || root.data == n2){
                return root;
            }
            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);
            if (rightLca == null){
                return leftLca;
            }
            if (leftLca == null){
                return rightLca;
            }
            return root;
        }
        public static int lcaDist(Node root , int n){
            if (root == null){
                return -1;
            }
            if (root.data == n){
                return 0;
            }
            int leftDist = lcaDist(root.left, n);
            int rightDist = lcaDist(root.right ,n);
            if (leftDist == -1 && rightDist == -1){
                return -1;
            }
            else if(leftDist == -1){
                return rightDist+1;
            }else{
                return leftDist+1;
            }

        }
        public static int MinDis(Node root, int n1, int n2){
            Node lca = lca2(root, n1, n2);
            int dist1 = lcaDist(lca,n1);
            int dist2 = lcaDist(lca, n2);

            return dist1+dist2;

        }
    }
    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);

//        System.out.println(root.data);
//        System.out.println("Pre Order Traversal");
//        tree.preorder(root);
//        System.out.println("In Order Traversal");
//        tree.inorder(root);
//        System.out.println("Post Order Traversal");
//        tree.postorder(root);
//        System.out.println("Level Wise Traversing");
//        tree.leveltraversal(root);
//        System.out.println();
//          System.out.println("Height Of Tree:- "+tree.heightOfTree(root));
//          System.out.println("Count Of Nodes:- "+tree.CountOfNodes(root));
//          System.out.println("Sum Of Nodes:- "+tree.SumOfNodes(root));
//          System.out.println("Diameter Of Tree:- "+tree.diameterOfTree(root));
//          System.out.println("Diameter Of Tree Using Only Fxn :- "+tree.Diameter(root).diam);
//          tree.Klevel(root,1, 3);
          int n1=4, n2=6;
//          System.out.println("Lowest Common Ancestor Of Two Nodes :- "+tree.lca(root,n1,n2).data);
          System.out.println("Minimum Distance Between Two Nodes :- "+tree.MinDis(root,n1,n2));
    }
}
