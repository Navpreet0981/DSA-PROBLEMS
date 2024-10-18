package TREES_TRIE;

public class trie {

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for (int i=0; i<26; i++){
                children[i]= null;
            }

        }
    }
    public static Node root = new Node();


    //Insertion In Trie --> O(L)
     public static void insert(String word){
         Node curr = root;
         for (int lvl = 0; lvl<word.length(); lvl++){
             int idx = word.charAt(lvl) - 'a';
             if (curr.children[idx] == null){
                 curr.children[idx] = new Node();
             }
             curr = curr.children[idx];
         }
         curr.eow = true;
     }

     //Searching In Trie --> O(L)
     public static boolean search(String key){
         Node curr = root;
         for (int lvl = 0; lvl<key.length(); lvl++){
             int idx = key.charAt(lvl) - 'a';
             if (curr.children[idx] == null){
                 return false;
             }
             curr = curr.children[idx];
         }
         return curr.eow == true;
     }

     //Word Break problem:-  That the word exist in string array or not --> O(L) L: Length Of Key
     public static boolean wordBreak(String key){

         if (key.length() ==0){
             return true;
         }
         for (int i=1; i<=key.length(); i++){
             //Substring(beg idx, last, idx)
             if (search(key.substring(0,i)) && wordBreak(key.substring(i))){
                 //search for this first
                 return true;
             }

         }
         return false;
     }
    public static void main(String[] args) {
//        String words[]= {"the", "a", "there", "their", "any", "thee"};
        String arr[]= {"i", "like", "sam", "samsung", "ice"};

        for (int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
        String key = "ilikesamsungice";
        System.out.println(wordBreak(key));
//        System.out.println(search("thee"));
//        System.out.println(search("thor"));
    }
}
