package BIT_MANIPULATION;

public class Basics {

    public static boolean isEven(int num){
        return (num & 1) == 0;
    }

    public static boolean ispowOF2(int num){
        return (num & 2) == 2;
    }
    public static void main(String[] args){
        System.out.println(isEven(5));
        System.out.println(ispowOF2(4));
    }

}
