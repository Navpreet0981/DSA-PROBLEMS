package Sorting;

import java.util.PriorityQueue;

public class HeapSort {

    public static void heapify(int i, int n, int arr[]){
        int left = 2*i +1;
        int right = 2*i+2;

        int maxIndx =i;

        if (left < n && arr[left] > arr[maxIndx]){
            maxIndx = left;
        }

        if (right < n && arr[right] > arr[maxIndx]){
            maxIndx = right;
        }

        if (maxIndx != i){
            int temp = arr[i];
            arr[i] = arr[maxIndx];
            arr[maxIndx] = temp;
            heapify(maxIndx, n, arr);
        }
    }
    public static void heapSort(int arr[]){
        //step 1-> Build Max Heap
        int n = arr.length;
        for (int i = n/2; i>=0; i--){
            heapify(i,n,arr);
        }

        //Step 2-> Push Largest at end
        for (int i=n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(0,i, arr);
        }
    }




    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;
        public  Row(int soldiers, int idx){
            this.soldiers = soldiers;
            this.idx =idx;
        }
        @Override
        public int compareTo(Row r2){
            if (this.soldiers == r2.soldiers){
                return this.idx - r2.idx;
            }else{
                return this.soldiers - r2.soldiers;
            }
        }
    }



    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
//      /  heapSort(arr);

//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
    //Time Complexity O(nlogn)

        //Cost Of Connecting The ropes
      /*  int ropes[] = {2,3,3,4,6};
    PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }
    int cost =0;
        while (pq.size() > 1){
            int min= pq.remove();
            int min2 = pq.remove();
            cost += min+min2;
            pq.add(min+min2);
        }
        System.out.print("Cost Of Connectind N ropes Is:- "+cost );

       */

        //WEAKEST SOLDIER IN THE ARMY
        int army[][]={{1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0}};
        int k=2;
        PriorityQueue<Row> pq =new PriorityQueue<>();
        for (int i=0; i<army.length; i++){
            int count =0;
            for (int j=0; j<army[0].length; j++){
                count += army[i][j]==1 ? 1 : 0;
            }
            pq.add(new Row(count,i));
        }
        for (int i=0; i<k; i++){
            System.out.println("R"+pq.remove().idx);
        }
    }

}
