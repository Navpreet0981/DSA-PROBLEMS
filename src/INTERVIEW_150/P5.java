package INTERVIEW_150;

import java.util.HashMap;

public class P5 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int majority = nums.length/2;
        for (int num: nums){
            hs.put(num, hs.getOrDefault(num,0)+1);
            if (hs.get(num) > majority){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3,2,2};
        System.out.println(majorityElement(arr));
    }
}
