package Coding.src.Arrays.Stack;

import java.util.Scanner;
import java.util.Stack;
import java.util.stream.StreamSupport;

class Infix_to_Postfix {

    static String convert(String exp){
        Stack<Character> stack=new Stack<>();
        String result="";
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result+=ch;
            }else if(ch=='('){
                stack.push(ch);
            }else if(ch==')') {
                while (stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && preced(ch) <= preced(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
    static int preced(char c){
        if(c=='+'||c=='-') return 1;
        if(c=='*'||c=='/') return 2;
        if(c=='^')return 3;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.print(convert(exp));
    }
}