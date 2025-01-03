package INTERVIEW_150;

public class P18 {
//length of last word of string
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int i = n - 1;
        int length =0;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }

    /*
    Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
     */
}
