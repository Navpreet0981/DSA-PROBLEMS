package DP;

//Longest Common SubSequence
public class LCS {

//    O(2^N) --> Recursion
    public static int usingRecurssion(String str1, String str2, int n, int m){
        if (n ==0 || m == 0){
            return 0;
        }
        if (str1.charAt(n-1) == str2.charAt(m-1)){
            return usingRecurssion(str1, str2, n-1, m-1) + 1;
        }
        else {
            int ans1 = usingRecurssion(str1, str2, n-1, m);
            int ans2 = usingRecurssion(str1, str2, n, m-1);
            return Math.max(ans1,ans2);
        }
    }


//    O(N * M) --> Recursion + Memoization
  public static int usingMemoisation(String str1, String str2, int n, int m, int[][] dp){
        if (n ==0 || m == 0){
            return 0;
        }
        if (dp[n][m] != -1){
            return dp[n][m];
        }
        if (str1.charAt(n-1) == str2.charAt(m-1)){
            dp[n][m] = usingMemoisation(str1, str2, n-1, m-1, dp) + 1;
            return dp[n][m];
        }
        else {
            int ans1 = usingMemoisation(str1, str2, n-1, m, dp);
            int ans2 = usingMemoisation(str1, str2, n, m-1, dp);
            return dp[n][m] =  Math.max(ans1,ans2);
        }
    }


//    O(N * M) --> Tabulation
    public static int usingTabulation(String str1, String str2,int n, int m){

        int[][] dp = new int[n+1][m+1];
        for (int i=0; i<n+1; i++){
            dp[i][0] = 0;
        }
        for (int j=0; j<m+1; j++){
            dp[0][j]= 0;
        }

        for (int i=1; i<n+1; i++){
            for (int j=1; j<m+1; j++){
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j]= Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }


    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";  //LCS = "abdg"; length = 4;
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];

        //Initialization --> For Memoization.
        for (int i=0; i<n+1; i++){
            for (int j =0; j<m+1; j++){
                dp[i][j] = -1;
            }
        }


        System.out.println(usingRecurssion(str1, str2, str1.length(), str2.length()));
        System.out.println(usingMemoisation(str1, str2, n, m, dp));
        System.out.println(usingTabulation(str1, str2, n, m));

    }
}
