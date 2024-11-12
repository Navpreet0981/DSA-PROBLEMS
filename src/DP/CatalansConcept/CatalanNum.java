package DP.CatalansConcept;

import java.util.Arrays;

public class CatalanNum {

    // O(2^N)--> Using Recursion
    public static int catalanNum(int n){
        if (n ==0 || n ==1){
            return 1;
        }
        int ans =0;
        for (int i=0; i<=n-1; i++){
            ans += catalanNum(i) * catalanNum(n-i-1);
        }
        return ans;
    }

//   O(N)--> Using Memoization
    public static int catalanMemoi(int n, int[] f){
        if (n ==0 || n ==1){
            return 1;
        }
        if (f[n] != -1){return f[n];}
        int ans =0;
        for (int i=0; i<n; i++){
            ans += catalanMemoi(i,f) * catalanMemoi(n-i-1, f);
        }
        return f[n] = ans;

    }

//    O(N) --> Using Tabulation
    public static int catalanTabu(int n, int[] dp){
        dp[0] = dp[1] = 1;
        for (int i=2; i<n; i++){
            for (int j=0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n =4;
        int[] f = new int[n+1];
        Arrays.fill(f, -1);
        System.out.println(catalanNum(n));
        System.out.println(catalanMemoi(n,f));
        System.out.println(catalanTabu(n,f));
    }
}
