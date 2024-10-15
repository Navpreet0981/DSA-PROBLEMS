package Sorting;
import java.lang.reflect.Array;
import java.util.*;
public class inbuilt_sort {

    public static void PrintArr(Integer arr[]){
        for(int i =0; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,2,3};
        /*
        In Increasing Order 
        Arrays.sort(arr);
        Arrays.sort(arr,0,3);
        */
        /*
        In Decresasing Order 
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr,0, 3, Collections.reverseOrder());
        */
//Time Complexity O(n logn)        
        PrintArr(arr);
    }
    
}
