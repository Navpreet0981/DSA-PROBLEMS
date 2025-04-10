package TREES_TRIE.SegmentTrees;

import java.rmi.dgc.VMID;

public class SubArraySum {

    static int tree[];
    public static void initialize(int n){
        tree = new int[4*n];
    }

    public static int buildST(int[] arr, int i, int start, int end){
        if (start == end){
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start+end)/2;
        buildST(arr, 2*i+1, start, mid);   //left subtree--> 2*i+1
        buildST(arr, 2*i+2, mid+1,end);//right subtree--> 2*i+2
        tree[i] = tree[2*i+1] + tree[2*i+2];
        return tree[i];
    }

    public static int getSumUtil(int i,int si, int sj, int qi, int qj){
        //Case 1 == Non Overlap
        if (qj <= si || qi >= sj){
            return 0;
        }
        //Case 2 == Complete Overlap
        else if (si >= qi && sj <= qj){
            return tree[i];
        }
        //Case 3 == Partial Overlap
        else {
            int mid = (si + sj) /2;
            int left= getSumUtil(2*i+1, si, mid, qi, qj);
            int right= getSumUtil(2*i+2, mid+1, sj, qi, qj);
            return left + right;
        }
    }

    public static int getSum(int[] arr, int qi, int qj ){
        int n= arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);

    }
    public static void main(String[] args) {
        int[] arr = {1,2, 3,4,5,6,7,8};
        int n = arr.length;
        initialize(n);
        buildST(arr, 0, 0, n-1); // 0--7
//        for (int i=0; i< tree.length; i++){
//            System.out.print(tree[i]+" ");
//        }

        System.out.println(getSum(arr, 2, 5));
    }
}
