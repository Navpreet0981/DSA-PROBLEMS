package AL.LL;
public class diagonal_sum {

    public static int DialgonalSum(int matrix[][]){
        int sum =0;

        //O(n^2)
        //Primary Diagonal  
        // for(int i =0; i<matrix.length; i++){
        //     for(int j =0; j<matrix[0].length; j++){
        //         if (i == j) {
        //             sum += matrix[i][j];   
        //         }
        //         else if (i+j == matrix.length-1) {
        //             sum += matrix[i][j];
                    
        //         }
        //     }
        // }

        for(int i =0; i<matrix.length; i++){//O(n)
            //Pd
            sum += matrix[i][i];
            //SD
            if (i != matrix.length-1-i) {
                
                sum += matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3},
                          {5, 6, 7},
                          {9, 10, 11}};
//                          {13, 14, 15, 16}};
        DialgonalSum(matrix);
        System.out.println(matrix.length);
        
    }

    
    
}
