package AMCAT;

import java.util.Scanner;
public class Bus_Ticket {

    public static boolean isLucky(String str){
        int n = str.length();
        if(n < 2) return false;
        char first = str.charAt(0);
        char second = str.charAt(1);

        if(first == second) return false;

        for(int i = 0; i < n; i++){
            if(i % 2 == 0 && str.charAt(i) != first) return false;
            if(i % 2 == 1 && str.charAt(i) != second) return false;
        }
        return true;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while(T-- > 0){
            String str = sc.nextLine();
            System.out.println(isLucky(str) ? "Yes" : "No");
        }
    }
}
