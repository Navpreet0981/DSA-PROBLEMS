package LEETCODE_75;

public class P2 {
//    Greatest common divisor of two string

    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!( str1 + str2 ).equals( str2 + str1 )){
            return "";
        }
        int gcdLength = gcd(str1.length() , str2.length());
        return str1.substring(0, gcdLength);
    }

/*
Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 */
}
