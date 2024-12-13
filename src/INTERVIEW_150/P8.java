package INTERVIEW_150;

public class P8 {
//    Buy And Sell Stock II
public static int maxProfit(int[] prices) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit= 0;
    for(int i=0 ; i< prices.length-1; i++){
        if(prices[i] < prices[i+1]) {
            maxProfit += prices[i+1] - prices[i];

        }
    }
    return maxProfit;
}

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(maxProfit(arr));
    }
}
