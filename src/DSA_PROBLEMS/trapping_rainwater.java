// package DSA_PROBLEMS;
public class trapping_rainwater {
    public static int trappedRainWater(int height[]){
        int n = height.length;
        //calculate left max boundary array k
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //calculate right max array 
        int rightmax[] = new int[n];
        rightmax[n-1] = height[ n - 1];
        for(int i = n-2; i >= 0; i-- ){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trappedWater =0 ;
        //loop 
        for(int i =0; i < n; i++){
            //waterlevel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            
            //trapped water = waterLevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int height[]= {10, 2, 0, 6, 3, 2, 10};

        System.out.println(trappedRainWater(height));
    }
    
}
