
// package DSA_PROBLEMS;
//INVERTED HALF PYRAMID USING STARS
/*
    *
   **
  ***
 ****
 */
// ANSWER ->
/*
public class patterns {

    public static void Half_Pyramid(int n){
        for(int i=1; i<=n; i++){

            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Half_Pyramid(5);
    }
}
*/



//INVERTED HALF PYRAMID USING NUMBERS 
/*
1 2 3 4 5
1 2 3 4 
1 2 3 
1 2 
1
 */

//ANSWER ->
/*
 
public class patterns {
    
    public static void Half_Pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print( j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Half_Pyramid(5);
    }
}
*/


//FLOYD'S TRIANGLE
/*
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15
 */

 //ANSWER->
/*
 
public class patterns {
    public static void floyds(int n){
        int num =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds(5);
    }
    
    
}
*/

/* 

*      *
**    **
***  ***
********
********      
***  ***
**    **
*      *





Butterfly Pattern

 */
// public class patterns {


//     public static void Butterfly(int n){
//         //1st Half
//         for(int i = 1; i <= n; i++){
//             //Stars
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             //Spaces
//             for(int j = 1; j <= 2*(n-i); j++){
//                 System.out.print(" ");
//             }
//             //Stars
//             for(int j=1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         //2nd Half
//         for(int i =n; i >= 1; i--){
//                 //Stars
//                 for(int j=1; j <= i; j++){
//                     System.out.print("*");
//                 }
//                 //Spaces
//                 for(int j = 1; j <= 2*(n-i); j++){
//                     System.out.print(" ");
//                 }
//                 //Stars
//                 for(int j = 1; j <= i; j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//         Butterfly(5);
//     }           
// }\

/**
       ********
      ******** 
     ********  
    ********   
   ********    
  ********     
 ********
********

Rhombus
 */
// public class patterns {

//     public static void Rhombus(int n){

//         for(int i = 1; i <= n; i++){
//             //Spaces
//             for(int j = 1; j <= (n - i); j++){
//                 System.out.print(" ");
//             }
//             //Stars
//             for(int j = 1; j <= n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
         
//     }
//     public static void main(String[] args) {
//         Rhombus(8);
//     }
// }

/**
v    *****
   *   *
  *   *
 *   *
*****

Hollow Rhombus
 */
// public class patterns {
//     public static void hollowRhombus(int n){
//         for(int i = 1; i <= n; i++){
//                         //Spaces
//                         for(int j = 1; j <= (n - i); j++){
//                             System.out.print(" ");
//                         }
//                         //Hollow Rectangle
//                         for(int j=1; j<=n;j++){
//                             if (i ==1 || i == n|| j == 1|| j == n) {
//                                 System.out.print("*");
                                
//                             }else{
//                                 System.out.print(" ");
//                             }
//                         }
//                         System.out.println();
//             }
//     }
//     public static void main(String[] args) {
//         hollowRhombus(5);
//     }

    
// }

/**
    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *  
    
    Diamond Pattern
 */
// public class patterns {
//     public static void Diamond(int n){
//         //1st Half
//         for(int i = 1; i <= n; i++){
//             //Spaces
//             for(int j = 1; j <= (n-i); j++){
//                 System.out.print(" ");
//             }
//             //Making Diamond
//             for(int j = 1; j <= (2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }    
//         //2nd Half
//         for(int i = n; i >= 1; i--){
//              //Spaces
//              for(int j = 1; j <= (n-i); j++){
//                 System.out.print(" ");
//             }
//             //Making Diamond
//             for(int j = 1; j <= (2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
//     public static void main(String[] args) {
//         Diamond(5);
//     }
// }

/*
1234554321
1234**4321
123****321
12******21
1********1

Same As ButterFly
 */
// public class patterns {

//     public static void xyz(int n){
//         for(int i =n; i >= 1; i--){
//                             //Stars
//                             for(int j=1; j <= i; j++){
//                                 System.out.print(j);
//                             }
//                             //Spaces
//                             for(int j = 1; j <= 2*(n-i); j++){
//                                 System.out.print("*");
//                             }
//                             //Stars
//                             for(int j = i; j >= 1; j--){
//                                 System.out.print(j);
//                             }
//                             System.out.println();
//                     }
//     }
//     public static void main(String[] args) {
//         xyz(5);
//     }

// }