package DSA_PROBLEMS;

public class SubString {

    public static String sub_string(String str, int si, int ei){
        String SubStr="";
        for(int i=si; i<ei; i++){
            SubStr += str.charAt(i);
        }
        return SubStr;

    }

    public static void main(String[] args) {
        String str= "HelloWorld";

        System.out.println(sub_string(str, 0, 5));
        System.out.println(str.substring(0, 5));
    }
    
}
