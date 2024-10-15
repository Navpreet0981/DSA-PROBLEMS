package DSA_PROBLEMS;

import java.util.ArrayList;

public class PairSum1 {
    public static boolean pairSum_1(ArrayList<Integer> list, int target){
        //Using Brute Force
        for (int i=0; i<list.size(); i++){
            for (int j=i+1; j<list.size();j++){
                if (list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairSum_2(ArrayList<Integer> list, int target){

        //Using Two Pointer Approach
        int Lp= 0;
        int Rp = list.size()-1;

        while (Lp != Rp){
            if (list.get(Lp) + list.get(Rp) == target){
                return true;
            }
            else if (list.get(Lp) + list.get(Rp) < target){
                Lp++;
            }
            else if (list.get(Lp) + list.get(Rp) > target){
                Rp--;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 17;
        System.out.println(pairSum_1(list, target));
        System.out.println(pairSum_2(list, target));


    }
}
