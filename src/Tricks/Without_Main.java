package Tricks;

import static java.lang.Math.log10;

public class Without_Main {
//    static {
//        System.out.println("Hello");
//        System.exit(0);
//    }


    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels duplicates: a^a = 0, a^0 = a
        }
        return result;
    }
    /*  🔍 Example:
        Input: nums = [2, 3, 5, 4, 5, 3, 4]
        Output: 2 ✅ (only number that appears once)
    */


    public static int digitCount(int n){
        double digits = log10(n) + 1;
        return (int) digits;
    }
    public static int gcd(int a, int b){
        return (b != 0) ? gcd(a, a % b) : a;
    }
    public static int lcm(int a, int b){
        return (a * b)/ gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(digitCount(1234));
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.print(a+", ");
        System.out.print(b);
        System.out.println();

        a = a ^ b ^ (b = a);
        System.out.print(a+", ");
        System.out.print(b);
        System.out.println();

        a = a + b - (b = a);
        System.out.print(a+", ");
        System.out.print(b);

        System.out.println();
        System.out.println(gcd(10, 20));
        System.out.println(lcm(10, 20));
    }
}
