// EXCEPTION HANDLING IN JAVA

// EXCEPTION HANDLING USING MANY CATCH BLOCKS

// import java.util.Scanner;
// public class ch_10_excep {
//     public static void main(String[] args) {
//         int [] marks = new int[3];
//         marks[0]=76;
//         marks[1]=36;
//         marks[2]=26;
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter The Array Index:- ");
//         int ind = sc.nextInt();

//         System.out.println("Enter The Number You Want To Divide With:- ");
//         int number= sc.nextInt();

//         try{
//             System.out.println("The value At The Entered Index Is:- "+ marks[ind]);
//             System.out.println("The Value Of Array-Value/Number is: "+ marks[ind] / number);
//         }
//         catch(ArithmeticException e){
//             System.out.println("ArithmeticException Occured:- "+ e);
//             // System.out.println(e);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("ArrayIndexOutOfBoundsException Occured:- "+ e);
//         }
//         catch(Exception e){
//             System.out.println("Some Other Exception Occured"+ e);
//         }
//         System.out.println("End Of The Program.");
//     } 
// }

// NESTED TRY BLOCKS AND  CATCH STATEMENTS

// public class ch_10_excep {
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         marks[0] = 86;
//         marks[1] = 36;
//         marks[2] = 76;
//         try {
//             int a = 0;
//             int b = 42 / a;
//             System.out.println(b);
//             System.out.println("Welcome Here I Am In Main Try Block!!");
//             /*
//              * IF EXCEPTION OCCURED HERE THEN IT WILL NOT ENTER TO ANY ANOTHER
//              * NESTED BLOCK AND DIRECTLY GOES TO CATCH BLOCK AND RUN IT...
//              */
//             try {
//                 System.out.println("\nNow Am In The First Nested Try Block");
//                 System.out.println(marks[9]);
//             }
//             catch (ArrayIndexOutOfBoundsException e) {
//                 System.out.println("\nException Occured In First Nested Try Block");
//             }
//         } 
//         catch (Exception e) {
//             System.out.println("\nException Occcured In Main Try Block" + e);
//         }
//         System.out.println("\nEnd Of The Try/Catch Block's");
//     }
// }

// Throwing exceptions

// import java.util.Scanner;

// class MyException extends Exception{
//     public String toString(){
//         return "I Am A ToString()";
//     }
//     public String getMessage(){
//         return "I Am A getMessage()";
//     }
// }
// public class ch_10_excep {

//     public static void main(String[] args) {
//         int a;
//         Scanner sc = new Scanner(System.in);
//         a = sc.nextInt();
//         if (a < 9) {
            
//             try {
//                 throw new ArithmeticException("This Is A Exception");
//             } catch (Exception e) {
//                 System.out.println(e.getMessage());
//                 System.out.println(e.toString());
//                 e.printStackTrace();
//                 System.out.println("Finished");
//             }
//             System.out.println("Fully Finished");
//         } 
//     }
// }

public class ch_10_excep {
    public static int greet(){
        try{
            int a = 50;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
    
        }
        finally{
    
            System.out.println("This Is The End Of The Function");
        }
        return 0;

    }
public static void main(String[] args) {
   int k =  greet();
   System.out.println(k);
}
    
}