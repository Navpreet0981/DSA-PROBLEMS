package AL.LL;
//Using Brute Force Algorithm
/*public class Sum_subarray {
    public static void subarraySum(int num[])
    {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            for(int j = i; j<num.length; j++){
                curSum = 0;
                for(int k = i; k <= j; k++){
                    curSum += num[k];
                }
                System.out.println(curSum);
                if (maxSum < curSum) {
                    maxSum = curSum;
                    
                }
            }
        }
        System.out.println("Max Sum :- "+ maxSum);
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        subarraySum(num);
    }
}*/



//Using Prefix Sum Method.
/*public class Sum_subarray {
    public static void subarraySum(int num[])
    {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[ ] =new int[num.length];

        prefix[0]= num[0];
        //Calculate prefix Array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1]+ num[i];
 
        }
        for(int i = 0; i<num.length; i++){
            int start = i;
            for(int j = i; j<num.length; j++){
                int end = j;
                curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; 

                if (maxSum < curSum) {
                    maxSum = curSum;
                }
            }
        }
        System.out.println("Max Sum Is:- "+ maxSum);
    }public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        subarraySum(num);
    }
}
*/



//Using Kadanes Algorithm
public class Sum_subarray {

    public static void Kadanes(int num[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for(int i =0; i< num.length; i++){

            cs = cs + num[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Sum Is:- "+ ms);     


    }
    public static void main(String[] args) {
        int num [] ={2, 4, 6, 8, 10};
        Kadanes(num);
    }
}