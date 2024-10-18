package GREEDY;

public class knapsackproblem {
    static class Job{
        int deadline;
        int profit;
        int id; // 0,1,2,3..
        public Job(int i , int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }


    }

    /*public static void main(String[] args) {

    int val[] = {60,100,120};
    int weight[] = {10,20,30};
    int w =50;
    double ratio[][] = new double[val.length][2];
    //0th col => indx 1st col -> ratio
        for (int i=0; i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] /(double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalval = 0;

        //Accending Order Sorting
        for (int i= ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]){
                finalval += val[idx];
                capacity -= weight[idx];
            }else {
                //Fractional item
                finalval += (ratio[i][1] * capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("Final Value:- "+finalval);
    }

     */ //Knapsack
    /*  public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {2,1,3};
        Arrays.sort(a);
        Arrays.sort(b);
        int diff =0;
        for (int i=0; i<a.length; i++){
            diff +=  Math.abs(a[i] - b[i]);
        }
        System.out.println("Min Asoulute Diff is:- "+diff);
    }

   */ //Min Absolute Difference
    /*public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen =1;
        int chainEnd = pairs[0][1];

        for (int i=1; i<pairs.length; i++){
            if (pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Max Length of Chain Is:- "+ chainLen);
    }

     */ //Max Length chain pairs
    /*  public static void main(String[] args) {
        Integer domin[]= {1,2,5,10,20,50,100,500,200};
        Arrays.sort(domin, Collections.reverseOrder());
        int amount = 5979;
        int count =0;
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.print("Coins Required are:- ");
        for (int i=0; i<domin.length ;i++){
            if (domin[i] <= amount){
                while (domin[i] <= amount){
                    count++;
                    amount = amount- domin[i];
                    System.out.print(domin[i]+" ");
                }
            }
        }
        System.out.println("\nNo Of Coins Required:- "+ count);
    }

   */ //Max Coin Required To Give Amount
    /*   public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit); // Profit Comes In Ascending Order of Profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;
        for (int i=0; i< jobs.size(); i++){
            Job curr = jobs.get(i);
            if (curr.deadline > time){
                seq.add(curr.id);
                time ++;

            }
        }

        // Print Sequence
        System.out.println("Max Jobs :- "+seq.size()+" ");
        for (int i =0; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }

  */   //
    /* public static void main(String[] args) {
        int n=4, m=5;
        Integer costVer[] ={2,1,3,1,4};
        Integer constHor[]= {4,1,2};
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(constHor, Collections.reverseOrder());
        int h=0,v =0;
        int hp=0,vp=0;
        int cost=0;
        while(h<constHor.length && v < costVer.length){
            if (costVer[v] >= constHor[h]){
                cost += (constHor[h] * vp);
                hp++;
                h++;
            }else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while(h < constHor.length ){
            cost += (constHor[h] * vp);
            hp++;
            h++;
        }
        while(v < costVer.length ){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("Min Cost Of cuts:- "+ cost);

    }*/
}
