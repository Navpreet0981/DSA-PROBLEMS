package DSA_PROBLEMS;

public class largest_str {
    public static void main(String[] args) {
        String str[] = {"apple", "Banana", "mango"};
        String largest  = str[0];
        for(int i=0; i<str.length; i++){
            if (largest.compareToIgnoreCase(str[i]) < 0) {
                largest = str[i];
                
            }
        }
        System.out.println(largest);
    }

    //Time Complexity O(x * n) Where X Is No of Comperisions
    
}
