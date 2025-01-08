package HASH_HEAPS;

import java.util.Map;

public class MyHeap {

    int heapSize;
    static int  heap[];
    int capacity;

    MyHeap(int[] arr){
        heap = arr;
        heapSize = arr.length;
        capacity = arr.length;

    }

    public static void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void heapifyMaxHeap(int i){
        int largest = i;
        int leftc = 2*i+1;
        int rightc = 2*i+2;

        if(leftc < heapSize && heap[leftc] > heap[largest]){
            largest = leftc;
        }
        if(rightc < heapSize && heap[rightc] > heap[largest]){
            largest = rightc;
        }
        if(largest != i){
            swap(i, largest);
            heapifyMaxHeap(i);
        }
    }
    public void buildTree(){
        //N/2 to n-1
        // 0 to (n/2 -1)
        for(int i = heapSize/2-1; i >= 0; i--){
            heapifyMaxHeap(i);
        }

    }

    public int popMax(){
        if(heapSize == 0){
            System.out.println("Heap Is Empty");
            return -1;
        }
        int max = heap[0];
        heap[0] = heap[heapSize - 1];
        heapSize--;
        heapifyMaxHeap(0);
        return max;

    }
    public void increseKey(int i, int value){
        if(i < 0 || i >= heapSize || heap[i] >= value){
            System.out.println("Wrong Operation");
            return;
        }
        heap[i] = value;
        while(i > 0 && heap[i] > heap[(int)(Math.ceil(i/2.0)-1)]){
            swap(i, (int)(Math.ceil(i/2.0)-1));
            i = (int)(Math.ceil(i/2.0)-1);
        }
    }

    public void print(){
        for(int i =0; i<heapSize; i++){
            System.out.print(heap[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,5,20,6,11};
        MyHeap heap = new MyHeap(arr);
        heap.buildTree();
        heap.print();
//        System.out.println("Max Element is:- "+ heap.popMax());
//        heap.print();
        heap.increseKey(4, 15);
        heap.print();
    }
}
