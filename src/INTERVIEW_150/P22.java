package INTERVIEW_150;

public class P22 {
//    First occurence in Strings
    /* C++
    public:
    int strStr(string haystack, string needle) {
        int m = needle.length();
        int n = haystack.length();

        if (m == 0)
            return 0;
        if (haystack.length() == 0 || needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            bool match = true;

            for (int j = 0; j < m; j++) {
                if (haystack[i + j] != needle[j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return i;
            }
        }
        return -1;
    }
     */


//    Examples

    /*
    Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
     */
}

