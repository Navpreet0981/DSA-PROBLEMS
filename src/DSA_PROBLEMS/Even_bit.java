// package DSA_PROBLEMS;
public class Even_bit {

    public static boolean odd_even(int n){
        if ((n & 1) == 0) {
            System.out.println("Number is even");
            return true;           
        }else{
            System.out.println("Number Is Odd");
            return false;
        }
    }
    public static void main(String[] args) {
        odd_even(4);
    }
    
}
