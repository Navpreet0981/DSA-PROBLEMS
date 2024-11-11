package DP.LongestCommonSub;

public class WildCardMatching {

    public static boolean wildcardMatching(String t, String p){
        int n = t.length();
        int m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];

//        (n == 0 && m == 0)
            dp[0][0] = true;
//        p == 0
        for (int i = 1; i<n+1; i++){
            dp[i][0] = false;
        }

//        t == 0
        for (int j=1; j<m+1; j++){
            if (p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }


        for (int i=1 ;i<n+1; i++){
            for (int j=1; j<m+1; j++){

                if (t.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }else if (p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }else {
                    dp[i][j] = false;
                }

            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "*a*?";
        System.out.println(wildcardMatching(str1,str2));

    }
}
