package DSA_PROBLEMS;
import java.util.Scanner;
public class Matrices {
        public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        //cells = rows * columns
        int n=matrix.length, m=matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //Output
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
