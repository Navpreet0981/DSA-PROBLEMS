package DP.Knapsack;

public class knapsack01 {

//    O(2^n)
    public static int knapsachRecursion(int[] val, int[] wt, int W, int n){
        if (W == 0 || n == 0 ){
            return 0;
        }
        if (wt[n-1] <= W){//valid
            //Include
            int ans1 = val[n-1] + knapsachRecursion(val, wt, W-wt[n-1], n-1);

            //Exclude
            int ans2 = knapsachRecursion(val, wt,W,n-1);
            return Math.max(ans1,ans2);

        }else {
           return  knapsachRecursion(val, wt,W,n-1);
        }
    }

    //O(n * w)
    public static int knapsackMemoisation(int[] val, int[] wt, int W, int n, int[][] dp){
        if (W == 0 || n == 0 ){
            return 0;
        }
        if (dp[n][W] != -1){
            return dp[n][W];
        }
        if (wt[n-1] <= W){//valid
            //Include
            int ans1 = val[n-1] + knapsackMemoisation(val, wt, W-wt[n-1], n-1, dp);

            //Exclude
            int ans2 = knapsackMemoisation(val, wt,W,n-1, dp);
            dp[n][W]= Math.max(ans1,ans2);
            return dp[n][W];
        }else {
            dp[n][W]=  knapsackMemoisation(val, wt,W,n-1, dp);
            return dp[n][W];

        }
    }

    public static void print(int[][] dp){
        for (int i =0; i<dp.length; i++){
            for (int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static  int knapsackTabulation(int[] val, int[] wt, int W){
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
        for (int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        for (int j=0; j<dp[0].length; j++){
            dp[0][j] =0;
        }

        for (int i=1; i<n+1; i++){
            for (int j=1; j<W+1; j++){
                int v = val[i-1];//ith item value
                int w = wt[i-1];//ith item weight
                if (w <= j){//valid Case
                    int incProfit = v+ dp[i-1][j-w];
                    int exProfit =  dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, exProfit);
                }
                else { //Invalid Case
                    int exProfit =  dp[i-1][j];
                    dp[i][j] = exProfit;
                }
            }
        }
        print(dp);
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int w=7;
        int[][] dp = new int[val.length+1][w + 1];
        for (int i=0; i< dp.length; i++){
            for (int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsachRecursion(val, wt, w, val.length));
        System.out.println(knapsackMemoisation(val, wt, w, val.length,dp));
        System.out.println(knapsackTabulation(val, wt, w));
    }
}