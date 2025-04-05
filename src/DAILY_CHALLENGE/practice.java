package DAILY_CHALLENGE;

import jdk.jfr.consumer.RecordedEvent;

public class practice {
    public static int max(int[] arr){
        int size = arr.length;
        if(size == 0){return 0;}
        int max=0;
        for(int j = 0; j < size; j++){
         max = Math.max(max, arr[j]);

        }
         return max;
    }
    public static void reverse(int[] arr){
        int n = arr.length;
        if(n == 0){
            return;
        }
        for(int i = n-1; i >= 0; i--){
            System.out.print(arr[i] + ", ");
        }
    }

    public static boolean isSorted(int[] arr){
        int n = arr.length;
        if(n == 0 || n == 1){
            return true;
        }
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,5,6,78,90};
        System.out.println(max(arr));
        reverse(arr);
        System.out.println();
        System.out.println(isSorted(arr));
    }
}
