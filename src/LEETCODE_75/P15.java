package LEETCODE_75;

public class P15 {
//    Max Number Of Vowels In Strings
boolean isVowel(char c){
    return "aeiouAEIOU".indexOf(c) != -1;
}
    public int maxVowels(String s, int k) {
        int n = s.length();
        int maxVowels =0;
        int currentVowels =0;

        for(int i =0; i<k; i++){
            if(isVowel(s.charAt(i))){
                currentVowels++;
            }
        }
        maxVowels = currentVowels;

        for(int i=k; i< n ;i++){
            if(isVowel(s.charAt(i))){
                currentVowels++;
            }
            if(isVowel(s.charAt(i - k))){
                currentVowels--;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }
        return maxVowels;
    }

    /*
    Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
     */
}
