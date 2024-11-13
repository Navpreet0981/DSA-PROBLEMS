package DP.Knapsack;

public class MinimumPartition {

    public static int knapsack(int[] num, int sum){
        int n= num.length;
        int W = sum/2;
        int[][] dp = new int[n+1][W+1];
        for (int i=0; i<n+1; i++){
            dp[i][0] = 0;
        }
        for (int j=0; j<W+1; j++){
            dp[0][j] = 0;
        }

        for (int i=1; i<n+1; i++){
            for (int j=1; j<W+1; j++){
                int v = num[i-1];
                int w = num[i-1];
                if (w <= j){
                    int incNum = v + dp[i-1][j-w];
                    int excNum = dp[i-1][j];
                    dp[i][j] = Math.max(incNum, excNum);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static int minPartition(int[] num, int sum){
        int sum1 = knapsack(num, sum);
        int sum2 = sum - sum1;
        int mindiff = Math.abs(sum1-sum2);
        return mindiff;
    }

    public static void main(String[] args) {
        int[] num = {1,6,11,5};
        int sum=0;
        for (int i=0; i<num.length; i++){
            sum += num[i];
        }
        System.out.println("Total Sum is:- "+ sum);
        System.out.println(minPartition(num,sum));
    }
}
