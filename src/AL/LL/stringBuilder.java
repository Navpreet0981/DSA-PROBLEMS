package AL.LL;

public class stringBuilder {

    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("");

        for(char ch ='a'; ch<='z'; ch++){
            st.append(ch);
        }

        //O(26)  Using String Builders
        //O(26*n^2) for simple strings
        System.out.println(st);
    }
    
}
