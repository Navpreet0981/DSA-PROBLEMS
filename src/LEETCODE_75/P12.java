package LEETCODE_75;

public class P12 {
//    Container With Most Water
public int maxArea(int[] height) {
    int n= height.length;
    int lp = 0;
    int rp = n-1;
    int maxWater = 0;
    while(lp < rp){
        int w = rp - lp; //Width
        int h = Math.min(height[lp], height[rp]);
        int area = w * h; //calculate area
        maxWater = Math.max(maxWater, area); //update max value

        if(height[lp] < height[rp]){
            lp++;
        }

        else{
            rp--;
        }
    }
    return maxWater;

}
/*
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 */
}
