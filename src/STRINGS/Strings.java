package STRINGS;

public class Strings {

    public static void PrintLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("XYZ");
        // // Strings are immutable
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string:");
        // String nameString = sc.nextLine();
        // System.out.println(nameString);
        // sc.close();                     // It is a good practice to close the Scanner

        // String fullName = "Navpreet Singh";
        // System.out.println(fullName.length());

        //Concatenation
        String FirstName ="Navpreet";
        String LastName = "Singh"; 
        String fullName = FirstName +" "+ LastName;
        // System.out.println(fullName.charAt(1));
        PrintLetter(fullName);




    }
}
