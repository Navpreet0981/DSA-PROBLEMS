package JAVA;
enum status{
    Running, Failed, Pending, Success;
}

public class enumeration {
    public static void main(String[] args) {

        status s;
        System.out.println("All Values Of The Enus Is:- ");

        // Using Value() Method To Print All Values In The Enum
        status S[] = status.values();
        System.out.println(S);

        // Using Valuesof() Method To Print Particular Value A From The String
        s = status.valueOf("Failed");
        System.out.println("S Contains" + s);
        
    }
    
    
}
