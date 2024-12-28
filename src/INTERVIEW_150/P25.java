package INTERVIEW_150;

import java.util.HashSet;
import java.util.Set;

public class P25 {
//Return the max non-repeating char String
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int j = 0;
        int longest = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            longest = Math.max(longest, i - j + 1);
        }
        return longest;
    }

    /*
    Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
     */
}
