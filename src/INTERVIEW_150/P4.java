package INTERVIEW_150;

public class P4 {

//    To Remove Third Duplicate num from array for eg:- 1,1,1,2,2,3,3 output:- 1,1,2,2,3,3
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 2){
            return 2;
        }
        int i=2;
        int j =2;
        while( j < nums.length){
            if(nums[j] != nums[i - 2]){
                nums[i]= nums[j];
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
        for (int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
