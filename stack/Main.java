package stack;

import java.util.*;

public class Main {

    public static boolean checkDuplicate(String str){
        int n = str.length();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i<n; i++){
            char ch = str.charAt(i);

            if(ch == ')'){
               if(st.top() == '('){ //nothing between opening & closing brackets
                return true; //duplicate
               }
               while(st.top() != "("){
                st.pop();
               }
               st.pop();
            } else{
                st.push(ch);
            }
        }
    }
    
    public static void calculateInfix(String str){
        Stack<Character>operands = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                operands.push(ch-'0');
            }
        }
    }
    public static void prefToPostfix(String infix){
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<String> operators = new Stack<>();

        for(int i = 0; i<infix.length(); i++)(
            char ch = infix.charAt(i);

            if(ch =='+' || ch =='-'|| ch=='*'||ch=='/'){
                while(operators.size()>0 && operators.peek()!='(' && precedence(operators.peek())>= precedence(ch))
            }
        )
    }
    public static void main(String[] args) {
        // checkDuplicate("(((a+(b)))+(c+d))");
        calculateInfix("6+5/7*(89-3+5)/9")
        prefToPostfix("a+b*(c^d-e)^(f+g*h)-i");
    }
    
}
