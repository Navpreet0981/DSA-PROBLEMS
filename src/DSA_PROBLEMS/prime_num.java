// import java.util.Scanner;
// public class prime_num {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Enter number:- ");
//         int num = scanner.nextInt();

//         boolean prime = checkprime(num);

//         if(prime){
//             System.out.println(num+" Is Prime Number.");
//         }
//         else{
//             System.out.println(num+" Is Not Prime Number.");
//         }
//         scanner.close();
//     }
//     public static boolean checkprime(int n){
//         if (n <=1 ) {
//             return false;
//         }
//         for(int i=2; i<= Math.sqrt(n); i++){
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// import java.util.Scanner; 

// public class prime_num{
// 	        static void checkPrime (int n) {
//                 boolean flag = true;
//                 if (n <=1) {
//                     flag =false;
//                     System.out.println(n + " is Not prime.");
                    
//                 }
// 	            for(int i=2; i<n; i++) {
//                     if(n%i == 0) {
//                         flag=false;
//                         System.out.println(n + " is NOT prime.");
// 	                    break;
// 	                }				
// 	            }
// 	            if(flag)
// 	                System.out.println(n + " is prime.");
// 	        }
	        
// 	        public static void main(String[] args) {
// 	            Scanner scanner = new Scanner(System.in);
// 	            System.out.println("Enter a number to check this is prime or not:-");
// 	            int number=scanner.nextInt();
// 	            checkPrime(number);
                
// 	        }
// 	}
