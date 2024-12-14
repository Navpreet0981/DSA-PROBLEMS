package INTERVIEW_150;

public class P9 {
//    To Find You Can Jump From first to last index or not
    public boolean canJump(int[] arr) {
        int n = arr.length;
        int maxReach =0;
        for(int i =0; i < n; i++){
            if(i > maxReach){
                return false;
            }
            maxReach = Math.max(maxReach , i + arr[i]);
            if(maxReach >= arr.length-1){
                return true;
            }
        }
        return true;
    }
//    For array[3,2,1,1,4] return true;
//    For array[3,2,1,0,1] return false;
}
