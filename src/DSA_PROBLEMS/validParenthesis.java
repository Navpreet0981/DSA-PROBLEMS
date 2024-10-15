package DSA_PROBLEMS;

import java.util.Stack;

public class validParenthesis {
    public static boolean isValid(String str){ //O(n)
        Stack<Character> s =new Stack<>();
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            //Opening
            if (ch == '(' || ch == '{' || ch =='['){
                s.push(ch);
            }else {
                if (s.empty()){
                    return false;
                }
                if ((s.peek() == '(' && ch ==')')
                    ||(s.peek() == '{'&& ch == '}')
                        ||(s.peek() == '['&& ch == ']')){
                    s.pop();
                }
                else {
                    return false;

                }

                }
            }
        if (s.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean isDuplicate(String str){//O(n)
        Stack<Character> s =new Stack<>();
        for (int i =0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //Closing
            if (ch == ')'){
                int count =0;
                 while( s.peek() != '('){
                    s.pop();
                    count++;
                }
                if (count < 1){
                    return true;
                }else {
                    s.pop();
                }
            }else {
                s.push(ch);
            }

            //Opening, Operator, Operand

        }
        return false;
    }
    public static void main(String[] args) {
    String str = "({})[]";//True
    String str2 = "({})[](}";//False

       // System.out.println(isValid(str));
        //System.out.println(isValid(str2));

        String str3 = "((a+b))";//True
        String str4 = "(a-b)"; //False
        System.out.println(isDuplicate(str3));
        System.out.println(isDuplicate(str4));




    }

}
