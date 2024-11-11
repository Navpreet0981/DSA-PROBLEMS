package DP.LongestCommonSub;

public class StringConversion {

    //Longest Common String
    public static int LCS(String str1, String str2){
        int n = str1.length();
        int m= str2.length();
        int[][] dp = new int[n+1][m+1];
        int ans=0;

        for (int i=0; i<n+1; i++){
            dp[i][0] = 0;
        }
        for (int j=0; j<m+1; j++){
            dp[0][j] = 0;
        }

        for (int i=1; i<n+1; i++){
            for (int j=1; j<m+1; j++){
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }

    //No Of Operations Required to covert string only Delete and insertion is allowed
    public static int stringConv(String str1, String str2){
        int lcs = LCS(str1, str2);
        int del  = str1.length() - lcs;
        int add  = str2.length() - lcs;

        return del+add;

    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "ab";
        System.out.println(stringConv(str1, str2));
    }
}
