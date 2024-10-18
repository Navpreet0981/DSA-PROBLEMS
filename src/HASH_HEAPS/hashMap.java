package HASH_HEAPS;

import java.util.HashMap;

public class hashMap {

    public static boolean isAnagram (String s, String t){
        HashMap<Character, Integer> map =  new HashMap<>();

        for (int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        for (int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if (map.get(ch) != null){
                if (map.get(ch) == 1){
                    map.remove(ch);
                }else {
                    map.put(ch, map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
/*

    HashMap<String, Integer> hm = new HashMap<>();

    //Insert
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);
    hm.put("Bhutan", 10);
    hm.put("Uk", 60);
    hm.put("Pakistan", 20);
    hm.put("Sikkim", 5);
    hm.put("Canada", 70);
//    System.out.println(hm);
 */

/*
    //Get
        int population= hm.get("India");
        System.out.println(population);

    //Contains
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

    //Remove
        hm.remove("India");
        System.out.println(hm);

    //Size
        System.out.println(hm.size());

    //IsEmpty
        System.out.println(hm.isEmpty());
    //Clear
        hm.clear();
        System.out.println(hm);
        */

        //Iteration
//        Set<String> keys = hm.keySet();
//        System.out.println(keys);
//
//        for (String K: keys){
//
//            System.out.println("{keys:- " + K + " ,values:- " + hm.get(K) + "}");
//        }


        //To Find The Frequency of Numbers

        //To Find Maximum Frequency of number
       /* int arr[] = {1,3,2,5,1,3,1,5,1,3,3,3,3,3};
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i =0; i< arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        for (Integer i : hm.keySet()){
            if (hm.get(i) > arr.length/3 ){
                System.out.print(i+" ");
            }

        }

        */

        String s= "tuplip";
        String t= "lupit";
        System.out.println(isAnagram(s,t));








  }
}
