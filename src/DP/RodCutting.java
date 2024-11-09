package DP;


//Variation Of Unbounded Knapsack
public class RodCutting {

    public static void print(int[][] dp){
        for (int i=0; i<dp.length; i++){
            for (int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int rodCutting(int[] ln, int[] prc, int ttlln){
        int n= ln.length;
        int[][] dp = new int[n+1][ttlln+1];

        for (int i =0; i<n+1; i++){
            dp[i][0] = 0;
        }
        for (int j=0; j<ttlln+1; j++){
            dp[0][j] = 0;
        }

        for (int i=1; i<n+1; i++){
            for (int j=1; j<ttlln+1; j++){
                if (ln[i-1] <= j){
                    dp[i][j] = Math.max(prc[i-1] + dp[i][j - ln[i-1]], dp[i-1][j]);
                }
                else {
                    dp[i][j] =  dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][ttlln];

    }
    public static void main(String[] args) {
        int[] ln = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] prc = {1, 5, 8, 9, 10, 17, 17, 20};
        int ttlln = 8;
        System.out.println(rodCutting(ln,prc,ttlln));

    }
}
