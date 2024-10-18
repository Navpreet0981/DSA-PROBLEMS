package STRINGS;

public class Plindrome_string {

    public static boolean palinfromeString(String str){
        for(int i =0; i<str.length()/2; i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-i)) {
                //Not A Palindrome
                return false;
            }
        }
        //A Palindrome
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palinfromeString(str));
    }

    //Time Complexity O(n)
    
}
