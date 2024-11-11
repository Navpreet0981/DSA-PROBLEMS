package DP.Knapsack;

public class ClimbStairs {

    //    O(2^n) --> Recursion
    public static int usngRec(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
//        if 1 & 2 climbs allowed at a time
        return usngRec(n - 1) + usngRec(n - 2);
//        if 1, 2, 3 climbs allowed at a time
//          return usngRec(n-1) + usngRec(n-2) + usngRec(n-3);
    }

    //    O(N) --> Memoization
    public static int usngRecMemo(int n, int[] f) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (f[n] != 0) { //If Already Calculated
            return f[n];
        }
        f[n] = usngRecMemo(n - 1, f) + usngRecMemo(n - 2, f);
        return f[n];
    }

    //    O(N) --> Tabulation
    public static int usngTabu(int n, int[] f) {
        f[0] = 1;
        for (int i = 2; i <= n; i++) {
            if (i ==1){
                f[i] = f[i-1];
            }else {
                f[i] = f[i - 1] + f[i - 2];
            }
        }
        return f[n];

    }


    public static void main(String[] args) {
        int n = 4;
        int[] f = new int[n + 1];
        System.out.println(usngRec(n));
        System.out.println(usngRecMemo(n, f));
        System.out.println(usngTabu(n, f));

    }
}