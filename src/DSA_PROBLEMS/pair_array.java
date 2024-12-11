// package DSA_PROBLEMS;

public class pair_array {
    public static void Pairs(int num[]){
        int tp = 0;
        
        for(int i = 0; i < num.length ; i++){
            int cur = num[i];
            for(int j = i+1 ; j < num.length; j++){

                System.out.print("{"+ cur +"," + num[j]+"}");
                tp++;
            }
            System.out.println();
            
        }
        System.out.println("Total No Of Pairs:- "+tp);

    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        Pairs(num);
    }

    
    
}
