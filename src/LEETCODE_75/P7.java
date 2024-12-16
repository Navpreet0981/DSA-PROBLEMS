package LEETCODE_75;

public class P7 {
//    Product of Array Except Self
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        arr[0] =1;
        for (int i=1; i< nums.length; i++){
            arr[i] = arr[i-1] * nums[i-1];
        }

        int rightProduct =1;
        for (int i = nums.length-1;i >= 0;i++){
            arr[i]  *= rightProduct;
            rightProduct *= nums[i];
        }
        return arr;
    }
}
