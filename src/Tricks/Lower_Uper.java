package Tricks;

public class Lower_Uper {
    public static void main(String[] args) {
        String line = "Hello How Are You";

        System.out.println("\nTo Upper Case");
        for(char ch : line.toCharArray()){
            if(Character.isLowerCase(ch)){
                ch &= ~32;
            }
                System.out.print(ch);
        }

        System.out.println("\nTo lower case");
        for(char ch : line.toCharArray()) {
            if (Character.isUpperCase((ch))) {
                ch |= 32;
            }
            System.out.print(ch);
        }
        System.out.println("\nToggle");
        for(char ch : line.toCharArray()){
            if(Character.isLetter(ch)){
                ch ^= 32;
            }
            System.out.print(ch);
        }
    }
}
