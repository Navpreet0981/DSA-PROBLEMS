package AL.LL;

import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static Node insert(Node root , int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            //Left Subtree
            root.left = insert(root.left, val);
        }else {
            //Right Subtree
            root.right = insert(root.right, val);
        }
        return root;

    }
    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean BST_Search (Node root, int key){
        if (root == null){
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key){
            return  BST_Search(root.left ,key);
        }
        else {
            return BST_Search(root.right, key);
        }
    }


    public static Node delete(Node root, int val){
        if (root.data < val){
            root.right = delete(root.right , val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else {
            //CASE 1 --> Leaf Node
            if (root.left == null && root.right == null){
                return null;
            }
            //CASE 2 --> Single Child
            if (root.left == null){
                return root.right;
            }else if(root.right == null){
                return  root.left;
            }

            //CASE 3 --> Both Children
            Node IS = findInorderSeccessor(root.right);//Find inorder Successor From Right Subtree Which is (6)
            root.data = IS.data; //Chnage The Data Of IS To The Root Data (5 --> 6)
            root.right = delete(root.right, IS.data); // Delete The Child Node Which Is (6)
        }
        return root;
    }
    public static Node findInorderSeccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void InRange(Node root, int k1, int k2){
        if (root == null){
            return ;
        }
        if(root.data >= k1 && root.data <= k2){
            InRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            InRange(root.right, k1, k2);
        }else if (root.data < k1){
            InRange(root.left, k1, k2);
        }
        else {
            InRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for (int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void RootToLeafPath(Node root, ArrayList<Integer> path){
        //Current Path 8-5-3, 8-5-6, 8-10-11-14

        if (root == null){
            return;
        }
        if (root.left== null & root.right==null){
            printPath(path);
        }
        path.add(root.data);
        RootToLeafPath(root.left, path);
        RootToLeafPath(root.right, path);
        path.remove(path.size()-1);
    }
    public static Node createBST(int arr[], int st, int end){
        if (st > end){
            return null;
        }
        int mid = (st+ end) /2;
        Node root =  new Node(arr[mid]);
        root.left =  createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;

    }

    public static void preOrder(Node root){
        if (root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
//        int values[] = {8,5,3,1,4,6,10,11,14};
       // Node root = null;

//        for (int i=0; i< values.length; i++){
//            root = insert(root, values[i]);
//        }
//        inorder(root);
//        System.out.println();

//        System.out.println("Searching for 4 in BST "+ BST_Search(root, 4));
//        root = delete(root ,5);
//        inorder(root);

//        System.out.println("Print The Element Coming In The range");
//        InRange(root, 5,10);

//        System.out.println("Total Paths In The Tree");
//        RootToLeafPath(root,new ArrayList<>());

        int arr[] = {3,5,6,8,10,11,12};
        Node root = createBST(arr, 0, arr.length-1);

        preOrder(root);

    }
}
