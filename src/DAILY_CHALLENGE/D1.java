package DAILY_CHALLENGE;

public class D1 {
//    Count same Prefix And Suffix --> 8/Jan/25
    public int countPrefixSuffixPairs(String[] words) {
        // i < j Which means You can go backward if you approached at the position

    /* Two Approaches to do That
    1. use in build methods  startsWith()--> For prefix, endsWith()--> For suffix
    2. use subString methods. subs(0, word[i].length) --> for Prefix, subStr(n-words[i].length, n) --> for suffix;
    */

        int n = words.length;
        int count = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                String str1 = words[i];
                String str2 = words[j];

                if(str1.length() > str2.length()){continue;}
                if(str2.startsWith(str1) && str2.endsWith(str1)){
                    ++count;
                }
            }
        }
        return count;


    }
}
