package LEETCODE_75;

public class P5 {
//    reverse all vowels in String

    public String reverseVowels(String s) {
        // Convert string to character array
        char[] chars = s.toCharArray();

        // Define the set of vowels
        String vowels = "aeiouAEIOU";

        // Two pointers
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Find the next vowel from the left
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Find the next vowel from the right
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move the pointers
            left++;
            right--;
        }

        // Convert char array back to string
        return new String(chars);
    }

}
