package INTERVIEW_150;

public class P6 {
//    Rotate Array k Times
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n-1);

        reverse(nums, 0, k-1);

        reverse(nums, k, n-1);

    }
    public static void reverse(int[]arr,int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        int k =2;
        rotate(arr, k);
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
