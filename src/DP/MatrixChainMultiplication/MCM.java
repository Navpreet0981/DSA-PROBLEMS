package DP.MatrixChainMultiplication;

import java.util.Arrays;

//Matrix Chain Multiplication
public class MCM {

//  using Recursion --> O(2^N)
    public static int mcm(int[] arr, int i, int j){
        int ans = Integer.MAX_VALUE;
        if (i==j){
            return 0;
        }
        for (int k=i; k<j; k++){
            int cost1 = mcm(arr, i, k); // Ai...Ak--> arr[i-1]*arr[k]
            int cost2 = mcm(arr, k+1, j); // Ak+1 ... Aj--> arr[k] * arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans,finalCost);
        }
        return ans;
    }


//  using Memoization --> O(N^2)
    public static int mcmMemoization(int[] arr, int i, int j, int[][] dp){
        int ans = Integer.MAX_VALUE;
        if (i==j){
            return 0;
        }
        if (dp[i][j] != -1){
            return dp[i][j];
        }
        for (int k=i; k<j; k++){
            int cost1 = mcmMemoization(arr, i, k,dp); // Ai...Ak--> arr[i-1]*arr[k]
            int cost2 = mcmMemoization(arr, k+1, j,dp); // Ak+1 ... Aj--> arr[k] * arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            dp[i][j] = ans = Math.min(ans,finalCost);
        }
        return dp[i][j];
    }

//  using Tabulation--> O(N^3)
    public static void printdp(int[][] dp){
        for (int i=0; i<dp.length; i++){
            for (int j=0; j<dp.length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int mcmTabulation(int[] arr){
        int n = arr.length;;
        int[][] dp = new int[n][n];

        //Initialization Diagonally Assigning value 0
        for (int i=0; i<n; i++){
                dp[i][i] = 0;
        }

        for (int len = 2; len< n; len++){
            for (int i = 1; i<=n-len; i++){
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k<j; k++){
                    int c1 = dp[i][k];
                    int c2 = dp[k+1][j];
                    int c3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], c1+c2+c3);
                }
            }
        }
        printdp(dp);
        return dp[1][n-1];
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        int n= arr.length;

        /*
        A1 = 1X2
        A2 = 2X3
        A1 . A2 == 1X2X3 = 6
        A3 = 3X4
        A4 = 4X3
        A3 . A4 == 3X4X3 = 36
        */


//      For Memoization
        int[][] dp = new int[n][n];
        for (int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println("using Memoization:- " + mcmMemoization(arr, 1, n-1, dp));

//       For Recursion
        System.out.println("using Recusion:- " + mcm(arr, 1, n-1));

//      For Tabulation
        System.out.println("Using Tabulation:- " + mcmTabulation(arr));
    }
}
