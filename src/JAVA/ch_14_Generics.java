package JAVA;
import java.util.ArrayList;
public class ch_14_Generics {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList(); /*DEFINING THE INTEGER TYPE DATA TYOE TO ALL OF THE ARRAY-LIST
            PROVIDES THE CONCEPT OG GENERICS AND THE GENERICS ARE DEFINED BY THE USER WHILE CREATING THE ARRAY-LIST*/
        // arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(645);
        int a = arrayList.get(2);
    }
}
