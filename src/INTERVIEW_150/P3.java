package INTERVIEW_150;

public class P3 {
//    Remove duplicate from the array and return count --> Easy

    public static int removeDuplicates(int[] nums) {
        int k=0;
        for( int i=1; i<nums.length; i++){
            if(nums[k] != nums[i]){
                nums[k+1] = nums[i];
                k++;
            }
        }
        return k+1;
    }

    public static void main(String[] args) {
       int[] nums = {1,1,2};
       removeDuplicates(nums);
    }

}
