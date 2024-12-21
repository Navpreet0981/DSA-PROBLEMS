package INTERVIEW_150;

public class P21 {
//    The String I Palindrome Or Not
public boolean isPalindrome(String s) {

    StringBuilder words = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (Character.isLetterOrDigit(c)) {
            words.append(Character.toLowerCase(c));
        }
    }

    int j = words.length() - 1;
    for (int i = 0; i < j; i++) {
        if (words.charAt(i) != words.charAt(j)) {
            return false;
        }
        j--;
    }
    return true;
}

/*
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
}
