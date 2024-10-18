package RECURSION;
import java.sql.SQLOutput;

//ALL BASIC FUNCTIONS OF RECURSION USING JAVA

public class recursion {
    public static void printDecreasing(int n) {

        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(n + "  ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int sumOfN(int n) {
        if (n == 0) {
            return 0;
        }
        int fnm1 = sumOfN(n - 1);
        int fn = n + fnm1;
        return fn;
    }

    public static int Fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int FibNm1 = Fib(n - 1);
        int FibNm2 = Fib(n - 2);
        int FibN = FibNm1 + FibNm2;
        return FibN;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            System.out.println("Sorted");
            return true;
        }
        if (arr[i] >= arr[i + 1]) {
            System.out.println("Not Sorted");
            return false;
        }
        return isSorted(arr, i + 1);

    }

    public  static  int firstOccur(int arr[], int key, int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return  firstOccur(arr, key, i+1);

    }

    public static int lastOccure(int arr[],int key, int i){
        if (i == arr.length){
            return -1;
        }
        int isFound = lastOccure(arr, key, i+1);

        if (arr[i] == key && isFound == -1 ){
            return i;
        }
        return isFound;
    }

    public static int xPowern(int x, int n){
        if ( n == 0){
            return 1;
        }
//        double xPnm1 = xPowern(x , n-1);
//        x = x * xPnm1;
        return x * xPowern(x , n-1);

    }

    public static int OptimizePower(int a, int n){
        if (n == 0){
            return 1;
        }
        int halfPow = OptimizePower(a,n/2);
        int halfPoweSqr = halfPow * halfPow;
        if (n %2 != 0){
            halfPoweSqr = a * halfPoweSqr;
        }
        return halfPoweSqr;
    }

    public static int TilingProblem(int n){
        //Breadth(2) * n (length) of Floor
        if (n==0 || n==1){
            return 1;
        }
        //Vertical Choice
        int fnm1 = TilingProblem(n-1);

        //Horizontala Choice
        int fnm2 = TilingProblem(n-2);
        int totWays = fnm1+fnm2;
        return totWays;
    }

    public static void RemoveDuplicates(String Str, int indx, StringBuilder newStr, boolean map[] ) {
     if (indx == Str.length()){
         System.out.println(newStr);
         return;
     }
     char CurrChar = Str.charAt(indx);

     if (map[CurrChar - 'a'] == true){
         RemoveDuplicates(Str, indx+1, newStr, map);
     }
     else {
         map[CurrChar - 'a'] = true;
         RemoveDuplicates(Str, indx+1, newStr.append(CurrChar), map);
     }

 }

    public static int firendsPairing(int n){
        if (n==1 || n==2){
            return n;
        }
        //Choice
        //Return :- Single + (n-1) * double
        return firendsPairing(n-1) + (n-1) * firendsPairing(n-2);
    }

    public static void BinaryStrings(int n, int lastPlace, String str){
        //Base Case
        if (n==0){
            System.out.println(str);
            return;
        }

        BinaryStrings(n-1, 0, str+"0");
        if (lastPlace == 0){
           BinaryStrings(n-1, 1,str+"1");
        }
    }

    public static void main(String[] args)  {
        int n = 10;
        int arr[] = { 2, 4, 5, 6,7,8,9, 5, 7 };
        
//        System.out.println("Numbers In Decreasing Oredr From 1 to N");
//        printDecreasing(n);1

//        System.out.println("Numbers In Incresing Oredr From 1 to N");
//        printIncreasing(n);

//        System.out.println("Factorial");
//        System.out.println(fact(5));

//        System.out.println("Sum Of N Numbers");
//        System.out.println(sumOfN(5));

//        System.out.println("Fibonacci");
//        System.out.println(Fib(8));

//        System.out.println("Array Is Sorted Or Not");
//        System.out.println(isSorted(arr, 0));

//        System.out.println("First Occurence Of A Number At Which Index");
//        System.out.println("First Occurence Of 5 At Index:- "+firstOccur(arr, 5,0));

//        System.out.println("Last Occurence Of A Number At Which Index");
//        System.out.println("Last Occurence Of 5 At Index:- "+lastOccure(arr, 5,0));

//        System.out.println("To Find X^n");
//        System.out.println(xPowern(2,10));

//        System.out.println("Optimized Form To Find The Power Of A Variable:- ");
//        System.out.println(OptimizePower(4,10));

//        System.out.println("Tilling Problem");
//        System.out.println(TilingProblem(2));

//        System.out.println("To Delete Duplicates From String");
//        String  Str= "appnnaacoollege";
//        RemoveDuplicates(Str,0, new StringBuilder(""), new boolean[26]);

//        System.out.println("Friends Pairing Problem:- " +firendsPairing(3));

          System.out.println("Binary String Problem:- ");
          BinaryStrings(3,0,"");



    }

}
