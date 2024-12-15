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
}
