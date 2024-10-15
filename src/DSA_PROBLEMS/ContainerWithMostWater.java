package DSA_PROBLEMS;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int MaxWaterStored(ArrayList<Integer> Height){
        //BRUTE FORCE APPROACH

        int MaxWater = Integer.MIN_VALUE;
        for (int i=0; i<Height.size(); i++){
            for (int j= i+1; j<Height.size(); j++){
                int ht = Math.min(Height.get(i), Height.get(j));
                int wt = j -i;
                int water = ht * wt;
                MaxWater = Math.max(MaxWater, water);
            }
        }
        return MaxWater;
    }

    public static int storedWater(ArrayList<Integer> Height){
        //Using 2 Pointer Approach
        int Lp = 0;
        int Rp = Height.size() - 1;
        int MaxWater =0;
        while(Lp < Rp){
            int ht = Math.min(Height.get(Lp), Height.get(Rp));
            int wt = Rp - Lp;
            int CurrWater = ht * wt;
            MaxWater = Math.max(MaxWater, CurrWater);

            //Update Pointer
            if (Height.get(Lp) > Height.get(Rp)){
                Rp--;
            }else {
                Lp++;
            }
        }
        return MaxWater;
    }


    public static void main(String[] args) {
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

//        System.out.println("Max Water stored In Containers Using Brute Force:- "+MaxWaterStored(Height));
//        System.out.println("Max Water stored In Containers Using 2 Pointer Approach:- "+storedWater(Height));
    }
}
