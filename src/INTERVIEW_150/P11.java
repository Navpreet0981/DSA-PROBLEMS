package INTERVIEW_150;

public class P11 {
//    Find H index to make equal values elements in whole array
    public int hIndex(int[] citations) {
        int sum = 0;
        for (int c: citations){
            sum += citations[c];
        }
        double value = sum/citations.length;
        int ans = (int) Math.floor(value);
        return ans;

    }

    /*


Example 1:

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
Example 2:

Input: citations = [1,3,1]
Output: 1

     */
}
