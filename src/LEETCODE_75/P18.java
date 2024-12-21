package LEETCODE_75;

public class P18 {
//    Find Highest Altitude
public int largestAltitude(int[] gain) {
    int n = gain.length;
    int[] alti = new int[n + 1];
    int maxAltitude = 0;
    alti[0] = 0;

    for(int i=0; i< n; i++){
        alti[i + 1] = alti[i] + gain[i];
        maxAltitude =  Math.max(maxAltitude, alti[i + 1]);
    }

    return maxAltitude;
}
/*
Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 */
}
