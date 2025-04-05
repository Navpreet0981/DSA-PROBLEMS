package AMCAT;

public class RoundRoin {
    public static void watingTime(int[] pocesses, int[] bt, int wt[], int quantum, int n){
        int[] rem_bt = new int[n]; //Remaining burst time
        for(int i = 0; i < n; i++){
            rem_bt[i] = bt[i];
        }

        int t = 0;
//        Initialize Until All Processes Are not traversed
        while(true){
            boolean done = true;
            for(int i = 0; i < n; i++){
                if(rem_bt[i] > 0){
                    done = false;
                    if(rem_bt[i] > quantum){
                        t += quantum;
                        rem_bt[i] -= quantum;
                    } else {

                    }

                }

            }

        }

    }

    public static void main(String[] args) {

    }
}
